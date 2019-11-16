/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.generic;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author root
 * @param <X>
 */
public interface GenericDao<X> {
    public void Create(X s);
    public void Update(X s);
    public void Delete(X s);
    public List<X> FindAll(Class c);
    public X FindOne(Class c, Serializable id);
}
