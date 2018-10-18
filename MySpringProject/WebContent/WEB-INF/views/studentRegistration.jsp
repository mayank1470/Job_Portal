<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Page</title>
</head>
<link rel="stylesheet" type="text/css" href="resources/css/studentUtil.css">
<link rel="stylesheet" type="text/css" href="resources/css/studentRegistration.css">
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
<script src="https://ajax.aspnetcdn.com/ajax/jquery.validate/1.17.0/jquery.validate.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/additional-methods.min.js"></script>

 <script src="resources/js/main.js"></script>
<body style="background-color: #999999;">
	
	<div class="limiter">
		<div class="container-login100">
			<div class="login100-more" ></div>

			<div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
				<form class="login100-form validate-form" action="studentregistrationSuccess" method="post">
					<span class="login100-form-title p-b-59">
						Sign Up
					</span>

					<div class="wrap-input100 validate-input" data-validate="Name is required">
						<span class="label-input100">User Name</span>
						<input class="input100" type="text" name="username" placeholder="User Name..."maxlength="10">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="password" name="pwd" placeholder="*************" id="pwd" >
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Repeat Password is required">
						<span class="label-input100">Confirm Password</span>
						<input class="input100" type="password" name="cpwd" placeholder="*************" id="cpwd">
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate="Full Name is required">
						<span class="label-input100">Full Name</span>
						<input class="input100" type="text" name="name" placeholder="Fullname..." maxlength="10">
						<span class="focus-input100"></span>
					</div>
					
                   <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<span class="label-input100">Email</span>
						<input class="input100" type="email" name="email" id="email" placeholder="Email addess...">
						<span class="focus-input100"></span>
					</div>
				<div class="wrap-input100 validate-input" data-validate="Father's name is required">
						<span class="label-input100">Father's Name</span>
						<input class="input100" type="text" name="fname" placeholder="Father's Name...">
						<span class="focus-input100"></span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate="Mother's name is required">
						<span class="label-input100">Mother's Name</span>
						<input class="input100" type="text" name="mname" placeholder="Mother's Name...">
						<span class="focus-input100"></span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate="Date of Birth is required">
						<span class="label-input100">Date of Birth</span>
						<input class="input100" type="date" name="dob" placeholder="Date of Birth...">
						<span class="focus-input100"></span>
					</div>
				  <div class="wrap-input100 validate-input" data-validate="Blood Group is required">
						<span class="label-input100">Blood Group</span>
						<input class="input100" type="text" name="bloodGroup" placeholder="Blood Group..."maxlength="3">
						<span class="focus-input100"></span>
					</div>
					  <div class="wrap-input100 validate-input" data-validate="Phone Number is required">
						<span class="label-input100">Mobile Number</span>
						<input class="input100" type="number" name="phNo" placeholder="Contact Number..."maxlength="10">
						<span class="focus-input100"></span>
					</div>
					
					 <div class="wrap-input100 validate-input" >
						<span class="label-input100">Alternate Number</span>
						<input class="input100" type="number" name="altNo" placeholder="Alternate Contact Number..."maxlength="10">
						<span class="focus-input100"></span>
					</div>
		
							<span class="label-input100">Permanent Address</span>
							
							<div class="wrap-input100 validate-input" data-validate="Door No is required">
							<span class="label-input100">Door No</span>
							<input class="input100" type="number" name="doorno" placeholder="Door No">
							<span class="focus-input100"></span>
						</div>
				
						<div class="wrap-input100 validate-input" data-validate="Street Name is required">
							<span class="label-input100">Street Name</span>
							<input class="input100" type="text" name="streetName" placeholder="Street Name">
							<span class="focus-input100"></span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate="City is Required">
							<span class="label-input100">City</span>
							<input class="input100" type="number" name="city" >
							<span class="label-input100">
							<select>
							<option>Mumbai</option>
							<option>Pune</option>
							<option>Banglore</option>
							<option>Hyderabad</option>
							<option>Chennai</optioN>
							<option>other</option>
							</select>
							</span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate="State is Required">
							<span class="label-input100">State</span>
							<input class="input100" type="number" name="state" >
							<span class="label-input100">
							<select>
							<option>Maharashtra</option>
							<option>Kerala</option>
							<option>Karnataka</option>
							<option>Punjab</option>
							<option>other</option>
							</select>
							</span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="Country is Required">
							<span class="label-input100">Country</span>
							<input class="input100" type="number" name="country" >
							<span class="label-input100">
							<select>
							<option>India</option>
							<option>other</option>
							</select>
							</span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="Pin code is required">
							<span class="label-input100">Pin Code</span>
							<input class="input100" type="number" name="pincode" placeholder="Pin code"maxlength="6">
							<span class="focus-input100"></span>
							
						</div>
						
							<span class="label-input100">Local Address</span>
							<input type="checkbox"/>
							<div class="wrap-input100 validate-input" data-validate="Door No is required">
							<span class="label-input100">Door No</span>
							<input class="input100" type="text" name="doorno" placeholder="Door No">
							<span class="focus-input100"></span>
						</div>
				
						<div class="wrap-input100 validate-input" data-validate="Street Name is required">
							<span class="label-input100">Street Name</span>
							<input class="input100" type="text" name="streetName" placeholder="Street Name">
							<span class="focus-input100"></span>
						</div>
						 
						 <div class="wrap-input100 validate-input" data-validate="City is Required">
							<span class="label-input100">City</span>
							<input class="input100" type="number" name="city" >
							<span class="label-input100">
							<select>
							<option>Mumbai</option>
							<option>Pune</option>
							<option>Banglore</option>
							<option>Hyderabad</option>
							<option>Chennai</optioN>
							<option>other</option>
							</select>
							</span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate="State is Required">
							<span class="label-input100">State</span>
							<input class="input100" type="number" name="state" >
							<span class="label-input100">
							<select>
							<option>Maharashtra</option>
							<option>Kerala</option>
							<option>Karnataka</option>
							<option>Punjab</option>
							<option>other</option>
							</select>
							</span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="Country is Required">
							<span class="label-input100">Country</span>
							<input class="input100" type="number" name="country" >
							<span class="label-input100">
							<select>
							<option>India</option>
							<option>other</option>
							</select>
							</span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="Pin code is required">
							<span class="label-input100">Pin Code</span>
							<input class="input100" type="number" name="pincode" placeholder="Pin code"maxlength="6">
							<span class="focus-input100"></span>
							
							
							<div class="wrap-input100 validate-input" data-validate="Document is required">
                        <span class="label-input100">Upload Photo</span>
                        <form action = "UploadServlet" method = "post"
                         enctype = "multipart/form-data">
                         <input class="input100" type = "file" name ="photo" size = "15" /></form>
                          <span class="focus-input100"></span>
                          </div>
							
						</div>
						<span class="label-input100"><b>Education Details</b></span><br>
						<span class="label-input100">SSC</span>
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Percentage</span>
							<input class="input100" type="number" name="per" placeholder="percentage...">
							<span class="focus-input100"></span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Year of passing</span>
							<select>
							<option>2016</option>
							<option>2017</option>
							<option>2018</option>
							</select>
							<span class="focus-input100"></span>
						</div>
						
						
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Syllabus</span>
							<input class="input100" type="text" name="syllabus" placeholder="syllabus...">
							<span class="focus-input100"></span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Board</span>
							<input class="input100" type="text" name="board" placeholder="board...">
							<span class="focus-input100"></span>
						</div>
						<div class="wrap-input100 validate-input" data-validate="Document is required">
                        <span class="label-input100">Upload Document</span>
                        <form action = "UploadServlet" method = "post"
                         enctype = "multipart/form-data">
                         <input class="input100" type = "file" name = "sscdocument" size = "15" /></form>
                          <span class="focus-input100"></span>
                          </div>
						
						
						
						
						
						<span class="label-input100">HSC</span>
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Percentage</span>
							<input class="input100" type="number" name="per" placeholder="percentage...">
							<span class="focus-input100"></span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Year of passing</span>
							<select>
							<option>2016</option>
							<option>2017</option>
							<option>2018</option>
							</select>
							<span class="focus-input100"></span>
						</div>
						
						
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Syllabus</span>
							<input class="input100" type="text" name="syllabus" placeholder="syllabus...">
							<span class="focus-input100"></span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Board</span>
							<input class="input100" type="text" name="board" placeholder="board....">
							<span class="focus-input100"></span>
						</div>
						
						
						
						<div class="wrap-input100 validate-input" data-validate="Document is required">
                        <span class="label-input100">Upload Document</span>
                        <form action = "UploadServlet" method = "post" enctype = "multipart/form-data">
                         <input class="input100" type = "file" name = "hscdocument" size = "15" /></form>
                          <span class="focus-input100"></span>
                          </div>
						
						
					<span class="label-input100">Graduation</span>
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Percentage</span>
							<input class="input100" type="number" name="per" placeholder="percentage...">
							<span class="focus-input100"></span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Year of passing</span>
							<select>
							<option>2016</option>
							<option>2017</option>
							<option>2018</option>
							</select>
							<span class="focus-input100"></span>
						</div>
						
						
						
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Syllabus</span>
							<input class="input100" type="text" name="syllabus" placeholder="syllabus...">
							<span class="focus-input100"></span>
						</div>
						
						<div class="wrap-input100 validate-input" data-validate="percentage is required">
							<span class="label-input100">Board</span>
							<input class="input100" type="text" name="per" placeholder="percentage...">
							<span class="focus-input100"></span>
						</div>
						
						
						
						<div class="wrap-input100 validate-input" data-validate="Document is required">
                        <span class="label-input100">Upload Document</span>
                        <form action = "UploadServlet" method = "post"
                         enctype = "multipart/form-data">
                         <input class="input100" type = "file" name = "file" size = "15" /></form>
                          <span class="focus-input100"></span>
                          </div>
						
						<div class="wrap-input100 validate-input" data-validate="Security Answers are required">
						<span class="label-input100">Security Question One</span>
						<span class="label-input100">What is your Mother's maiden name?</span>
						<input class="input100" type="text" name="seq1" placeholder="Enter your answer here (Not more than 20 characters)">
						<span class="focus-input100"></span>
					</div>
						
								
						
						<div class="wrap-input100 validate-input" data-validate="Security Answers are required">
						<span class="label-input100">Security Question Two</span>
						<span class="label-input100">What is your favourite food?</span>
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

						<a href="cdashboard" class="dis-block txt3 hov1 p-r-30 p-t-10 p-b-10 p-l-30">
							Sign in
							<i class="fa fa-long-arrow-right m-l-5"></i>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>