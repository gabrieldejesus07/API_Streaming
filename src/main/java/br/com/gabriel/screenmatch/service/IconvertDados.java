package br.com.gabriel.screenmatch.service;

public interface IconvertDados {

    <T> T obterDados(String json, Class<T> classe);
}
