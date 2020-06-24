package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop;

import org.hibernate.SessionFactory;
import org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity.*;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateFactory.getSessionFactory();
        EntityManager em = sessionFactory.createEntityManager();

        Category category = new Category();
        category.setName("C1");
        Articles articles = new Articles();
        articles.setTitle("A1");
        articles.setDescription("A1 D");
        articles.setImage("path_to_image");
        articles.setPrice(new BigDecimal(10));
        articles.setQuantity(100);
        articles.setCategory(category);

        Roles roles = new Roles();
        roles.setName("admin");
        Users users = new Users();
        users.setLogin("U1 L");
        users.setPassword("U1 P");
        users.setRole(roles);
        Orders orders = new Orders();
        orders.setArticle(articles);
        orders.setQuantity(1);
        orders.setUser(users);

        Roles roles1 = new Roles();
        roles1.setName("user");
        Users users1 = new Users();
        users1.setLogin("U1-1 L");
        users1.setPassword("U1-1 P");
        users1.setRole(roles);

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
        // sessionFactory.close();
    }
}
