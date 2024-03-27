<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>deletion of account</title>

<link rel="stylesheet" href="bootstrap-5.0.2-dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="bootstrap-5.0.2-dist/css/bootstrap-theme.min.css">
</head>
<body>
	<h1 class="text-center mt-5">deletion of account</h1>
	<div class="container text-center p-5 shadow">
		<form action="delete" method="post">


			<%-- Enter your name<input type="text" name="name"/><br>
			<p>enter your mobile number:</p>
			<input type="number" name="mobNo" />  --%>

			<div class="mb-3 col-lg-4 m-auto">
				<label class="form-label">enter your mobile number:</label>
				<input class="form-control" type="number" name="mobNo" >
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<script src="bootstrap-5.0.2-dist/js/jquery-3.5.1.slim.min.js"></script>
	<script src="bootstrap-5.0.2-dist/js/popper.min.js"></script>
	<script src="bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
</body>
</html>