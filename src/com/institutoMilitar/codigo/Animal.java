package com.institutoMilitar.codigo;

public abstract class Animal implements Nombrable {

	String razaAnimal;
	String nombreAnimal;

	public String getRazaAnimal() {
		return razaAnimal;
	}

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	protected void setRazaAnimal(String razaAnimal) {
		this.razaAnimal = razaAnimal;
	}

	protected void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	public Animal() {
	}

	public Animal(String razaAnimal, String nombreAnimal) {
		setRazaAnimal(razaAnimal);
		setNombreAnimal(nombreAnimal);
	}

	@Override
	public String getNombre() {
		return getNombreAnimal();
	}

}
