/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.Book;
import Model.BookCategory;
import general.GenericDao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Yves
 */
public class BookDao extends GenericDao<Book>{
    public List<BookCategory> display_BookCategory() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM "+BookCategory.class.getName());
        List<BookCategory> li = query.list();
        session.close();
        return li;
    }
     public BookCategory findByCategoryName(String name) {
         try {
             Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM BookCategory b where b.categoryName=:name").setParameter("name", name);
        BookCategory bc = (BookCategory) query.uniqueResult();
        session.close();
        return bc;
         } catch (Exception e) {
             throw new RuntimeException(e.getMessage());
         }
        
    }
    
}
