/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursach.dal;

import java.util.List;
import kursach.model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author olejaja
 */
public class UserDalTest {
    
    public UserDalTest() {
    }
    
      @Test
    public void testSelectAll() {
        System.out.println("UserDal selectAll");
        UserDal dal = new UserDal();
        List<User> list = dal.selectAll();
        assertTrue(list!=null && list.size()>0);
    }

    /**
     * Test of selectById method, of class UserDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 1;
        UserDal instance = new UserDal();
        User expResult = null;
        User result = instance.selectById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class UserDal.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        User user = null;
        UserDal instance = new UserDal();
        int expResult = 0;
        int result = instance.insert(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UserDal.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        User user = null;
        UserDal instance = new UserDal();
        int expResult = 0;
        int result = instance.update(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UserDal.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        User user = null;
        UserDal instance = new UserDal();
        int expResult = 0;
        int result = instance.delete(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

