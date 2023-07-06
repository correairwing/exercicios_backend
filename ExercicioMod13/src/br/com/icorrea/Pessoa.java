package br.com.icorrea;

import java.util.HashSet;
import java.util.Set;

public class Pessoa {

	private String nome;
	
	private Set<PessoaFisica> PessoaFisica;
	private Set<PessoaJuridica> PessoaJurica;
	
	public Pessoa() {
		this.PessoaFisica = new HashSet<>();
		this.PessoaJurica = new HashSet<>();
	}
	
	public void add(PessoaFisica pf) {
		this.PessoaFisica.add(pf);
	}
	
	public void add(PessoaJuridica pj) {
		this.PessoaJurica.add(pj);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
