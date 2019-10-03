/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import domain.Claim;
import dao.generic.GenericDaoImp;
import dao.interfa.IClaim;
import java.io.Serializable;
import java.util.List;


public class ClaimImpl extends GenericDaoImp<Claim>implements IClaim{

    GenericDaoImp<Claim> gdc=new ClaimImpl();
    @Override
    public void Create(Claim s) {
       gdc.Create(s);
    }

    @Override
    public void Update(Claim s) {
        gdc.Update(s);
    }

    @Override
    public void Delete(Claim s) {
        gdc.Delete(s);
    }

    @Override
    public List<Claim> FindAll(Class c) {
        List<Claim>lc= gdc.FindAll(c);
        return lc;
    }

    @Override
    public Claim FindOne(Class c, Serializable id) {
        Claim cl=gdc.FindOne(c, id);
        return cl;
    }
    
}
