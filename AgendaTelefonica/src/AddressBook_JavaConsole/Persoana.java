/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook_JavaConsole;

import java.io.Serializable;

/**
 *
 * @author mhcrnl
 */
public class Persoana implements Serializable {
    
    private String nume;
    private String prenume;
    
    public Persoana(String nume, String prenume) {
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
    
    @Override
    public String toString(){
        String persoana = nume+" "+prenume;
        return persoana;
    }
    
}
