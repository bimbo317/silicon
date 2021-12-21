package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.ServicioPrestado;
import persistencia.exceptions.NonexistentEntityException;

public class ServicioPrestadoJpaController implements Serializable {

    public ServicioPrestadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public ServicioPrestadoJpaController() {
        emf = Persistence.createEntityManagerFactory("TPO_N_2PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ServicioPrestado servicioPrestado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(servicioPrestado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ServicioPrestado servicioPrestado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            servicioPrestado = em.merge(servicioPrestado);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = servicioPrestado.getId();
                if (findServicioPrestado(id) == null) {
                    throw new NonexistentEntityException("The servicioPrestado with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ServicioPrestado servicioPrestado;
            try {
                servicioPrestado = em.getReference(ServicioPrestado.class, id);
                servicioPrestado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The servicioPrestado with id " + id + " no longer exists.", enfe);
            }
            em.remove(servicioPrestado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ServicioPrestado> findServicioPrestadoEntities() {
        return findServicioPrestadoEntities(true, -1, -1);
    }

    public List<ServicioPrestado> findServicioPrestadoEntities(int maxResults, int firstResult) {
        return findServicioPrestadoEntities(false, maxResults, firstResult);
    }

    private List<ServicioPrestado> findServicioPrestadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ServicioPrestado.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ServicioPrestado findServicioPrestado(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ServicioPrestado.class, id);
        } finally {
            em.close();
        }
    }

    public int getServicioPrestadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ServicioPrestado> rt = cq.from(ServicioPrestado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
