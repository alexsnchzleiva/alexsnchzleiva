package com.alexsnchzleiva.servlet;

import com.alexsnchzleiva.controller.PruebaController;
import com.alexsnchzleiva.dao.impl.PruebaDaoImpl;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class PruebaServlet extends HttpServlet {
    
    private final static Logger Log = LoggerFactory.getLogger(PruebaDaoImpl.class);
    private ApplicationContext ctx;
    private PruebaController pruebaController;
    String result;
    
    
    
    @Override
    public void init(){        
        ctx = new ClassPathXmlApplicationContext("com/spring/app-context.xml");   
    }
        

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response){
        try{
            pruebaController = (PruebaController) ctx.getBean(PruebaController.class);
            result = pruebaController.prueba();
        }
        catch(BeansException e){
            Log.error(e.getMessage());
        }
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        processRequest(request, response);
    }


}
