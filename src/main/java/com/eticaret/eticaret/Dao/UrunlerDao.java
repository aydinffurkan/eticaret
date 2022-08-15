package com.eticaret.eticaret.Dao;

import com.eticaret.eticaret.Model.Kategoriler;
import com.eticaret.eticaret.Model.Urunler;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class UrunlerDao {
    @PersistenceContext
    EntityManager em ;

    // constructor

     public List<Urunler> findBooksByAuthorNameAndTitle(Long kategori_id) {
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<Urunler> cq = cb.createQuery(Urunler.class);
//
//        Root<Urunler> urunlerRoot = cq.from(Urunler.class);
//        Predicate kategori_id1 = cb.equal(urunlerRoot.get("kategoriler.kategori_id"), kategori_id);
//        cq.where(kategori_id1);
//        TypedQuery<Urunler> query = em.createQuery(cq);
//        return query.getResultList();

         Criteria crit = em.unwrap(Session.class).createCriteria(Urunler.class);
         crit.add(Restrictions.eq("kategoriler.kategori_id", kategori_id));
         List<Urunler> students = crit.list();


         return students;
    }
}
