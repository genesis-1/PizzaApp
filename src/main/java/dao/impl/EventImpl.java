/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.generic.GenericDaoImp;
import dao.interfa.IEvent;
import domain.Event;
import domain.Event;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author root
 */
public class EventImpl extends GenericDaoImp<Event>implements IEvent{
    GenericDaoImp<Event> gdc=new EventImpl();
    @Override
    public void Create(Event s) {
       gdc.Create(s);
    }

    @Override
    public void Update(Event s) {
        gdc.Update(s);
    }

    @Override
    public void Delete(Event s) {
        gdc.Delete(s);
    }

    @Override
    public List<Event> FindAll(Class c) {
        List<Event>lc= gdc.FindAll(c);
        return lc;
    }

    @Override
    public Event FindOne(Class c, Serializable id) {
        Event cl=gdc.FindOne(c, id);
        return cl;
    }
    
}
