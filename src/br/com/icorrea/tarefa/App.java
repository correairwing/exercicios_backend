package br.com.icorrea.tarefa;

import java.lang.annotation.Annotation;

public class App {
    public static void main (String args[]) {
        try {
            Class<ClasseComAnotacao> obj = ClasseComAnotacao.class;

            if (obj.isAnnotationPresent(Tabela.class)) {

                Annotation annotation = obj.getAnnotation(Tabela.class);
                Tabela tabelaAnnotation = (Tabela) annotation;

                System.out.println("Valor da Tabela: " + tabelaAnnotation.value());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
