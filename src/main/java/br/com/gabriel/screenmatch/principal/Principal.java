package br.com.gabriel.screenmatch.principal;

import java.util.Scanner;

public class Principal {

    private String endereco;
    private String apiKey;

    private Scanner leitura = new Scanner(System.in);

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca:");
        var nomeSerie = leitura.nextLine();

        //"https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c"
    }
}
