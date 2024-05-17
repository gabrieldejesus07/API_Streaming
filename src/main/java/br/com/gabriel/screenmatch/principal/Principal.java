package br.com.gabriel.screenmatch.principal;

import br.com.gabriel.screenmatch.service.ConsumoApi;

import java.util.Scanner;

public class Principal {

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca:");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDador(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);


        //"https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c"
    }
}
