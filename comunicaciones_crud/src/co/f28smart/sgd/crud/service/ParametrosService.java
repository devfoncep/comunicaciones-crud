package co.f28smart.sgd.crud.service;


import co.f28smart.sgd.crud.entity.Folderfolders;
import co.f28smart.sgd.crud.entity.SgdEntidad;
import co.f28smart.sgd.crud.entity.SgdPoblacionVulnerable;
import co.f28smart.sgd.crud.entity.SgdRemitente;
import co.f28smart.sgd.crud.entity.SgdTipoTramite;
import co.f28smart.sgd.crud.facade.ComunicacionesServiceFacade;

import co.f28smart.sgd.crud.facade.WebCCServiceFacade;

import com.oracle.wls.shaded.org.apache.bcel.generic.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;

import java.util.Properties;
import java.util.stream.Collectors;

import javax.faces.model.SelectItem;

import org.apache.log4j.Logger;

public class ParametrosService {
    private Logger logger;

    private String ROOTFFOLDERGUID = "E26ECFA5F5CEC2EE3888DE55739BE9F4";

    private List<SelectItem> tipoTramites = new ArrayList<>();
    private List<SelectItem> tipoEnvios = new ArrayList<>();
    private List<SelectItem> tipoAnexosFisicos = new ArrayList<>();
    private List<SelectItem> categorias = new ArrayList<>();
    private List<SelectItem> procesos = new ArrayList<>();
    private List<SelectItem> series = new ArrayList<>();
    private List<SelectItem> subseries = new ArrayList<>();
    private List<SelectItem> expedientes = new ArrayList<>();
    private List<SelectItem> dependencias = new ArrayList<>();
    private List<SelectItem> accionesRespuesta = new ArrayList<>();
    private List<SelectItem> tipoComInterna = new ArrayList<>();
    private List<SelectItem> tipoIdentificacion = new ArrayList<>();
    private List<SelectItem> departamentos = new ArrayList<>();
    private List<SelectItem> paises = new ArrayList<>();
    private List<SelectItem> tipoEmpresas = new ArrayList<>();
    private List<SelectItem> poblacionVulnerable = new ArrayList<>();
    private List<SelectItem> etnias = new ArrayList<>();
    private List<SelectItem> rangoEdades = new ArrayList<>();
    private List<SelectItem> entidades = new ArrayList<>();
    private List<SelectItem> tiposDocumentales = new ArrayList<>();



    final ComunicacionesServiceFacade comunicacionesService;
    final WebCCServiceFacade webCCServiceFacade = new WebCCServiceFacade();


    public ParametrosService(String ridcPropertiesFileName) {
        super();
        logger = Logger.getLogger(this.getClass().getSimpleName());
        logger.debug("# " + this.getClass().getSimpleName());
        
        Properties ridcProperties = new Properties();
        String ruta = System.getProperty("user.dir") + "/config/SGD/"+ridcPropertiesFileName;
        InputStream input = null;
        try{
            input = new FileInputStream(ruta);
            ridcProperties.load(input);
        } catch (FileNotFoundException e) {
            logger.error("Archivo "+ruta+" no encontrado",e);
        } catch (IOException e) {
            logger.error("Error al leer el archivo "+ruta,e);
        }
        Object o = ridcProperties.get("ROOTFFOLDERGUID");

        comunicacionesService = new ComunicacionesServiceFacade();

        loadTipoTramites();
        loadTipoEnvios();
        if(o!= null){
            logger.debug("ROOTFFOLDERGUID :"+o);
            loadCategorias(o.toString());
        }else{
            loadCategorias(ROOTFFOLDERGUID);
        }

        loadDependencias();
        loadTipoAnexosFisicos();
        loadAccionesRespuesta();
        loadTipoComInterna();
        loadTipoIdentificacion();
        loadDepartamentos();
        loadPaises();
        loadTipoEmpresas();
        loadPoblacionVulnerable();
        loadEtnias();
        loadRangoEdades();
        loadTiposDocumentales();

    }
    
