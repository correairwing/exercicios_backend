package br.com.icorrea;

import java.util.Scanner;

public class ControleDeFluxo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int primeiraNota = scanner.nextInt();
        System.out.print("Digite a segunda nota: ");
        int segundaNota = scanner.nextInt();
        System.out.print("Digite a terceira nota: ");
        int terceiraNota = scanner.nextInt();
        System.out.print("Digite a quarta nota: ");
        int quartaNota = scanner.nextInt();
        scanner.close();
        
        System.out.println("Sua nota é: " + (primeiraNota + segundaNota + terceiraNota + quartaNota) /4);
        
        
        if ((primeiraNota + segundaNota + terceiraNota + quartaNota) /4 <5) {
        	System.out.println("Você está reprovado");
        } else if ((primeiraNota + segundaNota + terceiraNota + quartaNota) /4 <= 5 && (primeiraNota + segundaNota + terceiraNota + quartaNota) /4 < 7) {
        	System.out.println("Você está de recuperação");
        } else {
        	System.out.println("Você foi aprovado!");
        }
        

        
	}
	
}
