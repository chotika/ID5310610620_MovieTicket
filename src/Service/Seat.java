/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.io.Serializable;
import java.util.Hashtable;
/**
 *
 * @author Administrator
 */
public class Seat implements Serializable {
        //field
	private Integer seatID;
	private Integer seatNo;
	private String seatRow;
	private Hashtable<Schedule, Boolean> occupied;
	
	public Seat(int seatNo, String seatRow) {
		this.seatID = -1;
		this.seatNo = seatNo;
		this.seatRow = seatRow;
                occupied = new Hashtable<Schedule, Boolean>();
	}
	
	public int getSeatID() {
		return seatID;
	}
	
	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}
	
	public int getSeatNo() {
		return seatNo;
	}
	
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	public String getSeatRow() {
		return seatRow;
	}
	
	public void setSeatRow(String seatRow) {
		this.seatRow = seatRow;
	}
	
	// return boolean stating wherether the seat is occupied at particular showTime
	public boolean isOccupiedAt(Schedule showTime) {
		return occupied.get(showTime);
	}
	
	public void setOccupiedAt(Schedule showTime, boolean value) {
		occupied.put(showTime, value);
	}
}
    

