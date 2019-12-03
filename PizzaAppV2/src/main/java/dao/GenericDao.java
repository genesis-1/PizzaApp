/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Util;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author root
 */

public class GenericDao<X> {

    public void create(X x){
       Session ss = Util.sessionFactory.openSession();
       Transaction tx = ss.beginTransaction();
       ss.save(x);
       tx.commit();
       ss.close();
    }
    public void Delete(X x)throws Exception{
       Session ss=Util.sessionFactory.openSession();
       Transaction tx = ss.beginTransaction();
       ss.delete(x);
       tx.commit();
       ss.close();
        
    }
    public void update(X x)throws Exception{
       Session ss=Util.sessionFactory.openSession();
        Transaction tx = ss.beginTransaction();
       ss.update(x);
       tx.commit();
       ss.close();
        
    }
    public List<X> getAll(String str){
		Session ss = Util.sessionFactory.openSession();
		return ss.createQuery("From "+str).list();
	}
    
    public X searchById(Class<X> c, Serializable id) {
		Session ss = Util.sessionFactory.openSession();
		X list = (X) ss.get(c, id);
		ss.close();
		return list;
	}
    
    
}
