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
		addHotel1.weekday_weekend_rate();
		addHotel2.weekday_weekend_rate();
		addHotel3.weekday_weekend_rate();
	}
}
