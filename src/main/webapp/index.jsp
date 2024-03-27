<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
<link rel="icon" type="image/x-icon" href="">
</head>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Dancing+Script:wght@500&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	text-align: center;
	font-family: 'Abril Fatface', serif;
	<%--font-family: 'Dancing Script', cursive; --%>
}

body {
	background-image: url("assests/images/deer.jpg");
	background-position: center;
	background-size: cover;
	background-repeat: no-repeat;
}

.signup {
	margin-top: 1.5rem;
	justify-content: center;
	align-items: center;
	display: flex;
}

.input {
	padding: 30px 0px 0px 30px;
}

input[type="text"], [type="date"], [type="number"], [type="email"], [type="password"]
	{
	height: 40px;
	width: 200px;
	border-radius: 20px;
	border: none;
	box-shadow: 0px 0px 20px 6px #3f2d2d8a;
	color: red;
	text-align: center;
	font-weight: 600;
}

input:active {
	border: none;
}

::placeholder {
	font-size: 15px;
	color: red;
	text-align: center;
	text-transform: capitalize;
	font-weight: 700;
}

button[type="submit"] {
	margin: 1rem 0px 0px;
	padding: 10px 20px;
	border-radius: 15px 15px;
	background-color: #3f2d2d8a;
	font-weight: 700;
	font-size: 15px;
	color: white;
	text-transform: uppercase;
	border: none;
	width: 190px;
	padding: 10px 20px;
}

.formsigup {
	border-radius: 20px;
	border: none;
	box-shadow: 0px 0px 20px 6px #3f2d2d8a;
	padding: 20px;
	background: rgba(255, 255, 255, 0.35);
	backdrop-filter: blur(5px);
	display: flex;
	justify-content: center;
	align-items: center;
	flex-wrap: wrap;
	width: 300px;
}

.signuphead {
	text-transform: uppercase;
}

input[type="date"]::-webkit-calendar-picker-indicator {
	font-size: 20px;
}
</style>
<body>
	<%-- This is a multi-line Java-style comment in a JSP file
    It can span multiple lines
--%>
	<%-- <h1>jdbc using form</h1> --%>
	<%-- <form action="demo" method="post">
		Name:<input type="text" name="c_name" /><br> 
		Mobile Number:<input type="number" name="mobileNo" /><br> 
		Password:<input type="password" name="pass" /><br> 
	<input type="submit" value="login" />
	</form> --%>


	<div class="signup">
		<form action="sign" method="post" class="formsigup">
			<h1 class="signuphead">sign up</h1>
			<div class="input">
				<%-- name: --%>
				<input type="text" name="name" placeholder="enter your name" />
			</div>
			<div class="input">
				<%-- DOB: --%>
				<input type="date" name="date" />
			</div>
			<div class="input">
				<%-- mobile number --%>
				<input type="number" name="mobNo"
					placeholder="enter your Mobile number" />
			</div>
			<div class="input">
				<%-- address: --%>
				<input type="text" name="address" placeholder="enter your address" />
			</div>
			<div class="input">
				<%-- email: --%>
				<input type="email" name="email" placeholder="enter your email" />
			</div>
			<div class="input">
				<%-- password: --%>
				<input type="password" name="pass" placeholder="enter your password" />
			</div>
			<button type="submit">Submit</button>

			<p>
				if you already have a account <a href="login.jsp">click here</a>
			</p>
		</form>
	</div>
	<%--  <div>

			<p>
				if you need to update your account <a href="update.jsp">click
					here</a>
			</p>

			<p>
				if you need to delete your account <a href="delete.jsp">click
					here</a>
			</p>
		</div> --%>
</body>
</html>