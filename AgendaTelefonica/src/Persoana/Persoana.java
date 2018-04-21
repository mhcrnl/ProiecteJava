/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persoana;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author mhcrnl
 */
public class Persoana implements Serializable, Comparable<Persoana>, 
        Comparator<Persoana> {
    
   // private static final long versionID = 1L;
    private String nume;
    private String prenume;
    
    public Persoana(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }
    
    @Override
    public int compare(Persoana pers1, Persoana pers2){
        return pers1.getNume().compareToIgnoreCase(pers2.getNume());
    }

    @Override
    public String toString(){
        String persoana = nume + " "+prenume;
        return persoana;
    }
    @Override
    public int compareTo(Persoana pers) {
        return (this.nume).compareTo(pers.getPrenume());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nume);
        hash = 67 * hash + Objects.hashCode(this.prenume);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Persoana){
          Persoana pers = (Persoana) obj;
          return(nume.equals(pers.getNume())&& prenume.equals(pers.getPrenume()));
        }
        return false;
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
    
}
