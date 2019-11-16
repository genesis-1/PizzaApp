/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.generic.GenericDaoImp;
import dao.interfa.IVictimImage;
import domain.VictimImage;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author root
 */
public class VictimImaimpl extends GenericDaoImp<VictimImage>implements IVictimImage{
  GenericDaoImp<VictimImage> gdc=new VictimImaimpl();
    @Override
    public void Create(VictimImage s) {
       gdc.Create(s);
    }

    @Override
    public void Update(VictimImage s) {
        gdc.Update(s);
    }

    @Override
    public void Delete(VictimImage s) {
        gdc.Delete(s);
    }

    @Override
    public List<VictimImage> FindAll(Class c) {
        List<VictimImage>lc= gdc.FindAll(c);
        return lc;
    }

    @Override
    public VictimImage FindOne(Class c, Serializable id) {
        VictimImage cl=gdc.FindOne(c, id);
        return cl;
    }
   
}
