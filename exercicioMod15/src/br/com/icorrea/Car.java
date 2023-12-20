package br.com.icorrea;

public abstract class Car {
    private int horsePower;
    private String color;
    private int maxSpeed;
    private String modelo;

    public Car(int horsePower, String color, int maxSpeed, String modelo) {
        this.horsePower = horsePower;
        this.color  = color;
        this.maxSpeed = maxSpeed;
        this.modelo = modelo;
    }

    public void carModel() {
        System.out.println("O carro é um: " + modelo);
    }
    public void startEngine() {
        System.out.println("O carro está pronto. A potencia é: " + horsePower + "CV");
    }

    public void clean() {
        System.out.println("O carro é " + color);
    }

    public void carTest() {
        System.out.println("Pronto para teste. A velocidade máxima é: " + maxSpeed + "km/h");
    }
 }

