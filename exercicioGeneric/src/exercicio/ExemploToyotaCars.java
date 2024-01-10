package exercicio;

import java.util.ArrayList;
import java.util.List;

public class ExemploToyotaCars {

    public static void main (String args[]) {
        List<ToyotaCar> car = new ArrayList<>();
        car.add(new Corolla());
        car.add(new Etios());
        car.add(new Prius());
        imprimirCarros(car);
    }

    public static void imprimirCarros (List<? extends ToyotaCar> lista) {
        for (ToyotaCar toyotaCar : lista) {
            System.out.println(toyotaCar);
        }
    }
}
