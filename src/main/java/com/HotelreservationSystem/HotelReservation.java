package com.HotelreservationSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Implementing Hotel Reservation System Program
 * @author Sheetal
 * @since 2021-09-04
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

	/**
	 * Created a method to 
	 * show the cheapest hotel within given date 
	 */
	public void cheapestHotel() {
		int count = 0;
		count = (count + 2);
		int LakeWood_Rate = 110, BridgeWood_Rate = 160, RidgeWood_Rate = 220;
		LakeWood_Rate = (LakeWood_Rate * count);
		BridgeWood_Rate = (BridgeWood_Rate * count);
		RidgeWood_Rate = (RidgeWood_Rate * count);
		if (LakeWood_Rate < BridgeWood_Rate && LakeWood_Rate < RidgeWood_Rate) {
			System.out.println("LakeWood");
			System.out.println(LakeWood_Rate);
		}
		if (BridgeWood_Rate < LakeWood_Rate && BridgeWood_Rate < RidgeWood_Rate) {
			System.out.println("BridgeWood");
			System.out.println(BridgeWood_Rate);
		}
		if (RidgeWood_Rate < BridgeWood_Rate && RidgeWood_Rate < LakeWood_Rate) {
			System.out.println("RidgeWood");
			System.out.println(RidgeWood_Rate);
		}
	}

	/**
	 * Main method to print welcome message and 
	 * cheapest hotel method and 
	 * displaying cheapest hotel in the given date duration
	 * @param args unused
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// welcome message
		System.out.println("Welcome to Hotel Reservation System");
		String sDate1 = "23-09-2020";
		String sDate2 = "25-09-2020";
		Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
		Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
		System.out.println(sDate1 + "\t" + date1);
		System.out.println(sDate2 + "\t" + date2);
		HotelReservation hotel = new HotelReservation();
		hotel.cheapestHotel();
	}
}
