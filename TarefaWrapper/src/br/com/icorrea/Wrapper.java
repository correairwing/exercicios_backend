package br.com.icorrea;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valorInteiro = scanner.nextInt();
        scanner.close();

        System.out.println("Valores digitados:");
        System.out.println("Valor inteiro: " + valorInteiro);
    
        Integer valorWrapper = valorInteiro;
        System.out.println("Valor Wrapper: " + valorWrapper+ " (" + valorWrapper.getClass().getSimpleName() + ")");
           
        
	}

}
