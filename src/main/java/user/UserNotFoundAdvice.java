package user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

//-----------------------------------------------------
//Title: UserNotFoundAdvice
//Author:Alperen Aslan
//Definition : This class is a content for exception handling.
//Resource : https://spring.io/guides/tutorials/rest/
//------------------------------------------------------
@ControllerAdvice
class UserNotFoundAdvice {

	@ResponseBody
	// @ResponseBody signals that this advice is rendered straight into the response
	// body.

	@ExceptionHandler(UserNotFoundException.class)
	// @ExceptionHandler configures the advice to only respond if an
	// UserNotFoundException is thrown.

	@ResponseStatus(HttpStatus.NOT_FOUND)
	// @ResponseStatus says to issue an HttpStatus.NOT_FOUND, i.e. an HTTP 404.
	String userNotFoundHandler(UserNotFoundException ex) {
		return ex.getMessage();
	}
}