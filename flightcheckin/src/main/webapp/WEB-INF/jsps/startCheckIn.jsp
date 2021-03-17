<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Start Check In</title>
</head>
<body>
	<form action="startCheckIn" method="post">
		<table>
			<tr>
				<td>Enter the Reservation ID</td>
				<td><input type="text" name="reservationId"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Start Checkin"></td>
			</tr>
		</table>
	</form>
</body>
</html>