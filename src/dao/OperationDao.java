/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Book;
import Model.Client;
import Model.Operation;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;


/**
 *
 * @author Yves
 */
public class OperationDao extends general.GenericDao<Operation>{
    public List<Book> display_Book() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM "+Book.class.getName());
        List<Book> li = query.list();
        session.close();
        return li;
    }
    
     public Book findByBookName(String name) {
         try {
             Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Book b where b.title=:name").setParameter("name", name);
        Book b = (Book) query.uniqueResult();
        session.close();
        return b;
         } catch (Exception e) {
             throw new RuntimeException(e.getMessage());
         }  
    }
      public List<Client> display_Client() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM "+Client.class.getName());
        List<Client> li = query.list();
        session.close();
        return li;
    }
      public Client findByClientName(String name) {
         try {
             Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Client c where c.firstName=:name").setParameter("name", name);
        Client c = (Client) query.uniqueResult();
        session.close();
        return c;
         } catch (Exception e) {
             throw new RuntimeException(e.getMessage());
         }  
    }
       public List<Operation> allCheckInStatus() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Operation o where o.Status = 'CHECK_IN'");
        List<Operation> CheckIns = query.list();
        session.close();
        return CheckIns;
    }
              public List<Operation> allCheckOutStatus() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Operation o where o.Status = 'CHECK_OUT'");
        List<Operation> CheckOuts = query.list();
        session.close();
        return CheckOuts;
    }
}
