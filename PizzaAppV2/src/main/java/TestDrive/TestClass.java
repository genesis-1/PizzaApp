package TestDrive;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Model.OptionSet;
import Model.PizzaConfig;
import Model.PizzaOption;
import Model.Util;
import Util.Stub.GenericDao;
import Util.Stub.IGenericDao;
import dao.Implementation.PizzaOptionDao;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import Util.Proxy.IPizzaOptionProxy;

/**
 *
 * @author root
 */
public class TestClass {
  
    public static void main(String[] args) throws RemoteException {
        System.out.print("starts");
         Util.sessionFactory.openSession();
//         List<PizzaConfig> configs = new ArrayList<>();
//         Set<PizzaOption> opt = new HashSet<>();
//         Set<OptionSet> opts = new HashSet<>();
//         
//         IGenericDao<PizzaConfig>gdos=new GenericDao<>();
//         configs = gdos.getAll("PizzaConfig");
//         
//         for (PizzaConfig obj : configs) {
//             System.out.println(obj.getName());
//            opts = obj.getOptionSets();
//             for (OptionSet objct : opts) {
//                 objct.getName();
//                 System.out.println(objct.getName());
//             }
//        }
//         System.out.println(configs);
//        List<PizzaOption> configs = new ArrayList<>();
//        IPizzaOptionProxy dao = new PizzaOptionDao();
//        configs = dao.searchByOptionSetId(PizzaOption.class,1L);
//        for (PizzaOption ot : configs) {
//            System.out.println(ot.getName());
//        }
         
    }

}
