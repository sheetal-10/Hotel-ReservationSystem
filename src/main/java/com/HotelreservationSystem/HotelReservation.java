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
	public void weekdayWeekendRate(){
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
	 * Created method to 
	 * show cheapest hotel on given date range
	 * based on weekday rates and weekend rates
	 */
	public void cheapestWeekdayWeekendHotel(){
        int sum_LakeWood = 0,sum_BridgeWood = 0, sum_RidgeWood = 0;
        if (hotel == "LakeWood") {
            int weekday_rate = 110;
            int weekend_rate = 90;
            sum_LakeWood = (sum_LakeWood+weekday_rate+weekend_rate);
            System.out.println("Total Weekday and Weekend rate of LakeWood Hotel:" + sum_LakeWood);
        }
        if (hotel == "BridgeWood") {
            int weekday_rate = 150;
            int weekend_rate = 50;
            sum_BridgeWood = (sum_BridgeWood+weekday_rate+weekend_rate);
            System.out.println("Total Weekday and Weekend rate of BridgeWood Hotel:" + sum_BridgeWood);
        }
        if (hotel == "RidgeWood") {
            int weekday_rate = 220;
            int weekend_rate = 150;
            sum_RidgeWood = (sum_RidgeWood+weekday_rate+weekend_rate);
            System.out.println("Total Weekday and Weekend rate of RidgeWood Hotel:" + sum_RidgeWood);
        }
        if (sum_LakeWood<=sum_BridgeWood && sum_LakeWood<sum_RidgeWood){
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (sum_BridgeWood<=sum_LakeWood && sum_BridgeWood<sum_RidgeWood){
            System.out.println("LakeWood and BridgeWood with total rates $200.");
        }
        if (sum_RidgeWood<sum_LakeWood && sum_RidgeWood<sum_BridgeWood){
            System.out.println("RidgeWood with total rates $370.");
        }
    }

	/**
	 * Main method to print welcome message and 
	 * cheapest hotel method and all other methods 
	 * displaying cheapest hotel in the given date duration and 
	 * displaying the rates of different hotels on different days
	 * @param args unused
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// welcome message
		System.out.println("Welcome to Hotel Reservation System");
		HotelReservation Lakewood = new HotelReservation("LakeWood","Regular");
        HotelReservation Bridgewood = new HotelReservation("BridgeWood","Regular");
        HotelReservation Ridgewood = new HotelReservation("RidgeWood","Regular");
        String sDate1="10-09-2020";
        String sDate2="11-09-2020";
        Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1+"\t"+date1);
        System.out.println(sDate2+"\t"+date2);
		Lakewood.cheapestWeekdayWeekendHotel();
		Bridgewood.cheapestWeekdayWeekendHotel();
		Ridgewood.cheapestWeekdayWeekendHotel();
	}
}
