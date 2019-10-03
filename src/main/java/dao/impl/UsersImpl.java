/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.generic.GenericDaoImp;
import dao.interfa.IUsers;
import domain.Users;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author root
 */
public class UsersImpl extends GenericDaoImp<Users> implements IUsers{
    GenericDaoImp<Users> gdc=new GenericDaoImp<>();
    @Override
    public void Create(Users s) {
       gdc.Create(s);
    }

    @Override
    public void Update(Users s) {
        gdc.Update(s);
    }

    @Override
    public void Delete(Users s) {
        gdc.Delete(s);
    }

    @Override
    public List<Users> FindAll(Class c) {
        List<Users>lc= gdc.FindAll(c);
        return lc;
    }

    @Override
    public Users FindOne(Class c, Serializable id) {
        Users cl=gdc.FindOne(c, id);
        return cl;
    }
    
}
