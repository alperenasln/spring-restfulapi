package user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//-----------------------------------------------------
//Title: UserApplication
//Author:Alperen Aslan
//Definition : This class is main application class to run it.
//Resource : https://spring.io/guides/tutorials/rest/
//------------------------------------------------------
@SpringBootApplication
public class UserApplication {

	public static void main(String... args) {
		SpringApplication.run(UserApplication.class, args);
	}
}