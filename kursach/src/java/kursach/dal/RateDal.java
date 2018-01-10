/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursach.dal;

import java.util.List;
import kursach.model.Rate;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author olejaja
 */
public class RateDal extends BaseDal
{
      public RateDal  () {
        super();
    }
    
    public List<Rate> selectAll()
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Rate> list = session.selectList("rate.selectAll");
      session.close();
      return list;
    }
    
     public Rate selectById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      Rate rate= session.selectOne("rate.selectById",id);
      session.close();
      return rate;
    }
    
    public int insert(Rate rate)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("category.insert",rate);
      session.commit();
      session.close();
      return count;
    }
    
    public int update(Rate rate)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("rate.update",rate);
      session.commit();
      session.close();
      return count;
    }
    
        
    public int delete(Rate rate)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("rate.delete",rate);
      session.commit();
      session.close();
      return count;
    }
}