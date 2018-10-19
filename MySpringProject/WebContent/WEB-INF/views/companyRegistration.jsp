<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company Registration Page</title>
</head>
<body>
<body style="background-color: #999999;">
	<link rel="stylesheet" type="text/css" href="resources/css/studentUtil.css">
	<link rel="stylesheet" type="text/css" href="resources/css/studentRegistration.css">
	<div class="limiter">
		<div class="container-login100">
			<div class="login100-more" ></div>

			<div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
				<form class="login100-form validate-form" action="companyRegistrationSuccess" method="post">
					<span class="login100-form-title p-b-59">
						Sign Up
					</span>

					<div class="wrap-input100 validate-input" data-validate="Name is required">
						<span class="label-input100">Full Name</span>
						<input class="input100" type="text" name="name" placeholder="Name...">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<span class="label-input100">Email</span>
						<input class="input100" type="text" name="email" placeholder="Email addess...">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Username is required">
						<span class="label-input100">Username</span>
						<input class="input100" type="text" name="username" placeholder="Username..." maxlength="10">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="password" name="pass" placeholder="*************" id="password">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Repeat Password is required">
						<span class="label-input100">Repeat Password</span>
						<input class="input100" type="password" name="repeat-pass" placeholder="*************" id="confirm_password">
						<span class="focus-input100"></span>
					</div>
					

					
					<div class="wrap-input100 validate-input" data-validate="Description is required">
							<span class="label-input100 validate-input">Comapny Description</span>
							<input class="input100" type="text" name="description" placeholder="Company Description" maxlength="100">
							<span class="focus-input100"></span>
						</div>
						<!-- TODO -->
							<span class="label-input100">Address</span>
						
						
						<div class="wrap-input100 validate-input" data-validate="Street Name is required">
							<span class="label-input100">Street Name</span>
							<input class="input100" type="text" name="streetName" placeholder="Street Name">
							<span class="focus-input100"></span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="City is Required">
							<span class="label-input100">City</span>
							<span class="focus-input100">
							<select name="city">
							<option value="Mumbai">Mumbai</option>
							<option value="Pune">Pune</option>
							<option value="Banglore">Banglore</option>
							<option value="Hyderabad">Hyderabad</option>
							<option value="Chennai">Chennai</option>
							<option value="other">other</option>
							</select>
							
							</span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="State is required">
							<span class="label-input100">State</span>
							<span class="focus-input100">
							<select name="companyState">
							<option value="Maharashtra">Maharashtra</option>
							<option value="karnataka">karnataka</option>
							<option value="kerala">kerala</option>
							<option value="Telangana">Telangana</option>
							<option value="TamilNadu">TamilNadu</option>
							<option value="other">other</option>
							</select>
							</span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="Country is Required">
							<span class="label-input100">Country</span>
							
							<span class="focus-input100">
							<select name="companyCountry">
							<option value="India">India</option>
							<option value="other">other</option>
							</select>
				            </span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="Pin code is required">
							<span class="label-input100">Pin Code</span>
							<input class="input100" type="number" name="companyPinCode" placeholder="Pin code." maxlength="6">
							<span class="focus-input100"></span>
							
						</div>
						<div class="wrap-input100 validate-input" data-validate="Job Location is required">
							<span class="label-input100">Job Location</span>
							<input class="input100" type="text" name="jobLocation" placeholder="Job Location">
							<span class="focus-input100"></span>
						</div>
						<div class="wrap-input100">
							<span class="label-input100">Criteria</span><br>
							<select name="criteria">
						<option value="60">Above 60%</option>
						<option value="70">Above 70%</option>
						<option value="80">Above 80%</option>
						<option value="90">Above 90%</option>
</select>
							<span class="focus-input100"></span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="Package is required">
							<span class="label-input100">Package Offered in LPA</span>
							<input class="input100" type="number" name="packagee" placeholder="Package Offered" step=".01">
							<span class="focus-input100"></span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="No of posts are Important">
							<span class="label-input100">No of posts</span>
							<input class="input100" type="number" name="noofPosts" placeholder="No of posts Available">
							<span class="focus-input100"></span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="Interview Process is required">
							<span class="label-input100">Interview Process</span>
							<input class="input100" type="text" name="intprocess" placeholder="interview process" maxlength="800">
							<span class="focus-input100"></span>
						</div>
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
						<div class="flex-m w-full p-b-33">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
						</div>
					</div>
				

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button type="submit" class="login100-form-btn">
								Sign Up
							</button>
						</div>

						<a href="home" class="dis-block txt3 hov1 p-r-30 p-t-10 p-b-10 p-l-30">
							Sign in
							<i class="fa fa-long-arrow-right m-l-5"></i>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="resources/js/main.js"></script>
</body>
</html>