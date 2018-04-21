/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persoana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author mhcrnl
 */
public class StocarePersoaneMain {
    public static void main(String[] args) {
        
        Persoana pers1 = new Persoana("Mihai", "Cornel");
        Persoana pers2 = new Persoana("Mihai", "Irina");
        
        //System.out.println(pers1.toString());
        
        List<Persoana> listaPersoane = new ArrayList<Persoana>();
        listaPersoane.add(pers1);
        listaPersoane.add(pers2);
        listaPersoane.add(new Persoana("Alex", "Radu"));
        
        WriteReadSerializableObjects wr = new WriteReadSerializableObjects();
        wr.scrieObiecte(listaPersoane);
        wr.citesteObiecte();
        
        System.out.println("============ compareTo() ========================");
        int rez = pers1.compareTo(pers2);
        System.out.println("Pers1.compareTo(pers2): " + rez);
        
        System.out.println("===================Sortare Lista=================");
        Collections.sort(listaPersoane);
        System.out.println("Lisata sortata: "+listaPersoane);
        
        System.out.println("=================================================");
        StocarePersoane stocare = new StocarePersoane();
        stocare.scriePersoane(listaPersoane);
        stocare.getListaPersoane();
        
        System.out.println("LISTA PERSOANE: "+listaPersoane);
        List<Persoana> listaPersoane1 = stocare.citestePersoane();
        System.out.println("SIZE: "+ listaPersoane1.size());
        System.out.println(" " + stocare.citestePersoane());
        for(int i=0; i<listaPersoane1.size(); i++){
            System.out.println("Lista persoane din fila: " + listaPersoane1);
        }
    }
    
    
}
