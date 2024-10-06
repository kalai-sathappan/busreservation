/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservation;

/**
 *
 * @author user
 */
 import java.util.*;
public class Busreservation {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws Exception {
        // TODO code application logic here  
        
        ArrayList<bus> buses = new ArrayList<>();  
        
        ArrayList<booking> bookings = new ArrayList<>();
        
        buses.add(new bus(1,true,50)); 
        buses.add(new bus(2,true,2));
        Scanner sc = new Scanner(System.in);
        int input = 1; 
        for(bus i : buses){ 
            i.displaybusinfo();
        }
        while(input == 1){ 
            System.out.println("Enter 1 to start booking or 2 to stop :");
        input = sc.nextInt(); 
        if(input == 1){ 
            booking book = new booking(); 
            
            if(book.isAvailable(bookings , buses)){ 
                bookings.add(book);
                System.out.println(" Your Booking is confirmed !!!");
            } 
            else{ 
                System.out.println("Bus is Full try another date OR bus"); 
            }
        }
        }
                
    }
    
}
