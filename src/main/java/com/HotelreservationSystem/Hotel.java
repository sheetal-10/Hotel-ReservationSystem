package com.HotelreservationSystem;

/**
 * Constructor Class for the Hotel Reservation system
 * @author Sheetal
 * @since 2021-09-04
 */
public class Hotel {
	
	//instance variables
	private String hotelName;
	private int regularPrice;
	
	//parameterised constructor to initialise the instance variables
	public Hotel (String hotelName, int regularPrice) {
		this.hotelName= hotelName;
		this.regularPrice = regularPrice;
	}
	
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(int regularPrice) {
		this.regularPrice = regularPrice;
	}
}
