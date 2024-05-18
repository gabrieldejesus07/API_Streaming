package br.com.gabriel.screenmatch.principal;

import br.com.gabriel.screenmatch.model.DadosSerie;
import br.com.gabriel.screenmatch.service.ConsumoApi;
import br.com.gabriel.screenmatch.service.ConverteDados;
import br.com.gabriel.screenmatch.model.DadosTemporada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca:");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDador(ENDERECO + nomeSerie.replace(" ", "+")  + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 0; i <= dados.totalTemporadas(); i++) {
			json = consumo.obterDador(ENDERECO + nomeSerie.replace(" ", "+") +"&season=" + i + API_KEY);
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);




    }
}
