/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

import Persoana.Persoana;
import java.io.Serializable;

/**
 * Extends Persoana
 * @author mhcrnl@gmail.com tel:0722.27 07.96
 */
public class Contact extends Persoana implements Serializable, 
         Comparable<Persoana> {
    
    private String telefon;
    private String email;
    
    public Contact(String nume, String prenume, String telefon, String email) {
        super(nume, prenume);
        this.telefon = telefon;
        this.email = email;
    }
    
    @Override
    public String toString(){
        String rez = super.toString()+" "+telefon+" "+email;
        return rez;
    }
    
    @Override
    public int compareTo(Persoana otherPers){
        Contact otherContact = (Contact)otherPers;
        String _email = this.email;
        return _email.compareToIgnoreCase(otherContact.getEmail());
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
