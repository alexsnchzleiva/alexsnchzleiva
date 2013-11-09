package com.alexsnchzleiva.controller.impl;

import com.alexsnchzleiva.controller.PruebaController;
import com.alexsnchzleiva.dao.impl.PruebaDaoImpl;
import com.alexsnchzleiva.service.PruebaService;
import com.alexsnchzleiva.vo.PruebaVO;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;



public class PruebaAbstractControllerImpl extends AbstractController implements PruebaController {
    
    private final static Logger Log = LoggerFactory.getLogger(PruebaDaoImpl.class);
    private ApplicationContext ctx;
    PruebaService pruebaService;   
    
    
    public PruebaAbstractControllerImpl(){
        ctx = new ClassPathXmlApplicationContext("com/spring/app-context.xml");
    }
    
    
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response){
        pruebaService = (PruebaService) ctx.getBean(PruebaService.class);
        
        List<PruebaVO> resultService = null;
        ModelAndView mv = new ModelAndView("prueba");
        Map<String,String> map = new TreeMap();
   
        try{
            resultService = pruebaService.prueba(); 
            
            if(resultService != null && resultService.size() > 0){
                for(PruebaVO pruebaVO : resultService){
                    map.put("primero", pruebaVO.getNombre());
                }
            }
            
            mv.addAllObjects(map);
        }
        catch(Exception e){
            Log.error(e.getMessage());
        }
        
        return mv;
    }
    
    
    
    
    
    public PruebaService getPruebaService() {
        return pruebaService;
    }

    public void setPruebaService(PruebaService pruebaService) {
        this.pruebaService = pruebaService;
    }
    
    
    
}
