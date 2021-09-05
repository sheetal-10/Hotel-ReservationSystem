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
	
	String hotel;
    String customer;
    public HotelReservation(){
        hotel = " ";
        customer = " ";
    }
    
    //constructor
    public HotelReservation(String hotel,String customer){
        this.hotel = hotel;
        this.customer = customer;
    }
    
	/**
	 * Created a method addHotelDetails to 
	 * add the hotels and their details
	 */
	public void addHotelDetails() {
		if (hotel == "LakeWood") {
            int rate = 110;
            System.out.println("Rate of Regular Customers of LakeWood Hotel:" + rate);
        }
        if (hotel == "BridgeWood") {
            int rate = 160;
            System.out.println("Rate of Regular Customers of BridgeWood Hotel:" + rate);
        }
        if (hotel == "RidgeWood") {
            int rate = 220;
            System.out.println("Rate of Regular Customers of RidgeWood Hotel:" + rate);
        }
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
	 * Created method to 
	 * Calculate weekdays rate and weekend rates of 
	 * regular customer of hotel
	 */
	public void weekday_weekend_rate(){
        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            System.out.println("Weekday Rate of Regular Customers of LakeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of LakeWood Hotel:" + weekend_rate);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            System.out.println("Weekday Rate of Regular Customers of BridgeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of BridgeWood Hotel:" + weekend_rate);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            System.out.println("Weekday Rate of Regular Customers of RidgeWood Hotel:" + weekday_rate);
            System.out.println("Weekend Rate of Regular Customers of RidgeWood Hotel:" + weekend_rate);
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
		HotelReservation Lakewood = new HotelReservation("LakeWood","Regular");
        HotelReservation Bridgewood = new HotelReservation("BridgeWood","Regular");
        HotelReservation Ridgewood = new HotelReservation("RidgeWood","Regular");
		Lakewood.weekday_weekend_rate();;
		Bridgewood.weekday_weekend_rate();
		Ridgewood.weekday_weekend_rate();
	}
}
