package com.alexsnchzleiva.controller.impl;

import com.alexsnchzleiva.controller.PruebaController;
import com.alexsnchzleiva.dao.impl.PruebaDaoImpl;
import com.alexsnchzleiva.service.PruebaService;
import com.alexsnchzleiva.vo.PruebaVO;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PruebaControllerImpl implements PruebaController{
    
    private final static Logger Log = LoggerFactory.getLogger(PruebaDaoImpl.class);
    private PruebaService pruebaService;
    

    public PruebaService getPruebaService() {
        return pruebaService;
    }

    public void setPruebaService(PruebaService pruebaService) {
        this.pruebaService = pruebaService;
    }

    @Override
    public String prueba(){
        List<PruebaVO> resultService = null;
        
        try{            
            resultService = pruebaService.prueba();
        }
        catch(Exception e){
            Log.error(e.getMessage());
        }
        
        return "";
    }

}
