package br.com.icorrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Colecoes_nome_sexo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite os nomes e sexos separados por vírgula e hífen: ");
        String entrada = scanner.nextLine();
        
        String[] nomesArray = entrada.split(",");
        scanner.close();
        
        List<String> nomes = new ArrayList<>(Arrays.asList(nomesArray));
        
        
        for (int i = 0; i < nomes.size(); i++) {
            nomes.set(i, nomes.get(i).trim());
        }

        Collections.sort(nomes, new IgnoreCaseComparator());

        System.out.println("Nomes em ordem alfabética:");
        exibirNomesSeparadosPorSexo(nomes);
    }
    
    private static class IgnoreCaseComparator implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    }
    
    private static void exibirNomesSeparadosPorSexo(List<String> nomes) {
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();
        
        for (String nome : nomes) {
            String[] partes = nome.split("-");
            if (partes.length == 2) {
                String sexo = partes[1].trim();
                if (sexo.equalsIgnoreCase("M")) {
                    masculinos.add(partes[0].trim());
                } else if (sexo.equalsIgnoreCase("F")) {
                    femininos.add(partes[0].trim());
                }
            }
        }
        
        System.out.println("Masculinos:");
        for (String nome : masculinos) {
            System.out.println(nome);
        }
        
        System.out.println("Femininos:");
        for (String nome : femininos) {
            System.out.println(nome);
        }
    }
}
