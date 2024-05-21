package com.cadastroAluno.cadastroAluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroAlunoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(VeiculoApiApplication.class, args);
	}

	public void run(String... args) throws IOException, InterruptedException {
		System.out.println("Hello, Spring Boot!");
		// Principal principal = new Principal();
		// principal.exibeMenu();

	}

}
