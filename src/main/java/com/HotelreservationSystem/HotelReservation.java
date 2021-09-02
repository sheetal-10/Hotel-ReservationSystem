package com.HotelreservationSystem;

import java.util.ArrayList;

/**
 * Implementing Hotel Reservation System Program
 * @author Sheetal
 * @since 2021-09-02
 */
public class HotelReservation {
	
	// ArrayList to store Hotel List
	public ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	/**
	 * Created a method addHotelDetails to 
	 * add the hotels in the array list
	 */
	public void addHotelDetails() {
		hotelList.add(new Hotel("Lakewood", 110));
		hotelList.add(new Hotel("Bridgewood", 160));
		hotelList.add(new Hotel("Ridgewood", 220));
	}

	public static void main(String[] args) {
		//welcome message
		System.out.println("Welcome to Hotel Reservation System");
	}
}
