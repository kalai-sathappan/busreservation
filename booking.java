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


import java.text.ParseException;
import java.util.*; 
import java.text.SimpleDateFormat;
public class booking {
    String passenger;
    int busno;
    Date date; 
    
    booking() throws ParseException{ 
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter passenger name : "); 
        passenger = sc.next(); 
        
        System.out.println("Enter bus number : "); 
        busno = sc.nextInt(); 
        
        System.out.println("Enter date of travel :format[dd-mm-yyyy] ");  
        String dateinput = sc.next();
        
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy"); 
        date = format.parse(dateinput);
        
    } 
    public boolean isAvailable(ArrayList<booking>bookings , ArrayList<bus>buses){ 
        int capacity = 0;
        
        for(bus b : buses){ 
            if(b.getbusno() == busno){ 
                capacity = b.getcapacity();
            }
        } 
        
        int c = 0; 
        
        for(booking b : bookings){ 
            if(b.busno == busno & b.date.equals(date)){
                c++;
            }
        } 
        
        return (c<capacity)?true:false;
    }
}
