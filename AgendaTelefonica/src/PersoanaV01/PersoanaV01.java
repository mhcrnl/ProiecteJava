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
public class PersoanaV01 implements Serializable {
    
    private String nume;
    private String prenume;
    private String detalii;
    
    Scanner in = new Scanner(System.in);
    
    PersoanaV01(){
        
    }
    
    PersoanaV01(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
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
    public void setNume() {
        System.out.print("Introduce-ti numele persoanei: ");
        this.nume = in.next();
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
    public void setPrenume() {
        System.out.print("Introduce-ti prenumele persoanei: ");
        this.prenume = in.next();
    }
    
    @Override
    public String toString() {
        String persoana = nume+" "+prenume;
        return persoana;
    }
    
    public static void main(String[] args) {
        
        PersoanaV01 pers = new PersoanaV01();
        pers.setNume();
        pers.setPrenume();
         
        System.out.println("\nPERSOANA: " + pers );
        
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
        this.setNume();
        this.setPrenume();
        this.detalii = nume+" "+prenume;
    }
}
