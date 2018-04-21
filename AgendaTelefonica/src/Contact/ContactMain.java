/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contact;

import Persoana.Persoana;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class ContactMain {
    public static void main(String[] args) {
        
        String nume, prenume, telefon, email;
        String userInput;
        
        Contact con = new Contact("Mihai", "Cornel", "0722.27.07.96", "mhcrnl@gmail.com");
        System.out.println("Contact: "+ con);
        System.out.println("Control Adauga -Adauga Contact");
        Scanner in = new Scanner(System.in);
        
        userInput = in.nextLine();
        userInput= userInput.toUpperCase();
        char lit = userInput.charAt(0);
        if(lit=='A' || lit=='B'){
        switch(lit){
            case 'A':
                System.out.println("Introduce-ti numele: ");
                nume = in.nextLine();
                System.out.println("Introduceti prenumele: ");
                prenume = in.nextLine();
                
                Persoana con1 = new Persoana(nume, prenume);
                System.out.println("Persoana: "+con1);
                break;
            default: 
                System.exit(0);
        }
        }
    }
    
}
