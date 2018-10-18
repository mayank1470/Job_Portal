<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Forgot Password</title>
</head>
<link rel="stylesheet" type="text/css" href="resources/css/studentUtil.css">
	<link rel="stylesheet" type="text/css" href="resources/css/studentRegistration.css">
<body style="background-color: #999999;">
	
	<div class="limiter">
		<div class="container-login100">
			<div class="login100-more" ></div>

			<div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
				<form class="login100-form validate-form" action="studentresetpassword">
					<span class="login100-form-title p-b-59">
						Forgot Password..
					</span>

					<div class="wrap-input100 validate-input" data-validate="Security Answers are required">
						<span class="label-input100">Security Question One</span>
						<span class="label-input100">What is your Mother's Maiden Name?</span>
						<input class="input100" type="text" name="seq1" placeholder="Enter your answer here (Not more than 20 characters)"">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate="Security Answers are required">
						<span class="label-input100">Security Question Two</span>
						<span class="label-input100">What is your favourite food</span>
						<input class="input100" type="text" name="seq2" placeholder="Enter your answer here (Not more than 20 characters)">
						<span class="focus-input100"></span>
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn">
								Reset Password
							</button>
						</div>
						
					</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>