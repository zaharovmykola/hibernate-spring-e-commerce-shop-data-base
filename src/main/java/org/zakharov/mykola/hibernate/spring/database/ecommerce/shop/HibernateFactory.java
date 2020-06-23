package org.zakharov.mykola.hibernate.spring.database.ecommerce.shop;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.zakharov.mykola.hibernate.spring.database.ecommerce.shop.entity.*;

public class HibernateFactory {

    private static SessionFactory sessionFactory = null;

    static {
        Configuration cfg = new Configuration();
        cfg.setProperty("connection.driver_class", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/e-commerce-shop?serverTimezone=UTC");
        cfg.setProperty("hibernate.connection.username", "root");
        cfg.setProperty("hibernate.connection.password", "K1l1mandzar0");
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
        cfg.setProperty("show_sql", "true");
        cfg.setProperty("hibernate.hbm2ddl.auto", "validate");
        cfg.addAnnotatedClass(Articles.class);
        cfg.addAnnotatedClass(Category.class);
        cfg.addAnnotatedClass(Orders.class);
        cfg.addAnnotatedClass(Roles.class);

        sessionFactory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
