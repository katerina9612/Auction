/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursach.dal;

/**
 *
 * @author olejaja
 */
import java.util.List;
import kursach.model.Lot;
import org.apache.ibatis.session.SqlSession;


public class LotDal extends BaseDal
{
    public LotDal () {
        super();
    }
    
    public List<Lot> selectAll()
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      List<Lot> list = session.selectList("lot.selectAll");
      session.close();
      return list;
    }
    
     public Lot selectById(int id)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      Lot news= session.selectOne("lot.selectById",id);
      session.close();
      return news;
    }
    
    public int insert(Lot lot)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.insert("lot.insert",lot);
      session.commit();
      session.close();
      return count;
    }
    
    public int update(Lot lot)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.update("lot.update",lot);
      session.commit();
      session.close();
      return count;
    }
    
        
    public int delete(Lot lot)
    {
      SqlSession session = sqlSessionFactory.openSession(); 
      int count =  session.delete("lot.delete",lot);
      session.commit();
      session.close();
      return count;
    }
}
