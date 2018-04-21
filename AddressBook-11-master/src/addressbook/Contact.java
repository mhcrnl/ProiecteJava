/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author danielvigil
 */
public abstract class Contact implements Serializable {
    private static Object iterator;
    
    //Instance variable declaration
    private String firstName;
    private String lastName;
    public String name;
    public String address;
    public String phoneNumber;
    public String email;
    private String number;
    private String addy;
    private String street;
    private String city;
    private String state;
    private String zip;
    public String details;
    
    Scanner in = new Scanner(System.in);
    private int n;
    
    Contact(){
        
    }
    
    public void setName(){
        System.out.println("What is their full name? ");
        this.firstName = in.next();
        this.lastName = in.next();
        name = this.firstName + " " + this.lastName;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAddress(){
        System.out.println("What is their street number ? Please follow this "
                + "example:   4433 State St Seattle WA 9999 ");
        this.number = in.next();
        this.addy = in.next();
        this.street = in.next();
        this.city = in.next();
        this.state = in.next();
        this.zip = in.next();
        this.address = this.number + " " + this.addy + " " + this.street + " " 
                + this.city + " " + this.state + " " +this.zip;
    }

    public String getAddress(String address) {
        return address;
    }

    public void setPhoneNumber(){
        System.out.println("What is their phone number? ");
        this.phoneNumber = in.next();
    }
    
    public String getPhoneNumber(String number) {
        return phoneNumber;
    }

    public void setEmail(){
        System.out.println("What is their email? ");
        this.email = in.next();
    }
    
    public String getEmail(String email) {
        return email;
    }

    public void setDetails (){
        this.setName();
        this.setAddress();
        this.setPhoneNumber();
        this.setEmail();
        this.details = (name + " " + address + " " + phoneNumber + " " 
                + email);
        
    }
    
    public String getDetails (){
        return details;
    }
   

}  