    private void loadTiposDocumentales() {
        this.tiposDocumentales.add(new SelectItem(1, "Tipo documental 1"));
        this.tiposDocumentales.add(new SelectItem(2, "Tipo documental 2"));
        this.tiposDocumentales.add(new SelectItem(3, "Tipo documental 3"));
        this.tiposDocumentales.add(new SelectItem(4, "Tipo documental 4"));
        this.tiposDocumentales.add(new SelectItem(5, "Tipo documental 5"));
    }
    

    private void loadEntidades() {
        this.rangoEdades = comunicacionesService.getSgdEntidadFindAll()
                                                .stream()
                                                .map(p -> new SelectItem(p.getIdEntidad(), p.getNombre()))
                                                .collect(Collectors.toList());
    }

    private void loadRangoEdades() {
        this.rangoEdades = comunicacionesService.getSgdRangoEdadFindAll()
                                                .stream()
                                                .map(p -> new SelectItem(p.getIdRangoEdad(), p.getDescripcion()))
                                                .collect(Collectors.toList());
    }

    private void loadEtnias() {
        this.etnias = comunicacionesService.getSgdEtniaFindAll()
                                           .stream()
                                           .map(p -> new SelectItem(p.getIdEtnia(), p.getNombre()))
                                           .collect(Collectors.toList());
    }

    private void loadPoblacionVulnerable() {
        this.poblacionVulnerable =
            comunicacionesService.getSgdPoblacionVulnerableFindAll()
                                                        .stream()
                                                        .map(p -> new SelectItem(p.getIdPoblacionVulnerable(), p.getNombre()))
                                 .collect(Collectors.toList());

    }

    private void loadTipoEmpresas() {
        this.tipoEmpresas = comunicacionesService.getSgdTipoEmpresaFindAll()
                                                 .stream()
                                                 .map(p -> new SelectItem(p.getIdTipoEmpresa(), p.getNombre()))
                                                 .collect(Collectors.toList());

    }

    private void loadPaises() {
        this.paises = comunicacionesService.getSgdPaisFindAll()
                                           .stream()
                                           .map(p -> new SelectItem(p.getId(), p.getNombre()))
                                           .collect(Collectors.toList());
    }

    private void loadTipoTramites() {
        try {
            this.tipoTramites = comunicacionesService.getSgdTipoTramiteFindAll()
                                                     .stream()
                                                     .map(p -> new SelectItem(p.getIdTipoTramite(), p.getNombre()))
                                                     .collect(Collectors.toList());
        } catch (Exception e) {
            logger.error("Error a listar los tipos de Tramites desde BD", e);
            this.tipoTramites.add(new SelectItem(0, "Memorando"));
            this.tipoTramites.add(new SelectItem(1, "Memorando Circular"));
            this.tipoTramites.add(new SelectItem(2, "Circular Interna"));

        }
    }

    private void loadTipoComInterna() {
        try {
            this.tipoComInterna = comunicacionesService.getSgdTipoComInternaFindAll()
                                                       .stream()
                                                       .map(p -> new SelectItem(p.getIdTipoComInterna(), p.getNombre()))
                                                       .collect(Collectors.toList());
        } catch (Exception e) {
            logger.error("Error a listar los tipos de comunicaciones internas desde BD", e);
            this.tipoComInterna.add(new SelectItem(0, "MEMORANDO"));
            this.tipoComInterna.add(new SelectItem(1, "MEMORANDO CIRCULAR"));
            this.tipoComInterna.add(new SelectItem(2, "CIRCULAR INTERNA"));

        }
    }

    private void loadTipoEnvios() {
        try {
            this.tipoEnvios = comunicacionesService.getSgdTipoEnvioFindAll()
                                                   .stream()
                                                   .map(p -> new SelectItem(p.getIdTipoEnvio(), p.getNombre()))
                                                   .collect(Collectors.toList());
        } catch (Exception e) {
            // TODO: Add catch code
            logger.error("Error al obtener los tipos de envío de la BD", e);
            this.tipoEnvios.add(new SelectItem(0, "Otro"));
            this.tipoEnvios.add(new SelectItem(1, "Correspondencia"));
        }
    }

