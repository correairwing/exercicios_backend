package Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppExercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Pessoa> usuarios = new ArrayList<>();

        while (true) {
            System.out.println("Digite seu nome (ou digite 'sair' para finalizar):");
            String nome = scan.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite seu sexo (M/F):");
            String sexo = scan.nextLine();

            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("Sexo inválido. Por favor, insira 'M' para masculino ou 'F' para feminino.");
            } else {
                usuarios.add(new Pessoa(nome, sexo));
            }
        }

        System.out.println("*****************----*****************");
        System.out.println("Usuárias do sexo feminino:");
        List<Pessoa> usuariasFemininas = usuarios.stream()
                .filter(u -> u.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        usuariasFemininas.forEach(u -> System.out.println(u.getNome()));

        System.out.println("Programa finalizado.");
    }

}
