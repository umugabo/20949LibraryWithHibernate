/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class BookCategoryDao extends GenericDao<BookCategory> {
    public List<BookCategory> allCategories() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM BookCategory");
        List<BookCategory> categories = query.list();
        session.close();
        return categories;
    }
}
