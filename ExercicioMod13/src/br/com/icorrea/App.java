package br.com.icorrea;

public class App {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Irwing");
		pf.setEmail("123@gmail.com");
		pf.setCpf(12312312312l);
		System.out.println("Nome: " + pf.getNome() + " e-mail: " + pf.getEmail() + " CPF: " + pf.getCpf());
	
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Loja do Irwing");
		pj.setEmail("loja@gmail.com");
		pj.setCnpj(12312312332123l);
		System.out.println("Nome: " + pj.getNome() + " e-mail: " + pj.getEmail() + " CPF: " + pj.getCnpj());
	}

	
}
