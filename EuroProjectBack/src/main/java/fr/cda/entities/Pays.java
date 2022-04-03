package fr.cda.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Pays {
	@ Id @GeneratedValue
	private Long id;
	private String nom;
	@Lob
	private byte[] image;
	
	@ManyToOne
	private Poule poule;

}
