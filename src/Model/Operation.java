/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Yves
 */
@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int opId;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book_name;
    @Enumerated (EnumType.STRING)
    private EOperationCategory Status;
    private Date date;

    public int getOpId() {
        return opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    public Book getBook_name() {
        return book_name;
    }

    public void setBook_name(Book book_name) {
        this.book_name = book_name;
    }

    
    public EOperationCategory getStatus() {
        return Status;
    }

    public void setStatus(EOperationCategory Status) {
        this.Status = Status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

   

    

    public Operation(Client client, Book book_name, EOperationCategory Status, Date date) {
        this.client = client;
        this.book_name = book_name;
        this.Status = Status;
        this.date = date;
    }

   

   

    
    

    public Operation() {
    }
 
}
