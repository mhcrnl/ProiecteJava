/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhcrnl
 */
public class AgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contact c1, c2, c3;
        List<Contact> listaNoua = new ArrayList<Contact>();
        ContactPersistent pc = new ContactPersistent();
        c1 = new Contact("Mihai", "Cornel", "0722.27.07.96");
        c1.addContact(c1);
        
        System.out.println("Contact: "+c1);
        c1.afiseazaLista();
        
        c2 = new Contact("Gica", "Petrescu", "0734.23.45.98");
        c2.addContact(c2);
        c2.afiseazaLista();
        listaNoua.add(c1);
        listaNoua.add(c2);
        System.out.println("ListaNoua: "+ listaNoua);
        
       
        pc.scrieLista(listaNoua);
        
        List<Contact> contacte = new ArrayList<Contact>();
        contacte = pc.citesteContacte();
        for(Contact con: contacte){
            System.out.println("Citire Fila:"+ con.getNume());
        }
    }
}
