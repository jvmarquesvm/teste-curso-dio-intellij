package br.com.dio.io;

import java.io.Serializable;

public class Gato implements Serializable {

    private static final long serialVersionUID = 2L;

    private String nome;
    private Integer idade;
    private String cor;
    private Boolean castrado;
    private transient Boolean ronrona;

    public Gato()   {
    }

    public Gato(String nome, Integer idade, String cor, Boolean castrado, Boolean ronrona) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.castrado = castrado;
        this.ronrona = ronrona;
    }

    public Boolean getRonrona() {
        return ronrona;
    }

    public Boolean getCastrado() {
        return castrado;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", castrado=" + castrado +
                ", ronrona=" + ronrona +
                '}';
    }
}
