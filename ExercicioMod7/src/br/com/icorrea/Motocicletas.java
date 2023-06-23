package br.com.icorrea;

/**
 * @author irwing.correa
 */

public class Motocicletas {
	
	private String marca;
	
	private String modelo;
	
	private String tipo;
	
	private int potenciaEmCavalos;

	/**
	 * 
	 * @return o valor do setMarca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPotenciaEmCavalos() {
		return potenciaEmCavalos;
	}

	public void setPotenciaEmCavalos(int potenciaEmCavalos) {
		this.potenciaEmCavalos = potenciaEmCavalos;
	}
	
	/**
	 * 
	 * @return
	 * @deprecated
	 * @see void acelerar2()
	 */
	public String acelerar() {
		return "vruuuummm";
	}
	
	public void acelerar2() {
		System.out.println("Vruuummmmmm");
	}
	

}
