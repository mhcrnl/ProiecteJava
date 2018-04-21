/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersoanaV01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class AddressBookMain {
    
    public static void main(String[] args) {
        int select;
        String printing;
        List<ContactV01> listaContacte = new ArrayList<ContactV01>();
        ContactV01 contact;
        PersoanaV01 persoana;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println("<>======= MENIU =============================");
            System.out.println("=============== 1. Add Busines contact====== ");
            System.out.println("================2. Add Personal contact =====");
            System.out.println("================3. Display contacts =========");
            System.out.println("================4. Quit =====================");
            
            select= scan.nextInt();
            int number = 1;
            switch(select){
                case 1:
                    contact = new ContactV01();
                    contact.setDetalii();
                    listaContacte.add(contact);
                    break;
                case 2:
                    persoana = new PersoanaV01();
                    persoana.setDetalii();
                    //listaContacte.add(persoana);
                    break;
                case 3:
                    int count;
                    for(ContactV01 con: listaContacte){
                        System.out.println(number+" "+con.getNume());
                        number++;
                    }
                    System.out.println("Selecteaza un numar pt. fiecare contact:");
                    String helper = scan.next();
                    int item = Integer.parseInt(helper);
                    item-=1;
                    count = item;
                    String detail = listaContacte.get(item).getDetalii();
                    System.out.println(detail);
                    
                    System.out.print("Doriti o lista mai detaliata? Y/N : ");
                    printing = scan.next();
                    switch(printing){
                        case "Y":
                            for(ContactV01 con: listaContacte){
                                String detalii = con.getDetalii();
                                System.out.println(detalii);
                            }
                        case "N": break;
                        default: break;
                    } break;
                case 4: break;
                default:
                    System.out.println("Introduceti o valoare valida!!");
                    
                            
                    }
            
                    
        } while(select !=4);
        System.out.println("La REVEDERE!");
        
    }
    
}
