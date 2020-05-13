/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Yves
 */
@Entity
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String categoryID;
    private String categoryName;
    @OneToMany (mappedBy = "bookCategory", fetch = FetchType.EAGER)
    private List<Book> books;

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BookCategory(String categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    public BookCategory() {
    }
    
    
}
