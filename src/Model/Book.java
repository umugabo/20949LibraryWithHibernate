/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Yves
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booID;
    private String title;
    @ManyToOne
    @JoinColumn (name = "category_id")
    private BookCategory bookCategory;
    private String publishingHouse;
    private String dateOfPublication;
    private String author;
    private int npages;
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBooID() {
        return booID;
    }

    public void setBooID(int booID) {
        this.booID = booID;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }
   
    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNpages() {
        return npages;
    }

    public void setNpages(int npages) {
        this.npages = npages;
    }

    public Book( String title, BookCategory bookCategory, String publishingHouse, String dateOfPublication, String author, int npages) {
        this.title = title;
        this.bookCategory = bookCategory;
        this.publishingHouse = publishingHouse;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
        this.npages = npages;
    }

   
  

  

    public Book() {
    }
    
    
}
