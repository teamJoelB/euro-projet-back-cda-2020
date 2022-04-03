package fr.cda.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Poule {
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private int nbMatchPoule;
	
	@Lob
	private byte[] baniere;
}
