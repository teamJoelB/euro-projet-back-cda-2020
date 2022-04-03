package fr.cda.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.entities.User;
import fr.cda.repository.UserRepository;

@RestController @CrossOrigin("*")
public class UserRest {
	
	@Autowired
	private UserRepository userRepos;
	
	@PostMapping("user")
	public User saveUser(@RequestBody User u) {
		return userRepos.save(u);
	}
	
	@GetMapping("user")
	public Iterable<User> getAllUser() {
		return userRepos.findAll();
	}
	
	@PostMapping("login")
	public Optional<User> connexion(@RequestBody User u){
		return userRepos.findByLoginAndPassword(u.getLogin(), u.getPassword());
	}

}
