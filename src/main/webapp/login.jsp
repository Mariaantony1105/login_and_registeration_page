<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<style>
body {
	background-image: url("assests/images/tiger.jpg");
	background-size: cover;
	background-position: center;
}

* {
	text-align: center;
}

h1 {
	text-transform: uppercase;
}

.login {
	margin-top: 10rem;
	display: flex;
	justify-content: center;
	align-items: center;
}

.logfrm {
	border: none;
	box-shadow: 0px 0px 10px 15px rgb(225 85 85/ 24%);
	padding: 10px;
	border-radius: 15px;
	display: flex;
	justify-content: center;
	flex-wrap: wrap;
	width: 250px;
	background: rgba(255, 255, 255, 0.35);
	backdrop-filter: blur(7.5px);
	-webkit-backdrop-filter: blur(7.5px);
}

.lginput {
	padding: 10px;
}

input {
	height: 35px;
	border-radius: 20px;
	border: none;
	box-shadow: inset 0px 0px 12px 4px rgb(225 85 85/ 24%);
	text-align: center;
	color: navy;
	font-weight: 600;
	font-size: 15px;
}

input:active {
	box-shadow: inset 0px 0px 12px 4px rgb(241 0 0/ 41%);
	border: 1px solid white;
}

::placeholder {
	color: red;
	text-transform: capitalize;
}

button {
	padding: 10px 20px;
	border-radius: 20px;
	width: 100px;
	border: none;
	box-shadow: inset 0px 0px 10px -2px lime;
	text-transform: uppercase;
	font-weight: bold;
}

button:active {
	box-shadow: 0px 0px 10px 8px navy;
}
</style>


<body>

	<div class="login">
		<form action="login" method="post" class="logfrm">
			<h1>login</h1>
			<div class="lginput">
				<%-- email: --%>
				<input type="email" name="email" placeholder="Enter your Email" />
			</div>
			<div class="lginput">
				<%-- password: --%>
				<input type="password" name="password"
					placeholder="Enter your password" />
			</div>
			<button type="submit">login</button>
			<p>
				if you don't have a account <a href="index.jsp">click here</a>
			</p>
			<!--  <a href="assests/website/inde.jsp">inde file</a>-->
		</form>
	</div>


</body>
</html>