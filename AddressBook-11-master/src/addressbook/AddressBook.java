/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;


import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author danielvigil
 */
public class AddressBook {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) {
        
        int select;
        String printing;
        
        ArrayList<Contact> contactList = new ArrayList<>();
        Contact contacts;
        Scanner in = new Scanner(System.in);
        
        
        do{
            //Menu Display
            System.out.println("           <>-------  Menu   -------<>          ");
            System.out.println("             1. Add Business Contact            ");
            System.out.println("             2. Add Personal Contact            ");
            System.out.println("             3. Display Contacts                ");
            System.out.println("             4. Quit                            ");

            select = in.nextInt();
            int number = 1;
 
            switch (select){ 
                case 1:
                    contacts = new Business();
                    contacts.setDetails();
                    contactList.add(contacts);
                    break;
                case 2:
                    contacts = new Personal();
                    contacts.setDetails();
                    contactList.add(contacts);
                    break;
                case 3:
                    int count;
                    for (Contact contact: contactList ){
                        System.out.println(number + " " + contact.getName());
                        number++;
                        }
                    
                    System.out.println("Select the number for each contacts details ");
                    String helper = in.next();
                    int item = Integer.parseInt(helper);
                    item -= 1;
                    count = item;
                    String detail = contactList.get(item).getDetails();
                    System.out.println(detail);
                    
                    
                    System.out.println("\n Would you like a detailed list"
                            + "of your contacts? Y/N  \n");
                        printing = in.next();
                        
                    switch (printing){
                        case "y":
                            for (Contact contact : contactList) {
                                String details = contact.getDetails();
                                System.out.println(details);
                            }
                        case "n":
                            break;
                        default:
                            break;
                    }break;
                case 4:
                    break;
                default:
                    System.out.println("That is not a vaild option.");
            }
        } while (select != 4);
        System.out.println("Good-Bye!!");
       }
    }
