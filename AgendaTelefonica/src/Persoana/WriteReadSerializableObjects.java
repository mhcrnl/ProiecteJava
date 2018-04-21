/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persoana;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Uses buffering, and abstract base classes. JDK 7+.                                               
 * @author mhcrnl@gmail. com  tel:0722.27.07.96
 */
public class WriteReadSerializableObjects {
    /**
     * Use Java's logging facilities to record exceptions.
     *  The behavior of the logger can be configured through a
     *  text file, or programmatically through the logging API.
     */
    private static final Logger fLogger = Logger.getLogger(WriteReadSerializableObjects
            .class.getPackage().getName());
    
    public void scrieObiecte(List<Persoana> listaPersoane){
        try (
            OutputStream file = new FileOutputStream("listafila.ser");
            OutputStream buffer = new BufferedOutputStream(file);
            ObjectOutput output = new ObjectOutputStream(buffer);
            ){
            output.writeObject(listaPersoane);
        } catch (IOException e) { 
            fLogger.log(Level.SEVERE, "Cannot perform output.", e);
        } 
    }
    
    public List<Persoana> citesteObiecte() {
        try (
            InputStream file = new FileInputStream("listafila.ser");
            InputStream buffer = new BufferedInputStream(file);
            ObjectInput input = new ObjectInputStream(buffer);
            ) {
            List<Persoana> recuperareListaPersoane = (List<Persoana>)input.readObject(); 
            for(Persoana persoana: recuperareListaPersoane){
                System.out.println("Persoane: "+persoana.toString());  
            }
            return recuperareListaPersoane;
        } catch (ClassNotFoundException ex){
            fLogger.log(Level.SEVERE, "Cannot perform input. Class not found.", ex);
        } catch (Exception e) {
            fLogger.log(Level.SEVERE, "Cannot perform input.", e);
        }
        
       return null; 
    }
    
}
