/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author danielvigil
 */
public class Personal extends Contact {
    
    public String birth;
    
    Personal(){
       
    }

    public void setBirth(){
        System.out.println("What is their Date of Birth? ");
        this.birth = in.next();
    }
    
    public String getBirth(String birth){
        return birth;
    }

    @Override
    public void setDetails() {
        super.setDetails(); 
        this.setBirth();
    }

    @Override
    public String getDetails() {
        System.out.println("Personal:  ");
        return details; 
        
    }
    
    
    
}
