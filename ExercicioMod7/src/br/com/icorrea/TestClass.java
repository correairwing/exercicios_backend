package br.com.icorrea;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Olá!");
		Motocicletas motocicleta = new Motocicletas();
		motocicleta.setMarca("Harley Davidson");
		motocicleta.setModelo("Road King Special");
		motocicleta.setPotenciaEmCavalos(1600);
		motocicleta.setTipo("Custom");
		System.out.println(motocicleta.getMarca());
		System.out.println(motocicleta.getModelo());
		System.out.println(motocicleta.getPotenciaEmCavalos());
		System.out.println(motocicleta.getTipo());
		motocicleta.acelerar2();

	}

}
