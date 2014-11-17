/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;


public class Theatre  {
    
    // constructor
    public Theatre(String name,int id){
        this.name = name;
        this.id = id;
    }
    //field
    private String name;
    private int id;
    private ArrayList<Seat> seatList;
    private ArrayList<Schedule> scheduleList;
    
    //method
    
    public String getDetailTable(){
       
        return seatList.toString()+scheduleList.toString() ; 
    }
    @Override
    public String toString(){
        return name+id+getDetailTable();
    }
}


