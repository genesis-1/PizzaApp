/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Implementation;

import Util.Proxy.IPizzaOptionProxy;
import Model.PizzaOption;
import Model.Util;
import Util.Stub.GenericDao;
import Util.Stub.IGenericDao;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Ntwali
 */
public class PizzaOptionDao extends GenericDao<PizzaOption> implements IPizzaOptionProxy{
       
    public List<PizzaOption> searchByOptionSetId(Class<PizzaOption> c, Long id) throws RemoteException{
		Session ss = Util.sessionFactory.openSession();
		Query q=ss.createQuery("from "+c.getName()+" where optionSet_optionSetId=:d");
                q.setLong("d", id);
                List<PizzaOption> list=q.list();
                ss.close();
		return list;
	}
}
