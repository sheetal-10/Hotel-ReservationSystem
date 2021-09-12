package com.HotelReservationSystemTestCase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.HotelreservationSystem.HotelReservation;

public class HotelReservationSystemTest {

	HotelReservation addHotel1 = new HotelReservation("LakeWood", "Regular");
	HotelReservation addHotel2 = new HotelReservation("BridgeWood", "Regular");
	HotelReservation addHotel3 = new HotelReservation("RidgeWood", "Regular");
	HotelReservation cheapestHotel = new HotelReservation();

	@Test
	public void toCheck_HotelDetails() {
		addHotel1.addHotelDetails();
	}

	@Test
	public void toCheck_CheapHotel() {
		cheapestHotel.cheapestHotel();
	}

	@Test
	public void toCheck_Weekday_Weekend_Rate() {
		addHotel1.weekdayWeekendRate();
		addHotel2.weekdayWeekendRate();
		addHotel3.weekdayWeekendRate();
	}

	@Test
	public void toCheck_Cheapest_Weekday_Weekend_Hotel() {
		addHotel1.cheapestWeekdayWeekendHotel();
		addHotel2.cheapestWeekdayWeekendHotel();
		addHotel3.cheapestWeekdayWeekendHotel();
	}

	 @Test
	    public void toCheck_hotelRating() {
	        addHotel1.hotelRating();
	        addHotel2.hotelRating();
	        addHotel3.hotelRating();
	    }
}
