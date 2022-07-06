package co.f28smart.sgd.crud.facade;

import co.f28smart.sgd.crud.entity.Folderfiles;
import co.f28smart.sgd.crud.entity.Folderfolders;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class WebCCServiceFacade {
    private final EntityManager em;

    public WebCCServiceFacade() {
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
        List<Folderfolders> lstFolders = em.createNamedQuery("Folderfolders.findRoot", Folderfolders.class).getResultList();
        return lstFolders.isEmpty() ? null : lstFolders.get(0);
    }
    
    public List<Folderfolders> getFolderfoldersFindByParent(final String parentGuid) {
        return em.createNamedQuery("Folderfolders.findByParent", Folderfolders.class)
                 .setParameter("param", parentGuid).getResultList();
    }
}
