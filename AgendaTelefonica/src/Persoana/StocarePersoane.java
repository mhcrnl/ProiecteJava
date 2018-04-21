/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persoana;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mhcrnl
 */
public class StocarePersoane {
    
    private List<Persoana> listaPersoane; 
    
    public StocarePersoane(){
        listaPersoane = new ArrayList<Persoana>();
        listaPersoane = citestePersoane();
    }
    
    public List<Persoana> citestePersoane(){
        List<Persoana> listaPersoane = new ArrayList<Persoana>();
        try {
            InputStream is = new FileInputStream("persoane.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            //if(ois.readObject()!=null){
            listaPersoane = (List<Persoana>)ois.readObject();
            for(Persoana persoana: listaPersoane){
                System.out.println("Lista de persoane din citeste: "+persoana.toString());
            }
            
            ois.close();
            return listaPersoane;
        } catch (EOFException e) { System.out.println(" ");
        } catch (FileNotFoundException ex) {
            System.out.println("Nicio adresa stocata!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void scriePersoane(List<Persoana> listaPersoane){
        try {
            FileOutputStream fos = new FileOutputStream("persoane.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaPersoane);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void stergeListaPersoane() {
        listaPersoane.clear();
        scriePersoane(listaPersoane);
    }
    
    public void adaugaPersoana(Persoana persoana) {
        if(!listaPersoane.contains(persoana)){
            listaPersoane.add(persoana);
            scriePersoane(listaPersoane);
        }
    }

    /**
     * @return the listaPersoane
     */
    public List<Persoana> getListaPersoane() {
        return listaPersoane;
    }

    /**
     * @param listaPersoane the listaPersoane to set
     */
    public void setListaPersoane(List<Persoana> listaPersoane) {
        this.listaPersoane = listaPersoane;
        scriePersoane(listaPersoane);
    }
}
