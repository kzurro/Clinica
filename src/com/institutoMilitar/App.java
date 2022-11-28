package com.institutoMilitar;

import java.time.LocalDate;

import com.institutoMilitar.codigo.GestorClinica;
import com.institutoMilitar.codigo.Humano;
import com.institutoMilitar.codigo.Perro;

public class App {
	public static void main(String[] args) {
		System.out.println("Funcionando");
		
		Perro firulais = new Perro(1234, LocalDate.of(2020, 05, 05), "Firulais", "Sin_Raza");
		Humano humano = new Humano("Pepe", 36);
		
		System.out.println(GestorClinica.diagnosticar(firulais));
		System.out.println(GestorClinica.diagnosticar(humano));
	}

}
