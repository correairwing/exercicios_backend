package br.com.icorrea;

import java.util.List;

public class Pessoa {

    private String id;

    private String nome;

    private String nacionalidade;

    private int idade;

    public Pessoa(String id, String nome, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public Pessoa() {

    }

    public List<Pessoa> populaPessoas() {
        Pessoa pesssoa1 = new Pessoa("1", "Pessoa 1", "Brasil", 20);
        Pessoa pesssoa2 = new Pessoa("2", "Pessoa 2", "Alemanha", 21);
        Pessoa pesssoa3 = new Pessoa("3", "Pessoa 3", "Suiça", 22);
        Pessoa pesssoa4 = new Pessoa("4", "Pessoa 4", "Brasil", 23);
        return List.of(pesssoa1, pesssoa2, pesssoa3, pesssoa4);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
