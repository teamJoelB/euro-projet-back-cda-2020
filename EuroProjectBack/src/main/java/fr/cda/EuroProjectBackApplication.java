package fr.cda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EuroProjectBackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EuroProjectBackApplication.class, args);
		System.out.println("lancement terminé");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("lancement ..........");
		
	}

}
