/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook_JavaConsole;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class MkyongDeSerialisze {
    
    static String file = "serFile.ser";
    static String nume, prenume;
    
    public static void main(String[] args) {
        MkyongDeSerialisze des = new MkyongDeSerialisze();
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce-ti numele persoanei: ");
        nume = in.nextLine();
        System.out.print("\nIntroduce-ti prenumele persoanei: ");
        prenume = in.nextLine();
        des.serializePersoana(nume, prenume, file);
        des.deserializePersoana(file);
        
    }
    
    public Persoana deserializePersoana(String file){
        
        Persoana pers;
        
        try {
            InputStream fis = new FileInputStream(file);
            ObjectInput ois = new ObjectInputStream(fis);
            pers = (Persoana) ois.readObject();
            ois.close();
            System.out.println("Persoana citita din fila: "+pers.toString());
            return pers;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void serializePersoana(String nume, String prenume, String file){
        
        Persoana pers = new Persoana(nume, prenume);
        
        try {
            OutputStream fos = new FileOutputStream(file, true);
            ObjectOutput oos = new ObjectOutputStream(fos);
            oos.writeObject(pers);
            oos.close();
            System.out.println("Persoana a fost salvata!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
