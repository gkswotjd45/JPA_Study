package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        // 웹서비스에서 하나만 존재하는 형태
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");

        EntityManager em =  emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try{


            tx.commit();
        }catch (Exception e){
            tx.rollback();;
        }finally {
            em.close();
        }
        emf.close();
    }
}
