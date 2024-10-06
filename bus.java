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
public class bus {
    private int busno;
    private boolean ac;
    private int capacity;
    
    bus(int no , boolean ac , int capacity ){ 
        this.busno = no;
        this.ac = ac ; 
        this.capacity = capacity;
    } 
    
    public int getbusno(){ 
        return busno;
    } 
    
    public boolean  getac(){ 
        return ac;
    } 
    
    public void setac(boolean ac){ 
        this.ac = ac;
    } 
    
    public int getcapacity(){ 
        return capacity;
    } 
    
    public void setcapacity(int cap){
        this.capacity = cap;
    } 
    
    public void displaybusinfo(){
        System.out.println("Bus number : "+busno+" , AC availability : "+ac+" , Capacity of bus : "+capacity);
  
    }
}
