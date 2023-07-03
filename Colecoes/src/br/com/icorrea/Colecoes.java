package br.com.icorrea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Colecoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite os nomes separados por vírgula: ");
        String entrada = scanner.nextLine();
        
        String[] nomesArray = entrada.split(",");
        
        List<String> nomes = new ArrayList<>(Arrays.asList(nomesArray));
        
        for (int i = 0; i < nomes.size(); i++) {
            nomes.set(i, nomes.get(i).trim());
        }

        Collections.sort(nomes, new IgnoreCase());

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
    
    private static class IgnoreCase implements Comparator<String> {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    }
}