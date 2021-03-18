package user;

//-----------------------------------------------------
//Title: UserNotFoundException
//Author:Alperen Aslan
//Definition : This class is for user not found exception.
//Resource : https://spring.io/guides/tutorials/rest/
//------------------------------------------------------
class UserNotFoundException extends RuntimeException {

	UserNotFoundException(Long id) {
		super("Could not find user " + id);
	}
}