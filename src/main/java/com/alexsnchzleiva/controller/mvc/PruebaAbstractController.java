package com.alexsnchzleiva.controller.mvc;

import com.alexsnchzleiva.dao.impl.PruebaDaoImpl;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;



public class PruebaAbstractController extends AbstractController {
    
    private final static Logger Log = LoggerFactory.getLogger(PruebaDaoImpl.class);
    
    
    public PruebaAbstractController() {
    }
    
    
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = null;
        
        try{
        }
        catch(Exception e){
            Log.error(e.getMessage());
        }
        
        return mv;
    }
    
}
