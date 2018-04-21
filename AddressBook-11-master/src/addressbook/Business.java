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
public class Business extends Contact{
    
    public String title;
    public String organization;

    
    public Business() {
       
    }
   
    private String setTitle(){
        System.out.println("What is their job title? ");
        this.title = in.next();
        return title;
    }
    
    public String getTitle(){
        return title;
    }
    
    private String setOrganization(){
        System.out.println("Who do they work for? ");
        this.organization = in.next();
        return organization;
    }
    
    public String getOrganization(){
        return organization;
    }
    
    @Override
        public void setDetails (){
        super.setDetails();
        this.setOrganization();
        this.setTitle();
        this.details = (this.name + " " + this.address + " " + this.phoneNumber 
                + " " + this.email + " " + this.organization + " " + 
                this.title);
        
    }
    
    @Override
    public String getDetails (){
        System.out.println("Business:  ");
        return details;
    }
    
    
}
