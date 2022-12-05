package co.f28smart.sgd.crud.facade;

import co.f28smart.sgd.crud.entity.Folderfiles;
import co.f28smart.sgd.crud.entity.Folderfolders;

import co.f28smart.sgd.crud.entity.FoncepTbFondodocumental;
import co.f28smart.sgd.crud.entity.FoncepTbSeriedocumental;
import co.f28smart.sgd.crud.entity.FoncepTbSubserie;
import co.f28smart.sgd.crud.entity.FoncepTbTipodocumental;

import co.f28smart.sgd.crud.entity.FoncepTbUnidadproductora;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

public class WebCCServiceFacade {
    private Logger logger;
    private final EntityManager em;

    public WebCCServiceFacade() {
        logger = Logger.getLogger(this.getClass().getSimpleName());
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("webccPU");
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

    public Folderfiles persistFolderfiles(Folderfiles folderfiles) {
        em.persist(folderfiles);
        commitTransaction();
        return folderfiles;
    }

    public Folderfiles mergeFolderfiles(Folderfiles folderfiles) {
        Folderfiles entity = null;
        entity = em.merge(folderfiles);
        commitTransaction();
        return entity;
    }

    public void removeFolderfiles(Folderfiles folderfiles) {
        folderfiles = em.find(Folderfiles.class, folderfiles.getFfileguid());
        em.remove(folderfiles);
        commitTransaction();
    }

    public Folderfolders persistFolderfolders(Folderfolders folderfolders) {
        em.persist(folderfolders);
        commitTransaction();
        return folderfolders;
    }

    public Folderfolders mergeFolderfolders(Folderfolders folderfolders) {
        Folderfolders entity = null;
        entity = em.merge(folderfolders);
        commitTransaction();
        return entity;
    }

    public void removeFolderfolders(Folderfolders folderfolders) {
        folderfolders = em.find(Folderfolders.class, folderfolders.getFfolderguid());
        em.remove(folderfolders);
        commitTransaction();
    }

    public List<Folderfolders> getFolderfoldersFindAll() {
        return em.createNamedQuery("Folderfolders.findAll", Folderfolders.class).getResultList();
        //return em.createNativeQuery("select o from Folderfolders o", Folderfolders.class).getResultList();
    }

    public Folderfolders getFolderfoldersFindRoot() {
        List<Folderfolders> lstFolders =
            em.createNamedQuery("Folderfolders.findRoot", Folderfolders.class).getResultList();
        return lstFolders.isEmpty() ? null : lstFolders.get(0);
    }

    public List<Folderfolders> getFolderfoldersFindByParent(final String parentGuid) {
        return em.createNamedQuery("Folderfolders.findByParent", Folderfolders.class)
                 .setParameter("param", parentGuid)
                 .getResultList();
    }

    public Folderfolders getFolderfoldersByFfolderguid(String ffolderguid) {
        return em.createNamedQuery("Folderfolders.findByFfolderguid", Folderfolders.class)
                 .setParameter("param", ffolderguid)
                 .getSingleResult();
    }

    public List<FoncepTbFondodocumental> getFoncepTbFondosDocumentales() {
        return em.createNamedQuery("FoncepTbFondodocumental.findAll", FoncepTbFondodocumental.class).getResultList();
    }

    public FoncepTbFondodocumental getFoncepTbFondoDocumentalById(Integer id) {
        return em.createNamedQuery("FoncepTbFondodocumental.findById", FoncepTbFondodocumental.class)
                 .setParameter("param", id)
                 .getSingleResult();
    }

    public Integer getIdFondoDocumental(Integer codigo) {
        try {
            return em.createNamedQuery("FoncepTbFondodocumental.findIdByCode", Integer.class)
                     .setParameter("param", codigo)
                     .getSingleResult();
        } catch (Exception e) {
            logger.error("Error al obtener el IdFondoDocumental por el codigo :" + codigo, e);
            return null;
        }
    }

    public List<FoncepTbSeriedocumental> getSerieDocumentalesByIdUnidadProductora(Integer id) {
        return em.createNamedQuery("FoncepTbSeriedocumental.findByIdUnidadProductora", FoncepTbSeriedocumental.class)
                 .setParameter("param", id)
                 .getResultList();
    }

    public FoncepTbSeriedocumental getSerieDocumentaById(Integer id) {
        return em.createNamedQuery("FoncepTbSeriedocumental.findById", FoncepTbSeriedocumental.class)
                 .setParameter("param", id)
                 .getSingleResult();
    }

    public Integer getIdSerieDocumental(Integer codigo, Integer idUnidadProductora) {
        try {
            return em.createNamedQuery("FoncepTbSeriedocumental.findIdByCodeAndIdUnidadProductora", Integer.class)
                     .setParameter("param", codigo)
                     .setParameter("param1", idUnidadProductora)
                     .getSingleResult();
        } catch (Exception e) {
            logger.error("Error al obtener el IdSerieDocumental por el codigo :" + codigo +
                         " y  el idUnidadProductora :" + idUnidadProductora, e);
            return null;
        }
    }
    
    public List<FoncepTbSubserie> getSubSeriesDocumentalesByIdSerie(Integer id) {
        return em.createNamedQuery("FoncepTbSubserie.findByIdSerie", FoncepTbSubserie.class)
                 .setParameter("param", id)
                 .getResultList();
    }

    public FoncepTbSubserie getSubSerieDocumentalById(Integer id) {
        return em.createNamedQuery("FoncepTbSubserie.findById", FoncepTbSubserie.class)
                 .setParameter("param", id)
                 .getSingleResult();
    }

    public Integer getIdSubSerieDocumental(Integer codigo, Integer idSerieDocumental) {
        try {
            return em.createNamedQuery("FoncepTbSubserie.findIdByCodeAndIdSerieDocumental", Integer.class)
                     .setParameter("param", codigo)
                     .setParameter("param1", idSerieDocumental)
                     .getSingleResult();
        } catch (Exception e) {
            logger.error("Error al obtener el IdSubSerieDocumental por el codigo :" + codigo +
                         " y el idSerieDocumental :" + idSerieDocumental, e);
            return null;
        }
    }

    public Integer getIdTipoDocumental(Integer codigo) {
        try {
            return em.createNamedQuery("FoncepTbTipodocumental.findIdByCode", Integer.class)
                     .setParameter("param", codigo)
                     .getSingleResult();
        } catch (Exception e) {
            logger.error("Error al obtener el IdTipoDocumental por el codigo :" + codigo, e);
            return null;
        }
    }
    
    public List<FoncepTbUnidadproductora> getUnidadesProductorasByIdFondo(Integer id) {
        return em.createNamedQuery("FoncepTbUnidadproductora.findByIdFondoDocumental", FoncepTbUnidadproductora.class)
                 .setParameter("param", id)
                 .getResultList();
    }

    public FoncepTbUnidadproductora getUnidadProductoraById(Integer id) {
        return em.createNamedQuery("FoncepTbUnidadproductora.findById", FoncepTbUnidadproductora.class)
                 .setParameter("param", id)
                 .getSingleResult();
    }

    public Integer getIdUnidadProductora(Integer codigo) {
        try {
            return em.createNamedQuery("FoncepTbUnidadproductora.findIdByCode", Integer.class)
                     .setParameter("param", codigo)
                     .getSingleResult();
        } catch (Exception e) {
            logger.error("Error al obtener el IdUnidadProductora por el codigo :" + codigo, e);
            return null;
        }
    }

    public List<FoncepTbTipodocumental> getTiposDocumentalesBySubSerie(Integer idSubSerieDocumental) {
        try {
            return em.createNamedQuery("FoncepTbTipodocumental.findBySubSerieDocumental", FoncepTbTipodocumental.class)
                     .setParameter("param", idSubSerieDocumental)
                     .getResultList();
        } catch (Exception e) {

            logger.error("Error al obtener TiposDocumentales por la SubSerie :" + idSubSerieDocumental, e);
            return new ArrayList<FoncepTbTipodocumental>();
        }
    }

    public FoncepTbTipodocumental getTipoDocumentalesById(Integer id) {
        return em.createNamedQuery("FoncepTbTipodocumental.findById", FoncepTbTipodocumental.class)
                 .setParameter("param", id)
                 .getSingleResult();
    }
}