    private void loadCategorias(String guid) {
        this.categorias = webCCServiceFacade.getFolderfoldersFindByParent(guid)
                                            .stream()
                                            .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                            .collect(Collectors.toList());
    }

    private void loadProcesos(String fParentGUID) {

        this.procesos = webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)
                                          .stream()
                                          .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                          .collect(Collectors.toList());


    }

    private void loadSeries(String fParentGUID) {
        this.series = webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)
                                        .stream()
                                        .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                        .collect(Collectors.toList());

    }

    private void loadSubseries(String fParentGUID) {
        this.subseries = webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)
                                           .stream()
                                           .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                           .collect(Collectors.toList());


    }

    private void loadExpedientes(String fParentGUID) {
        this.expedientes = webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)
                                             .stream()
                                             .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                             .collect(Collectors.toList());

    }

    private void loadTipoIdentificacion() {
        this.tipoIdentificacion = comunicacionesService.getSgdTipoIdentificacionFindAll()
                                                       .stream()
                                                       .map(p -> new SelectItem(p.getIdTipoIdentificacion(), p.getNombre()))
                                                       .collect(Collectors.toList());
    }

    private void loadDepartamentos() {
        this.departamentos = comunicacionesService.getSgdDepartamentoFindAll()
                                                  .stream()
                                                  .map(p -> new SelectItem(p.getIdDepartamento(), p.getNombre()))
                                                  .collect(Collectors.toList());
    }

    public List<SelectItem> getMunicipioDepartamentos(Long codigoDepartamento) {
        List<SelectItem> ciudadMunicipios = new ArrayList<>();
        if (codigoDepartamento != null) {
            ciudadMunicipios = comunicacionesService.getSgdMunicipioFindByDepto(codigoDepartamento)
                                                    .stream()
                                                    .map(p -> new SelectItem(p.getIdMunicipio(), p.getNombre()))
                                                    .collect(Collectors.toList());
        }
        
        return ciudadMunicipios;
    }

    private void loadDependencias() {

        try {
            this.dependencias = comunicacionesService.getSgdDependenciaFindDependencias()
                                                     .stream()
                                                     .map(p -> new SelectItem(p.getCodigoDependencia(), p.getDependencia()))
                                                     .collect(Collectors.toList());
        } catch (NumberFormatException nfe) {
            // TODO: Add catch code
            logger.error("Error al recuperar las dependencias de la BD", nfe);

            this.dependencias.add(new SelectItem(1, "DEPENDENCIA_Test1"));
            this.dependencias.add(new SelectItem(2, "DEPENDENCIA_Test2"));
            this.dependencias.add(new SelectItem(3, "DEPENDENCIA_Test3"));


        } catch (Exception e) {
            logger.error("Error al recuperar las dependencias de la BD", e);

            this.dependencias.add(new SelectItem(1, "DEPENDENCIA_Test1"));
            this.dependencias.add(new SelectItem(2, "DEPENDENCIA_Test2"));
            this.dependencias.add(new SelectItem(3, "DEPENDENCIA_Test3"));

        }


    }

    private void loadTipoAnexosFisicos() {
        try {
            this.tipoAnexosFisicos = comunicacionesService.getSgdTipoAnexoFisicoFindAll()
                                                          .stream()
                                                          .map(p -> new SelectItem(p.getIdTipoAnexoFisico(), p.getNombre()))
                                                          .collect(Collectors.toList());
        } catch (Exception e) {
            // TODO: Add catch code
            logger.error("Error al obtener los tipos de anexos físicos", e);

            this.tipoAnexosFisicos.add(new SelectItem(1, "Carpeta"));
            this.tipoAnexosFisicos.add(new SelectItem(2, "Carpeta"));
            this.tipoAnexosFisicos.add(new SelectItem(3, "Folio(s)"));
            this.tipoAnexosFisicos.add(new SelectItem(4, "Legajo"));
            this.tipoAnexosFisicos.add(new SelectItem(5, "Cartilla"));
            this.tipoAnexosFisicos.add(new SelectItem(6, "Sobre"));
            this.tipoAnexosFisicos.add(new SelectItem(7, "Caja"));
            this.tipoAnexosFisicos.add(new SelectItem(8, "USB"));
            this.tipoAnexosFisicos.add(new SelectItem(9, "Otro"));

        }
    }

    private void loadAccionesRespuesta() {
        try {
            this.accionesRespuesta = comunicacionesService.getSgdAccionRespuestaFindAll()
                                                          .stream()
                                                          .map(p -> new SelectItem(p.getIdAccionRespuesta(), p.getNombre()))
                                                          .collect(Collectors.toList());
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
            logger.error("Error al obtener las acciones de respuesta de la BD", e);

            this.accionesRespuesta.add(new SelectItem(1, "Flujo de aprobación"));
            this.accionesRespuesta.add(new SelectItem(2, "Ejecución Cumplida"));
            this.accionesRespuesta.add(new SelectItem(3, "No Requiere Respuesta"));
            this.accionesRespuesta.add(new SelectItem(4, "Correo Electrónico"));


        }

    }

    public List<SelectItem> getUsuarios(int codDependencia) {
        List<SelectItem> usuarios = new ArrayList<>();
        usuarios = comunicacionesService.getSgdUsuarioFindByDependencia(new Long(codDependencia))
                                        .stream()
                                        .map(p -> new SelectItem(p.getIdUsuario(), p.getNombreUsuario()))
                                        .collect(Collectors.toList());
        return usuarios;

    }
    
    public List<SelectItem> getUsuariosAprobadores(int codDependencia) {
        List<SelectItem> usuarios = new ArrayList<>();
        usuarios = comunicacionesService.getSgdUsuarioFindByApprovers(new Long(codDependencia))
                                        .stream()
                                        .map(p -> new SelectItem(p.getIdUsuario(), p.getNombreUsuario()))
                                        .collect(Collectors.toList());
        return usuarios;

    }

    public List<SelectItem> getTipoTramites() {
        return tipoTramites;
    }


    public List<SelectItem> getTipoEnvios() {
        return tipoEnvios;
    }

    public List<SelectItem> getCategorias() {
        return categorias;
    }

    public List<SelectItem> getProcesos(String fParentGUID) {
        loadProcesos(fParentGUID);
        return procesos;
    }


    public List<SelectItem> getSeries(String fParentGUID) {
        loadSeries(fParentGUID);
        return series;
    }


    public List<SelectItem> getSubseries(String fParentGUID) {
        loadSubseries(fParentGUID);
        return subseries;
    }

    public List<SelectItem> getExpedientes(String fParentGUID) {
        loadExpedientes(fParentGUID);
        return expedientes;
    }


    public List<SelectItem> getDependencias() {
        return dependencias;
    }


    public List<SelectItem> getTipoAnexosFisicos() {
        return tipoAnexosFisicos;
    }

    public List<SelectItem> getAccionesRespuesta() {
        return accionesRespuesta;
    }

    public List<SelectItem> getTipoComInterna() {
        return tipoComInterna;
    }

    public List<SelectItem> getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public List<SelectItem> getDepartamentos() {
        return departamentos;
    }

    public List<SelectItem> getPaises() {
        return paises;
    }

    public List<SelectItem> getTipoEmpresas() {
        return tipoEmpresas;
    }

    public List<SelectItem> getPoblacionVulnerable() {
        return poblacionVulnerable;
    }

    public List<SelectItem> getEtnias() {
        return etnias;
    }

    public List<SelectItem> getRangoEdades() {
        return rangoEdades;
    }

    public ComunicacionesServiceFacade getComunicacionesService() {
        return comunicacionesService;
    }

    public List<SelectItem> getEntidades() {
        return entidades;
    }


    public void setTiposDocumentales(List<SelectItem> tiposDocumentales) {
        this.tiposDocumentales = tiposDocumentales;
    }

    public List<SelectItem> getTiposDocumentales() {
        return tiposDocumentales;
    }


    public String findLabel(Object value, List<SelectItem> itemList) {
        String label = "";
        for (SelectItem si : itemList) {
            if (si.getValue().equals(value)) {
                label = si.getLabel();
                break;
            }
        }
        if (label != null && !label.isEmpty()) {
            return label;
        } else {
            return "";
        }
    }
}


