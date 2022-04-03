package fr.cda.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.entities.Poule;
import fr.cda.repository.PouleRepository;

@RestController @CrossOrigin("*")
public class PouleRest {
	
	@Autowired
	private PouleRepository pouleRepos;
	
	@GetMapping("poule")
	public Iterable<Poule> getAllPoule() {
		return pouleRepos.findAll();
	}
	
	@PostMapping("poule")
	public Poule savePoule(@RequestBody Poule p) {
		return pouleRepos.save(p);
	}

}
