<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href=https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/litera/bootstrap.min.css>
</head>
<body>

	<h1>Hotel Search</h1>
<form action="hotelpage">
	<select name= "city" id="citylist" required>
		<option value="">--Please select a city--</option>
		<option value="detroit">Detroit</option>
		<option value="dearborn">Dearborn</option>
		<option value="livonia">Livonia</option>
	</select>
	<br><br><input type="submit" value="Go!">
	</form>
</body>
</html>