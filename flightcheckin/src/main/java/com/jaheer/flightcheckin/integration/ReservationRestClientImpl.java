package com.jaheer.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jaheer.flightcheckin.entities.Reservation;
import com.jaheer.flightcheckin.entities.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationsRestClient {
	
	public static final String RESERVATION_REST_URL="http://localhost:8080/flightreservation/reservations/";

	@Override
	public Reservation findReservation(long id ) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation=restTemplate.
				             getForObject(RESERVATION_REST_URL+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(RESERVATION_REST_URL, request,Reservation.class);
		return null;
	}

}
