package br.edu.unichristus;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LivrariaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaApplication.class, args);
	}
	
	@Autowired
	private LivroService servicoLivros;

	@Override
	public void run(String... arg0) throws Exception {
		Livro livro = new Livro("Zaratustra", Date.valueOf("2011-12-01"), 255, new BigDecimal("255.00"));
		this.servicoLivros.save(livro);
		
	}
}
