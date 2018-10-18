$(function() {
	$("#loginValidate").validate({
		rules: {
			userName: {
		        required: true,
		        nowhitespace: true,
		        lettersonly: true,
		        maxlength: 10
			},
			password: {
			    required: true,
			    minlength:5,
			    maxlength:10
		     	},	
		     	
		}
		});
});

