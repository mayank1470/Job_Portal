<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<h3>UserName:<input type="text" name="username"></h3>
<h3>Password:<input type="password" name="pwd"></h3>
<h3>Confirm Password:<input type="password" name="confirm pwd"></h3>
<h3>Student Name:<input type="text" name="studentName"></h3>

<h3>Father's Name:<input type="text" name="fname"></h3>
<h3>Mother's Name:<input type="text" name="mname"></h3>
<h3>Date Of Birth:<input type="date" name="dob"></h3>
<h3>Blood Group:<input type="text" name="bloodgroup"></h3>
<h3>Phone Number:<input type="number" name="phoneNumber" maxlength="10"></h3>
<h3>Email:<input type="email" name="email"></h3>
<h3>Branch:
<select>
<option>Electrical and Electronics Engineering</option>
<option>Electronics and Communications Engineering</option>
<option>Computer Science Engineering</option>
<option>Information Science</option>
<option>Civil Engineering</option>
<option>Mechanical Engineering</option>
</select>
</h3>

<a href=education.jsp><input type="submit" value="Next"></a>
</body>
</html>