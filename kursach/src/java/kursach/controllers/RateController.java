/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursach.controllers;

import java.util.List;
import kursach.dal.RateDal;
import kursach.dal.UserDal;
import kursach.model.Rate;
import kursach.model.User;


public class RateController 
{
      protected RateDal rateDal;
    public RateController() {
        rateDal= new RateDal();
    }
    
    public List<Rate> getAllRate()
    {
        return rateDal.selectAll();
    }
    
    public Rate getRateById(int id)
    {
        return rateDal.selectById(id);
    }
    
    public int insertRate(Rate rate)
    {
        return rateDal.insert(rate);
    }
    
     public int updateRate(Rate rate)
    {
        return rateDal.update(rate);
    }
}
