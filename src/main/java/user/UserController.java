package user;

import java.util.List;

import java.util.*;

import org.apache.commons.logging.Log;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//-----------------------------------------------------
//Title: UserController
//Author:Alperen Aslan
//Definition : This class is for CRUD methods which are create,read,update,delete.
//Resource : https://spring.io/guides/tutorials/rest/
//------------------------------------------------------

@RestController
class UserController {

	private final UserRepository repository;

	UserController(UserRepository repository) {
		this.repository = repository;
	}

	// Read(get) method for all users.
	@GetMapping("/users")
	List<User> all() {
		return repository.findAll();
	}

	// Update(post) method for all users.
	@PostMapping("/users")
	User newUser(@RequestBody User newUser) {
		return repository.save(newUser);
	}

	// Read(get) method for a specific user by id.

	@GetMapping("/users/{id}")
	User one(@PathVariable Long id) {
		// User not found exception
		return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	// Create(put) a new user by id.
	@PutMapping("/users/{id}")
	User replaceUser(@RequestBody User newUser, @PathVariable Long id) {

		return repository.findById(id).map(User -> {
			User.setName(newUser.getName());

			return repository.save(User);
		}).orElseGet(() -> {
			newUser.setId(id);
			return repository.save(newUser);
		});
	}

	// Delete a user by id.
	@DeleteMapping("/users/{id}")
	void deleteUser(@PathVariable Long id) {
		repository.deleteById(id);

	}
}