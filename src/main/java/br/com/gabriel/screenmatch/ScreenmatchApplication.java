package br.com.gabriel.screenmatch;

import br.com.gabriel.screenmatch.model.DadosSerie;
import br.com.gabriel.screenmatch.service.ConsumoApi;
import br.com.gabriel.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@java.lang.Override
	public void run(java.lang.String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDador("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
