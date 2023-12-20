package br.com.icorrea;

public class Manuais extends Factory {
    @Override
    Car retrieveCar(String requestGrade) {
        if("B".equals(requestGrade)) {
            return new FordCar(79, "vermelho", 120, "Ford Ka");
        } else {
            return new FordCar(140, "preto", 180, "Ford Foccus");
        }
    }
}
