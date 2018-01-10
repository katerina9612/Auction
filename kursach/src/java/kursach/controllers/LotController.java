package kursach.controllers;

import java.util.List;
import kursach.dal.LotDal;
import kursach.dal.UserDal;
import kursach.model.Lot;
import kursach.model.User;


public class LotController 
{
      protected LotDal lotDal;
    public LotController() {
        lotDal= new LotDal();
    }
    
    public List<Lot> getAllLotes()
    {
        return lotDal.selectAll();
    }
    
    public Lot getLotById(int id)
    {
        return lotDal.selectById(id);
    }
    
    public int insertLot(Lot lot)
    {
        return lotDal.insert(lot);
    }
    
     public int updateLot(Lot lot)
    {
        return lotDal.update(lot);
    }
}
