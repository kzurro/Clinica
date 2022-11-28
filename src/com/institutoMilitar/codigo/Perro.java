package com.institutoMilitar.codigo;

import java.time.LocalDate;

public class Perro extends Animal {
	
	private int numeroId;
	private LocalDate fechaNacimiento;
	public int getNumeroId() {
		return numeroId;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	protected void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}
	protected void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Perro(int numeroId, LocalDate fechaNacimiento, String nombre, String raza) {
		super(raza, nombre);
		this.numeroId = numeroId;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public Perro() {
	}

}
