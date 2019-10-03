/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.generic.GenericDaoImp;
import dao.interfa.INotification;
import domain.Notification;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author root
 */
public class NotificationImpl extends GenericDaoImp<Notification>implements INotification {
    GenericDaoImp<Notification> gdc=new NotificationImpl();
    @Override
    public void Create(Notification s) {
       gdc.Create(s);
    }

    @Override
    public void Update(Notification s) {
        gdc.Update(s);
    }

    @Override
    public void Delete(Notification s) {
        gdc.Delete(s);
    }

    @Override
    public List<Notification> FindAll(Class c) {
        List<Notification>lc= gdc.FindAll(c);
        return lc;
    }

    @Override
    public Notification FindOne(Class c, Serializable id) {
        Notification cl=gdc.FindOne(c, id);
        return cl;
    }
    
}
