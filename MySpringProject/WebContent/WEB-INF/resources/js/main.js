$(function() {
	$("#registervalid").validate({
		rules: {
			username: {
		        required: true,
		        nowhitespace: true,
		        lettersonly: true,
		        maxlength: 20
			},
			dob: {
				required: true,
		        date: true
			},
			email: {
		        required: true,
		        email:true
		        },
		        pwd: {
			    required: true,
			    minlength:5,
			    maxlength:10
		     	},	
		     	cpwd:{
		     		required:true,
		     		minlength:5,
		     		maxlength:10,
		     		equalTo:"#pwd"
		     	}
		}
		});
});







