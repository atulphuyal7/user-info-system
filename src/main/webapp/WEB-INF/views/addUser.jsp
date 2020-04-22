<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<%@ include file="header.jsp"%>
</head>
<body>
	</div>
	<div>
		<form action="save_user" method="post">
			<div>
				<lable>Username</lable>
				<input type="text" name="username">
			</div>
			<div>
				<label>Password</label> <input type="password" name="password">
			</div>
			<div>
				<label>DOB</label> <input type="date" name="dob">
			</div>
			<div>
				<label>Email</label> <input type="email" name="email">
			</div>
			<div>
				<label>Gender</label> <input type="radio" name="gender" value="Male">Male
				<input type="radio" name="gender" value="Femal">Female
			</div>
			<div>
				<label>Hobbies</label> <input type="checkbox" name="hobbies"
					value="Reading">Reading <input type="checkbox"
					name="hobbies" value="Playing">Playing
			</div>
			<div>
				<label>Nationality</label> <select name="nationality">
					<option value="Nepali">Nepali</option>
					<option value="American">American</option>
					<option value="Chinease">Chinease</option>
				</select>
			</div>
			<div>
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>
</body>
</html>

