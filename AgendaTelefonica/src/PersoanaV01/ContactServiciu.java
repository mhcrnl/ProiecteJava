/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersoanaV01;

/**
 *
 * @author mhcrnl
 */
public class ContactServiciu extends PersoanaV01 {
    
    private String telefon;
    private String serviciu;

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public String setTelefon() {
        System.out.println("Introduce-ti numarul de telefon de la serviciu : ");
        this.telefon = in.next();
        return telefon;
    }

    /**
     * @return the serviciu
     */
    public String getServiciu() {
        return serviciu;
    }

    /**
     * @param serviciu the serviciu to set
     */
    public String setServiciu() {
        System.out.println("Inroduce-ti compania la care lucrati: ");
        this.serviciu = in.next();
        return serviciu;
    }
    
    
    public static void main(String[] args) {
        
        ContactServiciu pc = new ContactServiciu();
        
        pc.getNume();
        pc.getPrenume();
        pc.getTelefon();
        pc.getTelefon();
        
        System.out.println("NUME" + pc);
    }
    
}
