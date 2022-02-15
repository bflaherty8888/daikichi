<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container text-center my-3">
		<h1>Here's Your Omikuji!</h1>
		<div class="bg-light border rounded w-50 mx-auto p-3 my-3">
			<h2>
				In
				<c:out value="${ year }"></c:out>
				years, you will live in
				<c:out value="${ city }"></c:out>
				with
				<c:out value="${ person }"></c:out>
				as your roommate, 
				<c:out value="${ hobby }"></c:out>
				for a living. The next time you see a
				<c:out value="${ organism }"></c:out>
				you'll have good luck. Also,
				<c:out value="${ compliment }"></c:out>
			</h2>
		</div>
		<a href="/omikuji" class="btn btn-primary">Go Back</a>
	</div>
</body>
</html>