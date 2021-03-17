package com.jaheer.flightcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaheer.flightcheckin.entities.Reservation;
import com.jaheer.flightcheckin.entities.ReservationUpdateRequest;
import com.jaheer.flightcheckin.integration.ReservationsRestClient;

@Controller
public class CheckInController {
	
	@Autowired
	ReservationsRestClient restClient;
	@RequestMapping("/showStartCheckIn")
	public String showStartCheckin()
	{
		return "startCheckIn";
	}
	
	@RequestMapping("/startCheckIn")
	public String startCheckin(@RequestParam("reservationId") long id,ModelMap map)
	{
		Reservation reservation=restClient.findReservation(id);
		map.addAttribute("reservation", reservation);
		return "displayReservationDetails";
	}
	
	@RequestMapping("/completedCheckIn")
	public String completeCheckin(@RequestParam("reservationID") long reservationId,
			@RequestParam("numberOfBags") int numberOfBags)
	{ 	ReservationUpdateRequest reservationUpdateReq=new ReservationUpdateRequest();
		reservationUpdateReq.setCheckedIn(true);
		reservationUpdateReq.setId(reservationId);
		reservationUpdateReq.setNumberOfBags(numberOfBags);
		restClient.updateReservation(reservationUpdateReq);
		return "checkInConfirmation";
	}
}

