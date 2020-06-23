package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.hibernate.SessionFactory;
import org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity.*;

import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateFactory.getSessionFactory();
        EntityManager em = sessionFactory.createEntityManager();

        Category category = new Category();
        Articles articles = new Articles();

        Roles roles = new Roles();
        roles.setName("admin");
        Users users = new Users();
        Orders orders = new Orders();

        Roles roles1 = new Roles();
        roles1.setName("user");
        Users users1 = new Users();

        em.getTransaction().begin();
        em.persist(category);
        em.persist(articles);
        em.persist(roles);
        em.persist(users);
        em.persist(roles1);
        em.persist(users1);
        em.persist(orders);
        em.getTransaction().commit();

        em.close();
        sessionFactory.close();
    }
}
