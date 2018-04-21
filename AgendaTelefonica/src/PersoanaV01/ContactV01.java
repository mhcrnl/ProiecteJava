/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersoanaV01;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class ContactV01 extends PersoanaV01 implements Serializable {
    
    private String telefon;
    private String email;
    private String detalii;
    
    Scanner scan = new Scanner(System.in);
    
    ContactV01() {
        
    }
    
    ContactV01(String nume, String prenume, String telefon, String email) {
        super(nume, prenume);
        this.telefon = telefon;
        this.email = email;
    }

    /**
     * @return the telefon
     */
    public String getTelefon(String telefon) {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon() {
        System.out.print("Introduce-ti numarul de telefon: ");
        this.telefon = scan.next();
        
    }

    /**
     * @return the email
     */
    public String getEmail(String email) {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail() {
        System.out.println("Introduce-ti adresa de email: ");
        this.email = scan.next();
        
    }
    
    @Override
    public String toString(){
        String contact = telefon+" "+email;
        return contact;
    }
    
    public static void main(String[] args) {
        
        ContactV01 con = new ContactV01() ;
//        con.getNume();
//        con.getPrenume();
//        con.getTelefon();
//        con.getEmail();
        
        con.setDetalii();
        
        System.out.println("CONTACT: " +con.getDetalii());
    }

    /**
     * @return the detalii
     */
    public String getDetalii() {
        return detalii;
    }

    /**
     * @param detalii the detalii to set
     */
    public void setDetalii() {
        super.setDetalii();
        this.setTelefon();
        this.setEmail();
        this.detalii = detalii;
    }
}
