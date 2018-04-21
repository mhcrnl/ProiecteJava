/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook_JavaConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class Controller {
    
    List<Persoana> listaPersoane = new ArrayList<Persoana>();
    String nume, prenume;
    Scanner scan = new Scanner(System.in);
    
    public void adauga() {
        System.out.print("Introduce-ti numele dvs : ");
        nume = scan.next();
        System.out.print("\nIntroduce-ti prenumele dvs : ");
        prenume = scan.next();
        Persoana persoana = new Persoana(nume, prenume);
        listaPersoane.add(persoana);
        
        System.out.println("LISTA: "+listaPersoane);
    }
    
    
    
}
