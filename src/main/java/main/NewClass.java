package main;

import dao.generic.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author root
 */
public class NewClass {
    public static void main(String[] args) {
        Session ss=HibernateUtil.getSessionFactory().openSession();
        
    }
}
