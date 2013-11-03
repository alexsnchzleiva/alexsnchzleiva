package com.alexsnchzleiva.service.impl;

import com.alexsnchzleiva.dao.PruebaDao;
import com.alexsnchzleiva.dao.impl.PruebaDaoImpl;
import com.alexsnchzleiva.entity.Prueba;
import com.alexsnchzleiva.service.PruebaService;
import com.alexsnchzleiva.vo.PruebaVO;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PruebaServiceImpl implements PruebaService {

    private final static Logger Log = LoggerFactory.getLogger(PruebaDaoImpl.class);
    private PruebaDao pruebaDao;

    
    public PruebaDao getPruebaDao() {
        return pruebaDao;
    }

    public void setPruebaDao(PruebaDao pruebaDao) {
        this.pruebaDao = pruebaDao;
    }
    
    
    @Override
    public List<PruebaVO> prueba(){
        List<PruebaVO> result = null;
        List<Prueba> resultDao = null;
        
        try{
            resultDao = pruebaDao.prueba();
        }
        catch(Exception e){
            Log.error(e.getMessage());
        }
        
        return result;
    }

}
