/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientId;
    private String regNo;
    private String firstName;
    private String lastName;
   
    private String phoneNumber;
    private String emailAdress;
    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Operation> operations;


    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastName) {
        this.lastName = lastName;
    }


    public String getPhonenumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public String getEmailadress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    


    public Client(String regNo, String firstname, String lastname, String phonenumber, String emailadress) {
        this.regNo = regNo;
        this.firstName = firstname;
        this.lastName = lastname;
        this.phoneNumber = phonenumber;
        this.emailAdress = emailadress;
    }

  

    public Client() {
    }
    
}