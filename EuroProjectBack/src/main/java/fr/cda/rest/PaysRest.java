package fr.cda.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.entities.Pays;
import fr.cda.repository.PaysRepository;

@RestController @CrossOrigin("*")
public class PaysRest {
	@Autowired
	private PaysRepository paysRepos;
	
	@PostMapping("pays")
	public Pays savePays(@RequestBody Pays p) {
		return paysRepos.save(p);
	}
	
	@GetMapping("pays")
	public Iterable<Pays> getAllPays() {
		return paysRepos.findAll();
	}
	
	@GetMapping("pays/poule/{id}")
	public List<Pays> getAllPaysInPoule(@PathVariable Long id) {
		return paysRepos.findByPouleId(id);
	}

}
