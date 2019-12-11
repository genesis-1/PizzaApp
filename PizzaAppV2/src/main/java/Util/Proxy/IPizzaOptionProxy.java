/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Proxy;

import Model.PizzaOption;
import Util.Stub.IGenericDao;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Ntwali
 */
public interface IPizzaOptionProxy extends IGenericDao<PizzaOption>{
    public List<PizzaOption> searchByOptionSetId(Class<PizzaOption> c, Long id) throws RemoteException;
}
