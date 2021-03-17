<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>
</head>
<body>
	<h2>Flight Details</h2>
		<table>
			<tr>
				<td>AirLines</td>
				<td>${reservation.flight.operatingAirlines}</td>
			</tr>
			<tr>
				<td>Flight No</td>
				<td>${reservation.flight.flightNumber}</td>
			</tr>
			<tr>
				<td>Departure City</td>
				<td>${reservation.flight.departureCity}</td>
			</tr>
			<tr>
				<td>Arrival City</td>
				<td>${reservation.flight.arrivalCity}</td>
			</tr>
			<tr>
				<td>Departure Date</td>
				<td>${reservation.flight.dateOfDeparture}</td>
			</tr>
			<tr>
				<td>Estimated Departure Time</td>
				<td>${reservation.flight.estimatedDepartureTime}</td>
			</tr>
		</table>
		
		<h2>Passenger Details</h2>
		
		<table>
			<tr>
				<td>First Name</td>
				<td>${reservation.passenger.firstName}</td>
			</tr>
			
			<tr>
				<td>Last Name</td>
				<td>${reservation.passenger.firstName}</td>
			</tr>
			
			<tr>
				<td>Email</td>
				<td>${reservation.passenger.email}</td>
			</tr>
			
			<tr>
				<td>Phone</td>
				<td>${reservation.passenger.phone}</td>
			</tr>
		</table>
	
	<form action="completedCheckIn" method="post">
	<table>
			<tr>
				<td>Number of Bags you want check in</td>
				<td><input type="text" name="numberOfBags"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="CheckIN"></td>
			</tr>
			
			
	</table>
	<input type="hidden" value="${reservation.id}" name="reservationID"/>
	</form>


</body>
</html>