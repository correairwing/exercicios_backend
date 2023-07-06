package br.com.icorrea;

public class App {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Irwing Correa");
		
		PessoaFisica pf = new PessoaFisica();
		pf.setPessoa(pessoa);
		pf.setCpf(12312312312l);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setPessoa(pessoa);
		pj.setCnpj(12312312312332l);
		
		pessoa.add(pf);
		pessoa.add(pj);
	}

}
