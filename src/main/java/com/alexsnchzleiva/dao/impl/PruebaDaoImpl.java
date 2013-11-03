package com.alexsnchzleiva.dao.impl;

import com.alexsnchzleiva.dao.PruebaDao;
import com.alexsnchzleiva.entity.Prueba;
import com.alexsnchzleiva.hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PruebaDaoImpl implements PruebaDao{
    
    private final static Logger Log = LoggerFactory.getLogger(PruebaDaoImpl.class);
    

    @Override
    public List<Prueba> prueba(){
        List<Prueba> result = null;
        
        Session session;
        Transaction tx;
        Query q;
        
        session = HibernateUtil.getSessionFactory().openSession();
	tx = session.beginTransaction();
        
	q = session.createQuery("from Prueba t");
        result = q.list();
        
        session.flush();
	tx.commit();
	session.close();
        
        return result;
    }

}
