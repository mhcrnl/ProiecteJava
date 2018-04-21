/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendatelefonica;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhcrnl
 */
public class ContactPersistent {
    public void scrieLista(List<Contact> lista){
        try {
            FileOutputStream fos = new FileOutputStream("Contact.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        } catch (IOException e) { e.printStackTrace();
        }
        
            
        }
    public List<Contact> citesteContacte(){
        List<Contact> contacte = new ArrayList<Contact>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Contact.txt"));
            if(ois.readObject() != null){
                contacte = (List<Contact>)ois.readObject();
            }
            ois.close();
        } catch (EOFException e) { 
            System.out.println(" ");
        } catch(FileNotFoundException e) {
            System.out.println("Nu exista contacte in agenda");
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Contacte din fila: "+contacte);
        return contacte;
    }
}
