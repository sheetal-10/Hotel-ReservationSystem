package com.HotelReservationSystemTestCase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.HotelreservationSystem.HotelReservation;

public class HotelReservationSystemTest {
	HotelReservation Obj = new HotelReservation();
	HotelReservation cheapestHotel = new HotelReservation();

	@Test
	public void addedList_toCheck_bySize() {
		Obj.addHotelDetails();
		assertEquals("Adding 3 Hotels into the list", 3, Obj.hotelList.size());
	}
	
	 @Test
	    public void toCheck_CheapHotel() {
		 cheapestHotel.cheapestHotel();
	    }
}
