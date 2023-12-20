package br.com.icorrea;

public class Automaticos extends Factory{
    @Override
    Car retrieveCar(String requestGrade) {
        if ("B".equals(requestGrade)) {
            return new HondaCar(125, "prata", 180, "Civic");
        } else {
            return new HondaCar(280, "preto", 240, "Accord");
        }
    }
}
