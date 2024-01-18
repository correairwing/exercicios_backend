package br.com.icorrea.anotacao;


@PrimeiraAnotacao(value = "Irwing", bairros = "123", numeroCasa = 10 )
public class ClasseComAnotacao {
    @PrimeiraAnotacao(value = "Correa", bairros = {"123", "321", "111"}, numeroCasa = 2, valores = 100)
    private String nome;
}
