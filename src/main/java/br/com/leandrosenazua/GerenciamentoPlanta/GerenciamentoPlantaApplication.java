package br.com.leandrosenazua.GerenciamentoPlanta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GerenciamentoPlantaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoPlantaApplication.class, args);
	}

	@GetMapping("/testeConexao")
	public String index(){
		return "Teste do Malandro";
	}
}
