<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>

<body background="resources/images/bg-01.jpg">
	<link rel="stylesheet" type="text/css" href="resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="resources/css/main.css">
	<div class="limiter">
		<div class="container-login100" style="background-image: url('resources/images/bg-01.jpg');">
			<div class="wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33">
				
					<span class="login100-form-title p-b-53">
						Sign In to Job_Portal
					</span>
					
					
					<form action="studentHome">
					<div class="container-login100-form-btn m-t-17">
					
						<button class="login100-form-btn">
							Student Login
						</button>
						
					</div>
					</form>
					<form action="companyHome">
					<div class="container-login100-form-btn m-t-17">
					
						<button class="login100-form-btn">
							Company Login
						</button>
						
					</div>
					</form>
					<form action="adminHome">
					<div class="container-login100-form-btn m-t-17">
					
						<button class="login100-form-btn" align="center">
							Admin Login
						</button>
						</form>
					</div>
					</div>
					
				
			</div>
		</div>
	</div>
</body>
</html>
