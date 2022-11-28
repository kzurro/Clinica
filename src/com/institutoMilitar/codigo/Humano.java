package com.institutoMilitar.codigo;

public class Humano implements Nombrable {

	private String nombreHumano;
	private int edad;

	public String getNombreHumano() {
		return nombreHumano;
	}

	public int getEdad() {
		return edad;
	}

	protected void setNombreHumano(String nombreHumano) {
		this.nombreHumano = nombreHumano;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	public Humano(String nombreHumano, int edad) {
		setNombreHumano(nombreHumano);
		setEdad(edad);
	}

	@Override
	public String getNombre() {
		return getNombreHumano();
	}

}
