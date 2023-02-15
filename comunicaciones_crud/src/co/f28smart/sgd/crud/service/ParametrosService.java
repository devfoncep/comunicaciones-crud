package co.f28smart.sgd.crud.service;

import co.f28smart.sgd.crud.entity.Folderfiles;
import co.f28smart.sgd.crud.entity.Folderfolders;
import co.f28smart.sgd.crud.entity.Requisito;
import co.f28smart.sgd.crud.entity.SgdEntidad;
import co.f28smart.sgd.crud.entity.SgdPais;
import co.f28smart.sgd.crud.entity.SgdRemitente;
import co.f28smart.sgd.crud.entity.SgdTipoReqTramite;
import co.f28smart.sgd.crud.entity.SgdTipoTramite;
import co.f28smart.sgd.crud.facade.ComunicacionesServiceFacade;
import co.f28smart.sgd.crud.facade.WebCCServiceFacade;

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
    private String FONDO_DOCUMENTAL_ID = "1";

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
    private List<SelectItem> parentescos = new ArrayList<>();
    private List<SelectItem> gruposValor = new ArrayList<>();
    private List<Requisito> requisitosTramite = new ArrayList<>();
    private List<SelectItem> tiposCanal = new ArrayList<>();
    private List<SelectItem> lstLocalidad = new ArrayList<>();
    private List<SelectItem> lstUpz = new ArrayList<>();
    private List<SelectItem> lstBarrio = new ArrayList<>();
    private List<SelectItem> lstIdioma = new ArrayList<>();
    private List<SelectItem> fondosDocumentales = new ArrayList<>();

    final ComunicacionesServiceFacade comunicacionesService;
    final WebCCServiceFacade webCCServiceFacade;


    public ParametrosService(String ridcPropertiesFileName) {
        super();
        logger = Logger.getLogger(this.getClass().getSimpleName());
        logger.debug("# " + this.getClass().getSimpleName());
        comunicacionesService = new ComunicacionesServiceFacade();
        webCCServiceFacade = new WebCCServiceFacade();

        Properties ridcProperties = new Properties();
        String ruta = System.getProperty("user.dir") + "/config/SGD/" + ridcPropertiesFileName;
        InputStream input = null;
        try {
            input = new FileInputStream(ruta);
            ridcProperties.load(input);
        } catch (FileNotFoundException e) {
            logger.error("Archivo " + ruta + " no encontrado", e);
        } catch (IOException e) {
            logger.error("Error al leer el archivo " + ruta, e);
        }

        Object o = ridcProperties.get("ROOTFFOLDERGUID");
        logger.debug("properties.ROOTFFOLDERGUID :" + o);
        if (o != null)
            this.ROOTFFOLDERGUID = o.toString();
        
    
        loadCategorias(ROOTFFOLDERGUID);

        Object fdid = ridcProperties.get("FONDODOCUMENTALID");       
        if(fdid!= null)
            this.FONDO_DOCUMENTAL_ID = fdid.toString();

        loadTipoTramites();
        loadTipoEnvios();
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
        loadGruposValor();
        loadParentescos();
        loadIdiomas();
        loadFondosDocumentales();
    }

    private void loadFondosDocumentales() {
        this.fondosDocumentales = webCCServiceFacade.getFoncepTbFondosDocumentales()
                                                    .stream()
                                                    .map(p -> new SelectItem(p.getId(), p.getFondo()))
                                                    .collect(Collectors.toList());
    }

    private void LoadTiposDocumentales(Integer idSubSerieDocumental) {

        this.tiposDocumentales = new ArrayList<SelectItem>();
        this.tiposDocumentales = webCCServiceFacade.getTiposDocumentalesBySubSerie(idSubSerieDocumental)
                                                   .stream()
                                                   .map(p -> new SelectItem(p.getIdtipodocumental(), p.getTipodocumental()))
                                                   .collect(Collectors.toList());

    }

    private void loadTiposDocumentales() {
        this.tiposDocumentales.add(new SelectItem(1, "Tipo documental 1"));
        this.tiposDocumentales.add(new SelectItem(2, "Tipo documental 2"));
        this.tiposDocumentales.add(new SelectItem(3, "Tipo documental 3"));
        this.tiposDocumentales.add(new SelectItem(4, "Tipo documental 4"));
        this.tiposDocumentales.add(new SelectItem(5, "Tipo documental 5"));
    }


    private void loadEntidades() {
        this.entidades = comunicacionesService.getSgdEntidadFindAll()
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
        this.poblacionVulnerable = comunicacionesService.getSgdPoblacionVulnerableFindAll()
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
        for (SgdPais pais : comunicacionesService.getSgdPaisFindAll()) {
            paises.add(new SelectItem(pais.getId(), pais.getNombre()));
        }
        /*this.paises = comunicacionesService.getSgdPaisFindAll()
                                           .stream()
                                           .map(p -> new SelectItem(p.getId(), p.getNombre()))
                                           .collect(Collectors.toList());*/
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

    public SgdTipoTramite getTipoTramiteById(Integer id) {
        try {
            return comunicacionesService.getSgdTipoTramiteFindById(id);
        } catch (Exception e) {
            logger.error("ParametrosService getTipoTramiteById Exception", e);
            return null;
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

    public void loadIdiomas() {
        try {
            this.lstIdioma = comunicacionesService.getSgdIdiomaComFindAll()
                                                  .stream()
                                                  .map(p -> new SelectItem(p.getIdIdiomaCom(), p.getNombre()))
                                                  .collect(Collectors.toList());
        } catch (Exception e) {
            logger.error("loadIdiomas -> Error al obtener los tipos de envío de la BD", e);
            this.lstIdioma.add(new SelectItem(2, "Otro"));
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
        categorias = new ArrayList<SelectItem>();
        for (Folderfolders folder : webCCServiceFacade.getFolderfoldersFindByParent(guid)) {
            categorias.add(new SelectItem(folder.getFfolderguid(), folder.getFfoldername()));
        }
        /*this.categorias = webCCServiceFacade.getFolderfoldersFindByParent(guid)
                                            .stream()
                                            .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                            .collect(Collectors.toList());*/
    }

    private void loadProcesos(String fParentGUID) {
        procesos = new ArrayList<SelectItem>();
        for (Folderfolders folder : webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)) {
            procesos.add(new SelectItem(folder.getFfolderguid(), folder.getFfoldername()));
        }
        /*this.procesos = webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)
                                          .stream()
                                          .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                          .collect(Collectors.toList());*/
    }

    private void loadSeries(String fParentGUID) {
        series = new ArrayList<SelectItem>();
        for (Folderfolders folder : webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)) {
            series.add(new SelectItem(folder.getFfolderguid(), folder.getFfoldername()));
        }
        /*this.series = webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)
                                        .stream()
                                        .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                        .collect(Collectors.toList());*/
    }

    private void loadSubseries(String fParentGUID) {
        subseries = new ArrayList<SelectItem>();
        for (Folderfolders folder : webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)) {
            subseries.add(new SelectItem(folder.getFfolderguid(), folder.getFfoldername()));
        }
        /*this.subseries = webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)
                                           .stream()
                                           .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                           .collect(Collectors.toList());*/
    }

    private void loadExpedientes(String fParentGUID) {
        expedientes = new ArrayList<SelectItem>();
        for (Folderfolders folder : webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)) {
            expedientes.add(new SelectItem(folder.getFfolderguid(), folder.getFfoldername()));
        }
        /*this.expedientes = webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)
                                             .stream()
                                             .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                             .collect(Collectors.toList());*/
    }
    
    public List<SelectItem> getSubFolders(String fParentGUID) {
        List<SelectItem> subFolders;
        subFolders = new ArrayList<>();
        for (Folderfolders folder : webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)) {
            subFolders.add(new SelectItem(folder.getFfolderguid(), folder.getFfoldername()));
        }
        /*this.subseries = webCCServiceFacade.getFolderfoldersFindByParent(fParentGUID)
                                           .stream()
                                           .map(p -> new SelectItem(p.getFfolderguid(), p.getFfoldername()))
                                           .collect(Collectors.toList());*/
        return subFolders;
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

    public List<SelectItem> getMunicipioDepartamentos(Integer codigoDepartamento) {
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

            this.dependencias.add(new SelectItem("1", "DEPENDENCIA_Test1"));
            this.dependencias.add(new SelectItem("2", "DEPENDENCIA_Test2"));
            this.dependencias.add(new SelectItem("3", "DEPENDENCIA_Test3"));

        } catch (Exception e) {
            logger.error("Error al recuperar las dependencias de la BD", e);

            this.dependencias.add(new SelectItem("1", "DEPENDENCIA_Test1"));
            this.dependencias.add(new SelectItem("2", "DEPENDENCIA_Test2"));
            this.dependencias.add(new SelectItem("3", "DEPENDENCIA_Test3"));
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

    public List<SelectItem> getUsuarios(Integer codDependencia) {
        List<SelectItem> usuarios = new ArrayList<>();
        usuarios = comunicacionesService.getSgdUsuarioFindByDependencia(codDependencia)
                                        .stream()
                                        .map(p -> new SelectItem(p.getIdUsuario(), p.getNombreUsuario()))
                                        .collect(Collectors.toList());
        return usuarios;

    }

    public List<SelectItem> getUsuariosAprobadores(Integer codDependencia) {
        List<SelectItem> usuarios = new ArrayList<>();
        usuarios = comunicacionesService.getSgdUsuarioFindByApprovers(codDependencia)
                                        .stream()
                                        .map(p -> new SelectItem(p.getIdUsuario(), p.getNombreUsuario()))
                                        .collect(Collectors.toList());
        return usuarios;
    }

    public List<SelectItem> getTipoCanalesByTipoCom(String tipoCom) {
        //F -> Fisica, E -> Electronica
        if ("F".equals(tipoCom)) {
            tiposCanal.clear();
            tiposCanal.add(new SelectItem(1, "Empresa Mensajeria"));
            tiposCanal.add(new SelectItem(2, "Presencial"));
        } else {
            tiposCanal.clear();
            tiposCanal.add(new SelectItem(3, "Mail"));
            tiposCanal.add(new SelectItem(4, "Pagina Web"));
            tiposCanal.add(new SelectItem(5, "Redes Sociales"));
            tiposCanal.add(new SelectItem(6, "Telefonico"));
        }
        return tiposCanal;
    }

    public List<SelectItem> getLocalidades() {

        lstLocalidad.add(new SelectItem(1, "Localidad 1"));
        lstLocalidad.add(new SelectItem(2, "Localidad 2"));
        lstLocalidad.add(new SelectItem(3, "Localidad 3"));

        return lstLocalidad;
    }

    public List<SelectItem> getUPZs() {

        lstUpz.add(new SelectItem(1, "UPZ 1"));
        lstUpz.add(new SelectItem(2, "UPZ 2"));
        lstUpz.add(new SelectItem(3, "UPZ 3"));

        return lstUpz;
    }

    public List<SelectItem> getBarrios() {

        lstBarrio.add(new SelectItem(1, "Barrio 1"));
        lstBarrio.add(new SelectItem(2, "Barrio 2"));
        lstBarrio.add(new SelectItem(3, "Barrio 3"));

        return lstBarrio;
    }


    public List<Requisito> getTipoReqTramiteByTipoTramite(final Integer idTipoTramite) {
        try {
            return comunicacionesService.getSgdTipoReqTramiteFindByTipoTramite(idTipoTramite)
                                        .stream()
                                        .map(p -> new Requisito(p.getId(), p.getCodigo() + "-" + p.getNombre(), false))
                                        .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error al obtener los tipos de requisitos tramite de la BD", e);

            requisitosTramite.add(new Requisito(0, "4333.1 - Formulario unico de solicitudes prestacionales", false));
            requisitosTramite.add(new Requisito(1,
                                                "4333.2 - Copia del documento de identidad del solicitante por ambos lados",
                                                false));
            requisitosTramite.add(new Requisito(2, "4333.3 - Registro civil de nacimiento del causante", false));
            return requisitosTramite;
        }
    }


    private void loadGruposValor() {
        this.gruposValor = comunicacionesService.getSgdGruposValorFindAll()
                                                .stream()
                                                .map(p -> new SelectItem(p.getId(), p.getNombre()))
                                                .collect(Collectors.toList());
    }

    private void loadParentescos() {
        this.parentescos = comunicacionesService.getSgdParentescoFindAll()
                                                .stream()
                                                .map(p -> new SelectItem(p.getId(), p.getNombre()))
                                                .collect(Collectors.toList());
    }

    public List<SgdEntidad> getEntidadesByNitName(Integer nit, String name) {

        return comunicacionesService.getSgdEntidadFindByNameNit(nit, name);
    }

    public List<SgdRemitente> getRemitentesByIdName(String id, String name) {

        return comunicacionesService.getSgdRemitenteFindByIdNombre(id, name);
    }

    public void setParentescos(List<SelectItem> parentescos) {
        this.parentescos = parentescos;
    }

    public List<SelectItem> getParentescos() {
        return parentescos;
    }

    public void setGruposValor(List<SelectItem> gruposValor) {
        this.gruposValor = gruposValor;
    }

    public List<SelectItem> getGruposValor() {
        return gruposValor;
    }

    public void setRequisitosTramite(List<Requisito> requisitosTramite) {
        this.requisitosTramite = requisitosTramite;
    }

    public List<Requisito> getRequisitosTramite() {
        return requisitosTramite;
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

    public WebCCServiceFacade getWebCCServiceFacade() {
        return webCCServiceFacade;
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


    public void setROOTFFOLDERGUID(String ROOTFFOLDERGUID) {
        this.ROOTFFOLDERGUID = ROOTFFOLDERGUID;
    }

    public String getROOTFFOLDERGUID() {
        return ROOTFFOLDERGUID;
    }


    public void setFONDO_DOCUMENTAL_ID(String FONDO_DOCUMENTAL_ID) {
        this.FONDO_DOCUMENTAL_ID = FONDO_DOCUMENTAL_ID;
    }

    public String getFONDO_DOCUMENTAL_ID() {
        return FONDO_DOCUMENTAL_ID;
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

    public List<SelectItem> getLstIdioma() {
        return lstIdioma;
    }

    public List<SelectItem> getTiposDocumentalesByCategorizacion(String unidadProductora, String serie,
                                                                 String subSerie) {
        this.LoadTiposDocumentales(this.getIdSubSerieDocumentalByTitulosCategorizacion(unidadProductora, serie,
                                                                                       subSerie));
        return this.tiposDocumentales;

    }

    private Integer getIdSubSerieDocumentalByTitulosCategorizacion(String unidadProductora, String serie,
                                                                   String subSerie) {
        logger.debug("getting idSubSerieDocumental from /" + unidadProductora + "/" + serie + "/" + subSerie);
        Integer idSubSerieDocumental = null;
        if (unidadProductora != null && unidadProductora.length() > 0 && serie != null && serie.length() > 0 &&
            subSerie != null && subSerie.length() > 0) {
            logger.debug("Codes : {codigoUnidadProductora :" +
                         unidadProductora.substring(0, unidadProductora.indexOf(' ')) + ", codigoSerieDocumental : " +
                         serie.substring(0, serie.indexOf(' ')) + "," + " codigoSubSerieDocumental : " +
                         subSerie.substring(0, subSerie.indexOf(' ')) + "}");
            Integer codigoUnidadProductora =
                Integer.valueOf(unidadProductora.substring(0, unidadProductora.indexOf(' ')));
            Integer codigoSerieDocumental = Integer.valueOf(serie.substring(0, serie.indexOf(' ')));
            Integer codigoSubSerieDocumental = Integer.valueOf(subSerie.substring(0, subSerie.indexOf(' ')));

            if (codigoUnidadProductora != null && codigoSerieDocumental != null && codigoSubSerieDocumental != null) {

                Integer idUnidadProductora = webCCServiceFacade.getIdUnidadProductora(codigoUnidadProductora);
                Integer idSerieDocumental = null;
                if (idUnidadProductora != null)
                    idSerieDocumental =
                        webCCServiceFacade.getIdSerieDocumental(codigoSerieDocumental, idUnidadProductora);

                if (idSerieDocumental != null)
                    idSubSerieDocumental =
                        webCCServiceFacade.getIdSubSerieDocumental(codigoSubSerieDocumental, idSerieDocumental);

            }


        }
        return idSubSerieDocumental;
    }

    public List<SelectItem> getFondosDocumentales() {
        return fondosDocumentales;
    }

    public List<SelectItem> getUnidadesProductorasByIdFondo(Integer id) {
        if (id != null) {
            return webCCServiceFacade.getUnidadesProductorasByIdFondo(id)
                                     .stream()
                                     .map(p -> new SelectItem(p.getIdunidad(), p.getUnidad()))
                                     .collect(Collectors.toList());
        } else {
            return new ArrayList<SelectItem>();
        }
    }

    public List<SelectItem> getSerieDocumentalesByIdUnidadProductora(Integer id) {
        if (id != null) {
            return webCCServiceFacade.getSerieDocumentalesByIdUnidadProductora(id)
                                     .stream()
                                     .map(p -> new SelectItem(p.getIdseriedocumental(), p.getSeriedocumental()))
                                     .collect(Collectors.toList());
        } else {
            return new ArrayList<SelectItem>();
        }

    }

    public List<SelectItem> getSubSeriesDocumentalesByIdSerie(Integer id) {
        if (id != null) {
            return webCCServiceFacade.getSubSeriesDocumentalesByIdSerie(id)
                                     .stream()
                                     .map(p -> new SelectItem(p.getIdsubserie(), p.getSubserie()))
                                     .collect(Collectors.toList());
        } else {
            return new ArrayList<SelectItem>();
        }
    }

    public List<SelectItem> getTiposDocumentalesBySubSerie(Integer id) {
        if (id != null) {
            return webCCServiceFacade.getTiposDocumentalesBySubSerie(id)
                                     .stream()
                                     .map(p -> new SelectItem(p.getIdtipodocumental(), p.getTipodocumental()))
                                     .collect(Collectors.toList());
        } else {
            return new ArrayList<SelectItem>();
        }

    }

    public List<SelectItem> getOptionsForMetadata(String key) {
        if (key != null && !key.isEmpty()) {
            return webCCServiceFacade.getOpcionesByKey(key)
                                     .stream()
                                     .map(p -> new SelectItem(p.getDoption(), p.getDoption()))
                                     .collect(Collectors.toList());
        } else {
            return new ArrayList<SelectItem>();
        }
    }
    public String getFileParentFolderGUIDByDDocName(String dDocName){
        try{
            Folderfiles file = this.webCCServiceFacade.getFolderfilesByDDocName(dDocName);    
            if(file!= null)
                return file.getFparentguid();

        }catch (Exception e){
            logger.error("Error al obtener el parentGUID del documento con dDocName :"+dDocName);
            return null;
        }
        return null;
    }
    
    public List<SelectItem> getDependenciasActosAdmin(Integer codigoDependencia,Integer idTipoComInterna){
        return comunicacionesService.getDependenciasActosAdminByCodDepAndIdTipoComInt(codigoDependencia, idTipoComInterna)
                                   .stream().map(d -> new SelectItem(d.getCodigoDependencia(), d.getDependencia()))
                                   .collect(Collectors.toList());
    }
}


