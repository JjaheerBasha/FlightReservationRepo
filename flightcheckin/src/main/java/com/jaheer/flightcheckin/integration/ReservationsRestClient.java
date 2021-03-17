package com.jaheer.flightcheckin.integration;

import com.jaheer.flightcheckin.entities.Reservation;
import com.jaheer.flightcheckin.entities.ReservationUpdateRequest;

public interface ReservationsRestClient {

	public Reservation findReservation(long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
	
} 
