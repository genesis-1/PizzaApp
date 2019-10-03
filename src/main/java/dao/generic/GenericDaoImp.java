package dao.generic;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author root
 * @param <X>
 */
    public class GenericDaoImp<X> implements GenericDao<X>{
    
    @Override
    public void Create(X s) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(s);
        ss.getTransaction().commit();
        ss.close();
    }

    @Override
    public void Update(X s) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(s);
        ss.getTransaction().commit();
        ss.close();
    }

    @Override
    public void Delete(X s) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(s);
        ss.getTransaction().commit();
        ss.close();
    }

    @Override
    public List<X> FindAll(Class c) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query q = ss.createQuery("from " + c.getName() + "");
        List<X> list = q.list();
        ss.close();
        return list;
    }

    @Override
    public X FindOne(Class c, Serializable id) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        X s = (X) ss.get(c, id);
        ss.close();
        return s;
    }

    
    

}
