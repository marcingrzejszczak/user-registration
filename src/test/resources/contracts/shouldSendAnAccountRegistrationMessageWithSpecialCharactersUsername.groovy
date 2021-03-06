package au.net.example.userclient

import org.springframework.cloud.contract.spec.Contract

Contract.make {
		
	description "should send an account registration message with special characters in username"
	label "triggerAccountRegistrationWithSpecialCharacters"
	input {
		triggeredBy("triggerMessageWithSpecialCharacters()")
	}
	outputMessage {
		sentTo "registration-account"
		body([
			firstName: "Joe", 
			lastName: "Doe", 
			email: "joe.doe+test@gmail.com", 
			mobileNumber: "0452621048", 
			ipAddress: "127.0.0.1",
			birthday: "1979-10-16",
			password: "Test01"
			])		
	}
}