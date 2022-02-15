<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Omikuji</title>
</head>
<body>
	<div class="container py-4">
		<h1 class="text-center">Send an Omikuji!</h1>

		<form action="/omikuji/process" method="post"
			class="form-control mx-4 p-3">
			<label for="year" class="form-label">Pick any number from 5
				to 25:</label> <input type="number" name="year" id="year"
				class="form-control" value="5"> <label for="city"
				class="form-label">Enter the name of any city:</label> <input
				type="text" name="city" id="city" class="form-control"> <label
				for="person" class="form-label">Enter the name of any real
				person:</label> <input type="text" name="person" id="person"
				class="form-control"> <label for="hobby" class="form-label">Enter
				professional endeavor or hobby:</label> <input type="text" name="hobby"
				id="hobby" class="form-control"> <label for="organism"
				class="form-label">Enter any type of living thing:</label> <input
				type="text" name="organism" id="organism" class="form-control">
			<label for="compliment" class="form-label">Say something nice
				to someone:</label>
			<textarea name="compliment" id="compliment" class="form-control"
				rows="4"></textarea>
			<input type="submit" value="Send"
				class="form-control btn btn-primary mt-2">
		</form>
	</div>
</body>
</html>