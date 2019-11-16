/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.generic.GenericDaoImp;
import dao.interfa.IGallery;
import domain.Gallery;
import domain.Gallery;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author root
 */
public class GalleryImpl extends GenericDaoImp<Gallery>implements IGallery {
    GenericDaoImp<Gallery> gdc=new GalleryImpl();
    @Override
    public void Create(Gallery s) {
       gdc.Create(s);
    }

    @Override
    public void Update(Gallery s) {
        gdc.Update(s);
    }

    @Override
    public void Delete(Gallery s) {
        gdc.Delete(s);
    }

    @Override
    public List<Gallery> FindAll(Class c) {
        List<Gallery>lc= gdc.FindAll(c);
        return lc;
    }

    @Override
    public Gallery FindOne(Class c, Serializable id) {
        Gallery cl=gdc.FindOne(c, id);
        return cl;
    }
    
}
