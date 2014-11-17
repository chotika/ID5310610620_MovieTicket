/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Administrator
 */
public class Schedule implements Serializable {
	
	private Integer showTimeID;
	private Date time;
	private Movie movie;
	
	
	public Schedule(Movie movie, Date time) {
		this.showTimeID = -1;
		this.movie = movie;
		this.time = time;
	
	}
	
	public void setShowTimeID(int showTimeID) {
		this.showTimeID = showTimeID;
	}
	
	public int getShowTimeID() {
		return showTimeID;
	}
	
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public Movie getMovie() {
		return movie;
	}
		
 	public void setTime(Date time) {
 		this.time = time;
 	}
 	
 	public Date getTime() {
 		return time;
 	}

}
