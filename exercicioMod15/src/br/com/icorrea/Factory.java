package br.com.icorrea;

public abstract class Factory {

    public Car create(String requestGrade) {
        Car car = retrieveCar(requestGrade);
        car = prepararCar(car);
        return car;
    }
    private Car prepararCar (Car car) {
        car.carModel();
        car.startEngine();
        car.carTest();
        car.clean();
        return car;
    }
    abstract Car retrieveCar(String requestGrade);
}
