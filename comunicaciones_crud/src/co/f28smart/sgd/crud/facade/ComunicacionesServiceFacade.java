package co.f28smart.sgd.crud.facade;

import co.f28smart.sgd.crud.entity.SgdAccionRespuesta;
import co.f28smart.sgd.crud.entity.SgdAnexoComunicacion;
import co.f28smart.sgd.crud.entity.SgdCategoriaTipo;
import co.f28smart.sgd.crud.entity.SgdComunicacion;
import co.f28smart.sgd.crud.entity.SgdComunicacionPrqsAud;
import co.f28smart.sgd.crud.entity.SgdComunicacionesView;
import co.f28smart.sgd.crud.entity.SgdDepartamento;
import co.f28smart.sgd.crud.entity.SgdEntidad;
import co.f28smart.sgd.crud.entity.SgdEtnia;
import co.f28smart.sgd.crud.entity.SgdFestivo;
import co.f28smart.sgd.crud.entity.SgdInteresado;
import co.f28smart.sgd.crud.entity.SgdMunicipio;
import co.f28smart.sgd.crud.entity.SgdOcupacion;
import co.f28smart.sgd.crud.entity.SgdPais;
import co.f28smart.sgd.crud.entity.SgdPlantilla;
import co.f28smart.sgd.crud.entity.SgdPoblacionVulnerable;
import co.f28smart.sgd.crud.entity.SgdRangoEdad;
import co.f28smart.sgd.crud.entity.SgdReasignacionComAudit;
import co.f28smart.sgd.crud.entity.SgdRemitente;
import co.f28smart.sgd.crud.entity.SgdRol;
import co.f28smart.sgd.crud.entity.SgdDependencia;
import co.f28smart.sgd.crud.entity.SgdGruposValor;
import co.f28smart.sgd.crud.entity.SgdParentesco;
import co.f28smart.sgd.crud.entity.SgdTipoAnexoFisico;
import co.f28smart.sgd.crud.entity.SgdTipoComInterna;
import co.f28smart.sgd.crud.entity.SgdTipoEmpresa;
import co.f28smart.sgd.crud.entity.SgdTipoEnvio;
import co.f28smart.sgd.crud.entity.SgdTipoIdentificacion;
import co.f28smart.sgd.crud.entity.SgdTipoSolicitud;
import co.f28smart.sgd.crud.entity.SgdTipoTitulo;
import co.f28smart.sgd.crud.entity.SgdTipoTramite;
import co.f28smart.sgd.crud.entity.SgdUsuario;
import co.f28smart.sgd.crud.entity.SgdUsuarioNew;
import co.f28smart.sgd.crud.entity.SgdUsuarioRol;

