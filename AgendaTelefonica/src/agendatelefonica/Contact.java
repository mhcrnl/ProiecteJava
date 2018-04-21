/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author mhcrnl
 */
public class Contact implements Serializable, Comparator {
    private String nume;
    private String prenume;
    private String telefon;
    private List<Contact> contacts;
    
    public Contact(String nume, String prenume, String telefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
    }
    
    public void addContact(Contact contact) {
        contacts = new ArrayList<Contact>();
        if(contact != null){
            contacts.add(contact);
        }
    }
    public void afiseazaLista(){
        System.out.println("Lista Contacte: "+ contacts);
    }
    @Override
    public String toString(){
        String contact = nume+" "+prenume+" : "+telefon;
        return contact;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Contact){
            Contact contact = (Contact) o;
            return nume.equals(contact.getNume());
        }
         return false;
    }

    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * @return the prenume
     */
    public String getPrenume() {
        return prenume;
    }

    /**
     * @param prenume the prenume to set
     */
    public void setPrenume(String prenume) {
        this.prenume = prenume;
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

    @Override
    public int compare(Object o1, Object o2) {
        //To change body of generated methods, choose Tools | Templates.
        return 1;
    }
    
}
