package com.alexsnchzleiva.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        
        try {
            sessionFactory = new Configuration().configure("com/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
        } 
        catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
