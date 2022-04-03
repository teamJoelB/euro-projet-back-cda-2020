package fr.cda.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.cda.entities.Pays;

public interface PaysRepository extends CrudRepository<Pays, Long> {

	public List<Pays> findByPouleId(Long id);
}
