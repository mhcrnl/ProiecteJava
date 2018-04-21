/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class ContactController {
    
    private String nume, prenume, telefon, email;
    Contact contact;
    List<Contact> listaContacte;
    
    Scanner in = new Scanner(System.in);
    
    public void adauga() {
        /**
         * Preia contactele de la tastatura
         */
        System.out.println("Introduce-ti numele contactului: ");
        nume = in.nextLine();
        System.out.println("Introduce-ti prenumel: ");
        prenume = in.nextLine();
        System.out.println("Introduce-ti numarul de telefon: ");
        telefon = in.nextLine();
        System.out.println("Introduce-ti adresa de email: ");
        email = in.nextLine();
        // Creaza contactul pt a fi adaugat in lista
        contact = new Contact(nume, prenume, telefon, email);
        // Creaza colectia de obiecte lista  si adauga obiectul
        listaContacte = new ArrayList<Contact>();
        if(contact != null){
            listaContacte.add(contact);
        }
        //adaugaContactNou();
        
    }
    
    public void afiseaza() {
        
        System.out.println("LISTA CONTACTE: " + listaContacte);
    }
    
    public void salveaza(){
        
    }
    
    public void curata(){
        
    }
    
    public boolean adaugaContactNou(){
        System.out.println("Adaugati un nou contact? Y/N : ");
        String input = in.nextLine();
        input = input.toUpperCase();
        return input.charAt(0)=='Y';
    }
    
    public static void main(String[] args) {
        ContactController cc = new ContactController();
        
        do {
            cc.adauga();
        } while (cc.adaugaContactNou());
        
            cc.afiseaza();
        
    }
    
}