import java.math.BigDecimal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ComunicacionesServiceFacade {
    private final EntityManager em;

    public ComunicacionesServiceFacade() {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("comunicacionesPU");
        em = emf.createEntityManager();
    }

    /**
     * All changes that have been made to the managed entities in the
     * persistence context are applied to the database and committed.
     */
    public void commitTransaction() {
        final EntityTransaction entityTransaction = em.getTransaction();
        if (!entityTransaction.isActive()) {
            entityTransaction.begin();
        }
        entityTransaction.commit();
    }

    public Object queryByRange(String jpqlStmt, int firstResult, int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public <T> T persistEntity(T entity) {
        em.persist(entity);
        commitTransaction();
        return entity;
    }

    public <T> T mergeEntity(T entity) {
        entity = em.merge(entity);
        commitTransaction();
        return entity;
    }

    public SgdFestivo persistSgdFestivo(SgdFestivo sgdFestivo) {
        em.persist(sgdFestivo);
        commitTransaction();
        return sgdFestivo;
    }

    public SgdFestivo mergeSgdFestivo(SgdFestivo sgdFestivo) {
        SgdFestivo entity = null;
        entity = em.merge(sgdFestivo);
        commitTransaction();
        return entity;
    }

    public void removeSgdFestivo(SgdFestivo sgdFestivo) {
        sgdFestivo = em.find(SgdFestivo.class, sgdFestivo.getIdFestivo());
        em.remove(sgdFestivo);
        commitTransaction();
    }

    public SgdAnexoComunicacion persistSgdAnexoComunicacion(SgdAnexoComunicacion sgdAnexoComunicacion) {
        em.persist(sgdAnexoComunicacion);
        commitTransaction();
        return sgdAnexoComunicacion;
    }

    public SgdAnexoComunicacion mergeSgdAnexoComunicacion(SgdAnexoComunicacion sgdAnexoComunicacion) {
        SgdAnexoComunicacion entity = null;
        entity = em.merge(sgdAnexoComunicacion);
        commitTransaction();
        return entity;
    }

    public void removeSgdAnexoComunicacion(SgdAnexoComunicacion sgdAnexoComunicacion) {
        sgdAnexoComunicacion = em.find(SgdAnexoComunicacion.class, sgdAnexoComunicacion.getIdAnexoComunicacion());
        em.remove(sgdAnexoComunicacion);
        commitTransaction();
    }

    public SgdPais persistSgdPais(SgdPais sgdPais) {
        em.persist(sgdPais);
        commitTransaction();
        return sgdPais;
    }

    public SgdPais mergeSgdPais(SgdPais sgdPais) {
        SgdPais entity = null;
        entity = em.merge(sgdPais);
        commitTransaction();
        return entity;
    }

    public void removeSgdPais(SgdPais sgdPais) {
        sgdPais = em.find(SgdPais.class, sgdPais.getId());
        em.remove(sgdPais);
        commitTransaction();
    }

    public List<SgdPais> getSgdPaisFindAll() {
        return em.createNamedQuery("SgdPais.findAll", SgdPais.class).getResultList();
        //return em.createNativeQuery("select o from SgdPais o", SgdPais.class).getResultList();
    }

    public SgdEtnia persistSgdEtnia(SgdEtnia sgdEtnia) {
        em.persist(sgdEtnia);
        commitTransaction();
        return sgdEtnia;
    }

    public SgdEtnia mergeSgdEtnia(SgdEtnia sgdEtnia) {
        SgdEtnia entity = null;
        entity = em.merge(sgdEtnia);
        commitTransaction();
        return entity;
    }

    public void removeSgdEtnia(SgdEtnia sgdEtnia) {
        sgdEtnia = em.find(SgdEtnia.class, sgdEtnia.getIdEtnia());
        em.remove(sgdEtnia);
        commitTransaction();
    }

    public List<SgdEtnia> getSgdEtniaFindAll() {
        return em.createNamedQuery("SgdEtnia.findAll", SgdEtnia.class).getResultList();
    }

    public SgdDepartamento persistSgdDepartamento(SgdDepartamento sgdDepartamento) {
        em.persist(sgdDepartamento);
        commitTransaction();
        return sgdDepartamento;
    }

    public SgdDepartamento mergeSgdDepartamento(SgdDepartamento sgdDepartamento) {
        SgdDepartamento entity = null;
        entity = em.merge(sgdDepartamento);
        commitTransaction();
        return entity;
    }

    public void removeSgdDepartamento(SgdDepartamento sgdDepartamento) {
        sgdDepartamento = em.find(SgdDepartamento.class, sgdDepartamento.getIdDepartamento());
        em.remove(sgdDepartamento);
        commitTransaction();
    }

    public List<SgdDepartamento> getSgdDepartamentoFindAll() {
        return em.createNamedQuery("SgdDepartamento.findAll", SgdDepartamento.class).getResultList();
    }

    public SgdUsuarioNew persistSgdUsuarioNew(SgdUsuarioNew sgdUsuarioNew) {
        em.persist(sgdUsuarioNew);
        commitTransaction();
        return sgdUsuarioNew;
    }

    public SgdUsuarioNew mergeSgdUsuarioNew(SgdUsuarioNew sgdUsuarioNew) {
        SgdUsuarioNew entity = null;
        entity = em.merge(sgdUsuarioNew);
        commitTransaction();
        return entity;
    }

    public void removeSgdUsuarioNew(SgdUsuarioNew sgdUsuarioNew) {
        sgdUsuarioNew = em.find(SgdUsuarioNew.class, sgdUsuarioNew.getIdUsuario());
        em.remove(sgdUsuarioNew);
        commitTransaction();
    }

    public SgdMunicipio persistSgdMunicipio(SgdMunicipio sgdMunicipio) {
        em.persist(sgdMunicipio);
        commitTransaction();
        return sgdMunicipio;
    }

    public SgdMunicipio mergeSgdMunicipio(SgdMunicipio sgdMunicipio) {
        SgdMunicipio entity = null;
        entity = em.merge(sgdMunicipio);
        commitTransaction();
        return entity;
    }

    public void removeSgdMunicipio(SgdMunicipio sgdMunicipio) {
        sgdMunicipio = em.find(SgdMunicipio.class, sgdMunicipio.getIdMunicipio());
        em.remove(sgdMunicipio);
        commitTransaction();
    }

    public List<SgdMunicipio> getSgdMunicipioFindByDepto(final Integer idDepto) {
        return em.createNamedQuery("SgdMunicipio.findByDepto", SgdMunicipio.class)
                 .setParameter("param", idDepto)
                 .getResultList();
    }

    public SgdRangoEdad persistSgdRangoEdad(SgdRangoEdad sgdRangoEdad) {
        em.persist(sgdRangoEdad);
        commitTransaction();
        return sgdRangoEdad;
    }

    public SgdRangoEdad mergeSgdRangoEdad(SgdRangoEdad sgdRangoEdad) {
        SgdRangoEdad entity = null;
        entity = em.merge(sgdRangoEdad);
        commitTransaction();
        return entity;
    }

    public void removeSgdRangoEdad(SgdRangoEdad sgdRangoEdad) {
        sgdRangoEdad = em.find(SgdRangoEdad.class, sgdRangoEdad.getIdRangoEdad());
        em.remove(sgdRangoEdad);
        commitTransaction();
    }

    public List<SgdRangoEdad> getSgdRangoEdadFindAll() {
        return em.createNamedQuery("SgdRangoEdad.findAll", SgdRangoEdad.class).getResultList();
    }

    public SgdComunicacion persistSgdComunicacion(SgdComunicacion sgdComunicacion) {
        em.persist(sgdComunicacion);
        commitTransaction();
        return sgdComunicacion;
    }

    public SgdComunicacion mergeSgdComunicacion(SgdComunicacion sgdComunicacion) {
        SgdComunicacion entity = null;
        entity = em.merge(sgdComunicacion);
        commitTransaction();
        return entity;
    }

    public void removeSgdComunicacion(SgdComunicacion sgdComunicacion) {
        sgdComunicacion = em.find(SgdComunicacion.class, sgdComunicacion.getIdComunicacion());
        em.remove(sgdComunicacion);
        commitTransaction();
    }

    public SgdPlantilla persistSgdPlantilla(SgdPlantilla sgdPlantilla) {
        em.persist(sgdPlantilla);
        commitTransaction();
        return sgdPlantilla;
    }

    public SgdPlantilla mergeSgdPlantilla(SgdPlantilla sgdPlantilla) {
        SgdPlantilla entity = null;
        entity = em.merge(sgdPlantilla);
        commitTransaction();
        return entity;
    }

    public void removeSgdPlantilla(SgdPlantilla sgdPlantilla) {
        sgdPlantilla = em.find(SgdPlantilla.class, sgdPlantilla.getIdSgdPlantilla());
        em.remove(sgdPlantilla);
        commitTransaction();
    }

    public SgdComunicacionesView persistSgdComunicacionesView(SgdComunicacionesView sgdComunicacionesView) {
        em.persist(sgdComunicacionesView);
        commitTransaction();
        return sgdComunicacionesView;
    }

    public SgdComunicacionesView mergeSgdComunicacionesView(SgdComunicacionesView sgdComunicacionesView) {
        SgdComunicacionesView entity = null;
        entity = em.merge(sgdComunicacionesView);
        commitTransaction();
        return entity;
    }

    public void removeSgdComunicacionesView(SgdComunicacionesView sgdComunicacionesView) {
        //        sgdComunicacionesView =
        //            em.find(SgdComunicacionesView.class, sgdComunicacionesView.getNroRadicado(),
        //                    sgdComunicacionesView.getNumeroIdentificacion());
        //        em.remove(sgdComunicacionesView);
        //        commitTransaction();
    }

    public SgdUsuarioRol persistSgdUsuarioRol(SgdUsuarioRol sgdUsuarioRol) {
        em.persist(sgdUsuarioRol);
        commitTransaction();
        return sgdUsuarioRol;
    }

    public SgdUsuarioRol mergeSgdUsuarioRol(SgdUsuarioRol sgdUsuarioRol) {
        SgdUsuarioRol entity = null;
        entity = em.merge(sgdUsuarioRol);
        commitTransaction();
        return entity;
    }

    public void removeSgdUsuarioRol(SgdUsuarioRol sgdUsuarioRol) {
        sgdUsuarioRol = em.find(SgdUsuarioRol.class, sgdUsuarioRol.getIdUsuarioRol());
        em.remove(sgdUsuarioRol);
        commitTransaction();
    }

    public SgdTipoIdentificacion persistSgdTipoIdentificacion(SgdTipoIdentificacion sgdTipoIdentificacion) {
        em.persist(sgdTipoIdentificacion);
        commitTransaction();
        return sgdTipoIdentificacion;
    }

    public SgdTipoIdentificacion mergeSgdTipoIdentificacion(SgdTipoIdentificacion sgdTipoIdentificacion) {
        SgdTipoIdentificacion entity = null;
        entity = em.merge(sgdTipoIdentificacion);
        commitTransaction();
        return entity;
    }

    public List<SgdTipoIdentificacion> getSgdTipoIdentificacionFindAll() {
        return em.createNamedQuery("SgdTipoIdentificacion.findAll", SgdTipoIdentificacion.class).getResultList();
    }

    public void removeSgdTipoIdentificacion(SgdTipoIdentificacion sgdTipoIdentificacion) {
        sgdTipoIdentificacion = em.find(SgdTipoIdentificacion.class, sgdTipoIdentificacion.getIdTipoIdentificacion());
        em.remove(sgdTipoIdentificacion);
        commitTransaction();
    }

    public SgdUsuario persistSgdUsuario(SgdUsuario sgdUsuario) {
        em.persist(sgdUsuario);
        commitTransaction();
        return sgdUsuario;
    }

    public SgdUsuario mergeSgdUsuario(SgdUsuario sgdUsuario) {
        SgdUsuario entity = null;
        entity = em.merge(sgdUsuario);
        commitTransaction();
        return entity;
    }

    public void removeSgdUsuario(SgdUsuario sgdUsuario) {
        sgdUsuario = em.find(SgdUsuario.class, sgdUsuario.getIdUsuario());
        em.remove(sgdUsuario);
        commitTransaction();
    }

    public List<SgdUsuario> getSgdUsuarioFindAll() {
        return em.createNamedQuery("SgdUsuario.findAll", SgdUsuario.class).getResultList();
    }

    public SgdUsuario getSgdUsuarioFindById(final String idUsuario) {
        return em.createNamedQuery("SgdUsuario.findById", SgdUsuario.class)
                 .setParameter("param", idUsuario)
                 .getSingleResult();
    }

    public List<SgdUsuario> getSgdUsuarioFindByDependencia(final Long idDependencia) {
        return em.createNamedQuery("SgdUsuario.findByDependencia", SgdUsuario.class)
                 .setParameter("param", idDependencia)
                 .getResultList();
    }

    public List<SgdUsuario> getSgdUsuarioFindByApprovers(final Long idDependencia) {
        return em.createNamedQuery("SgdUsuario.findByDependencyApprovers", SgdUsuario.class)
                 .setParameter("param", idDependencia)
                 .getResultList();
    }

    public SgdInteresado persistSgdInteresado(SgdInteresado sgdInteresado) {
        em.persist(sgdInteresado);
        commitTransaction();
        return sgdInteresado;
    }

    public SgdInteresado mergeSgdInteresado(SgdInteresado sgdInteresado) {
        SgdInteresado entity = null;
        entity = em.merge(sgdInteresado);
        commitTransaction();
        return entity;
    }

    public void removeSgdInteresado(SgdInteresado sgdInteresado) {
        sgdInteresado = em.find(SgdInteresado.class, sgdInteresado.getIdInteresado());
        em.remove(sgdInteresado);
        commitTransaction();
    }

    public SgdDependencia persistSgdDependencia(SgdDependencia sgdSubCategoria) {
        em.persist(sgdSubCategoria);
        commitTransaction();
        return sgdSubCategoria;
    }

    public SgdDependencia mergeSgdDependencia(SgdDependencia sgdSubCategoria) {
        SgdDependencia entity = null;
        entity = em.merge(sgdSubCategoria);
        commitTransaction();
        return entity;
    }

    public void removeSgdDependencia(SgdDependencia sgdSubCategoria) {
        sgdSubCategoria = em.find(SgdDependencia.class, sgdSubCategoria.getCodigoDependencia());
        em.remove(sgdSubCategoria);
        commitTransaction();
    }

    public SgdTipoSolicitud persistSgdTipoSolicitud(SgdTipoSolicitud sgdTipoSolicitud) {
        em.persist(sgdTipoSolicitud);
        commitTransaction();
        return sgdTipoSolicitud;
    }

    public SgdTipoSolicitud mergeSgdTipoSolicitud(SgdTipoSolicitud sgdTipoSolicitud) {
        SgdTipoSolicitud entity = null;
        entity = em.merge(sgdTipoSolicitud);
        commitTransaction();
        return entity;
    }

    public void removeSgdTipoSolicitud(SgdTipoSolicitud sgdTipoSolicitud) {
        sgdTipoSolicitud = em.find(SgdTipoSolicitud.class, sgdTipoSolicitud.getIdTipoSolicitud());
        em.remove(sgdTipoSolicitud);
        commitTransaction();
    }

    public List<SgdTipoSolicitud> getSgdTipoSolicitudFindAll() {
        return em.createNamedQuery("SgdTipoSolicitud.findAll", SgdTipoSolicitud.class).getResultList();
    }

    public SgdOcupacion persistSgdOcupacion(SgdOcupacion sgdOcupacion) {
        em.persist(sgdOcupacion);
        commitTransaction();
        return sgdOcupacion;
    }

    public SgdOcupacion mergeSgdOcupacion(SgdOcupacion sgdOcupacion) {
        SgdOcupacion entity = null;
        entity = em.merge(sgdOcupacion);
        commitTransaction();
        return entity;
    }

    public void removeSgdOcupacion(SgdOcupacion sgdOcupacion) {
        sgdOcupacion = em.find(SgdOcupacion.class, sgdOcupacion.getIdOcupacion());
        em.remove(sgdOcupacion);
        commitTransaction();
    }

    public List<SgdOcupacion> getSgdOcupacionFindAll() {
        return em.createNamedQuery("SgdOcupacion.findAll", SgdOcupacion.class).getResultList();
    }

    public SgdRol persistSgdRol(SgdRol sgdRol) {
        em.persist(sgdRol);
        commitTransaction();
        return sgdRol;
    }

    public SgdRol mergeSgdRol(SgdRol sgdRol) {
        SgdRol entity = null;
        entity = em.merge(sgdRol);
        commitTransaction();
        return entity;
    }

    public void removeSgdRol(SgdRol sgdRol) {
        sgdRol = em.find(SgdRol.class, sgdRol.getIdRol());
        em.remove(sgdRol);
        commitTransaction();
    }

    public SgdReasignacionComAudit persistSgdReasignacionComAudit(SgdReasignacionComAudit sgdReasignacionComAudit) {
        em.persist(sgdReasignacionComAudit);
        commitTransaction();
        return sgdReasignacionComAudit;
    }

    public SgdReasignacionComAudit mergeSgdReasignacionComAudit(SgdReasignacionComAudit sgdReasignacionComAudit) {
        SgdReasignacionComAudit entity = null;
        entity = em.merge(sgdReasignacionComAudit);
        commitTransaction();
        return entity;
    }

    public void removeSgdReasignacionComAudit(SgdReasignacionComAudit sgdReasignacionComAudit) {
        sgdReasignacionComAudit = em.find(SgdReasignacionComAudit.class, sgdReasignacionComAudit.getIdReasgCom());
        em.remove(sgdReasignacionComAudit);
        commitTransaction();
    }

    public SgdPoblacionVulnerable persistSgdPoblacionVulnerable(SgdPoblacionVulnerable sgdPoblacionVulnerable) {
        em.persist(sgdPoblacionVulnerable);
        commitTransaction();
        return sgdPoblacionVulnerable;
    }

    public SgdPoblacionVulnerable mergeSgdPoblacionVulnerable(SgdPoblacionVulnerable sgdPoblacionVulnerable) {
        SgdPoblacionVulnerable entity = null;
        entity = em.merge(sgdPoblacionVulnerable);
        commitTransaction();
        return entity;
    }

    public void removeSgdPoblacionVulnerable(SgdPoblacionVulnerable sgdPoblacionVulnerable) {
        sgdPoblacionVulnerable =
            em.find(SgdPoblacionVulnerable.class, sgdPoblacionVulnerable.getIdPoblacionVulnerable());
        em.remove(sgdPoblacionVulnerable);
        commitTransaction();
    }

    public List<SgdPoblacionVulnerable> getSgdPoblacionVulnerableFindAll() {
        return em.createNamedQuery("SgdPoblacionVulnerable.findAll", SgdPoblacionVulnerable.class).getResultList();
    }

    public SgdCategoriaTipo persistSgdCategoriaTipo(SgdCategoriaTipo sgdCategoriaTipo) {
        em.persist(sgdCategoriaTipo);
        commitTransaction();
        return sgdCategoriaTipo;
    }

    public SgdCategoriaTipo mergeSgdCategoriaTipo(SgdCategoriaTipo sgdCategoriaTipo) {
        SgdCategoriaTipo entity = null;
        entity = em.merge(sgdCategoriaTipo);
        commitTransaction();
        return entity;
    }

    public void removeSgdCategoriaTipo(SgdCategoriaTipo sgdCategoriaTipo) {
        sgdCategoriaTipo = em.find(SgdCategoriaTipo.class, sgdCategoriaTipo.getIdCategoriaTipo());
        em.remove(sgdCategoriaTipo);
        commitTransaction();
    }

    public SgdComunicacionPrqsAud persistSgdComunicacionPrqsAud(SgdComunicacionPrqsAud sgdComunicacionPrqsAud) {
        em.persist(sgdComunicacionPrqsAud);
        commitTransaction();
        return sgdComunicacionPrqsAud;
    }

    public SgdComunicacionPrqsAud mergeSgdComunicacionPrqsAud(SgdComunicacionPrqsAud sgdComunicacionPrqsAud) {
        SgdComunicacionPrqsAud entity = null;
        entity = em.merge(sgdComunicacionPrqsAud);
        commitTransaction();
        return entity;
    }

    public void removeSgdComunicacionPrqsAud(SgdComunicacionPrqsAud sgdComunicacionPrqsAud) {
        sgdComunicacionPrqsAud = em.find(SgdComunicacionPrqsAud.class, sgdComunicacionPrqsAud.getIdComunicacion());
        em.remove(sgdComunicacionPrqsAud);
        commitTransaction();
    }

    public List<SgdTipoEnvio> getSgdTipoEnvioFindAll() {
        return em.createNamedQuery("SgdTipoEnvio.findAll", SgdTipoEnvio.class).getResultList();
    }

    public List<SgdTipoAnexoFisico> getSgdTipoAnexoFisicoFindAll() {
        return em.createNamedQuery("SgdTipoAnexoFisico.findAll", SgdTipoAnexoFisico.class).getResultList();
    }

    public List<SgdAccionRespuesta> getSgdAccionRespuestaFindAll() {
        return em.createNamedQuery("SgdAccionRespuesta.findAll", SgdAccionRespuesta.class).getResultList();
    }

    public List<SgdTipoEmpresa> getSgdTipoEmpresaFindAll() {
        return em.createNamedQuery("SgdTipoEmpresa.findAll", SgdTipoEmpresa.class).getResultList();
    }

    public List<SgdTipoTitulo> getSgdTipoTituloFindAll() {
        return em.createNamedQuery("SgdTipoTitulo.findAll", SgdTipoTitulo.class).getResultList();
    }

    public List<SgdEntidad> getSgdEntidadFindAll() {
        return em.createNamedQuery("SgdEntidad.findAll", SgdEntidad.class).getResultList();
    }

    public SgdEntidad getSgdEntidadFindById(BigDecimal id) {
        return em.createNamedQuery("SgdEntidad.findById", SgdEntidad.class)
                 .setParameter("id", id)
                 .getSingleResult();
    }

    public List<SgdEntidad> getSgdEntidadFindByNameNit(int nit, String nombre) {
        String parsedString = "";
        if (nombre != null && !nombre.isEmpty()) {
            parsedString = "%" + nombre.toLowerCase().replace(' ', '%') + "%";
        }
        return em.createNamedQuery("SgdEntidad.findByNameNit", SgdEntidad.class)
                 .setParameter("nit", nit)
                 .setParameter("nombre", parsedString)
                 .getResultList();
    }

    public List<SgdRemitente> getSgdRemitenteFindAll() {
        return em.createNamedQuery("SgdEntidad.findAll", SgdRemitente.class).getResultList();
    }

    public List<SgdRemitente> getSgdRemitenteFindByIdNombre(Integer id, String nombre) {
        String parsedString = "";
        if (nombre != null && !nombre.isEmpty()) {
            parsedString = "%" + nombre.toLowerCase().replace(' ', '%') + "%";
        }
        return em.createNamedQuery("SgdRemitente.findByIdName", SgdRemitente.class)
                 .setParameter("nombre", parsedString)
                 .setParameter("id", id)
                 .getResultList();
    }

    public List<SgdTipoTramite> getSgdTipoTramiteFindAll() {
        return em.createNamedQuery("SgdTipoTramite.findAll", SgdTipoTramite.class).getResultList();
    }
    
    public SgdTipoTramite getSgdTipoTramiteFindById(Integer id) {
        return em.createNamedQuery("SgdTipoTramite.findById", SgdTipoTramite.class)
                 .setParameter("id", id)
                 .getSingleResult();
    }

    public List<SgdDependencia> getSgdDependenciaFindDependencias() {
        return em.createNamedQuery("SgdDependencia.findDependencias", SgdDependencia.class).getResultList();
    }

    public SgdDependencia getSgdDependenciaFindByID(String id) {
        return em.createNamedQuery("SgdDependencia.findById", SgdDependencia.class)
                 .setParameter("param", id)
                 .getSingleResult();
    }

    public List<SgdTipoComInterna> getSgdTipoComInternaFindAll() {
        return em.createNamedQuery("SgdTipoComInterna.findAll", SgdTipoComInterna.class).getResultList();
    }
    
    public List<SgdGruposValor> getSgdGruposValorFindAll() {
        return em.createNamedQuery("SgdGruposValor.findAll", SgdGruposValor.class).getResultList();
    }

    public List<SgdParentesco> getSgdParentescoFindAll() {
        return em.createNamedQuery("SgdParentesco.findAll", SgdParentesco.class).getResultList();
    }
}
