package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio01Application {

	public static void main(String[] args) {
		List<String> entrada = Arrays.asList("hola", "mundo", null, "java");

		System.out.println("--- Lista Original ---");
		System.out.println(entrada);

		// 2. PROBAMOS EL MÉTODO ANTIGUO
		Ejercicio01Application demo = new Ejercicio01Application();
		List<String> resultadoAntiguo = demo.processLegacy(entrada);

		System.out.println("\n--- Resultado Método Antiguo ---");
		System.out.println(resultadoAntiguo);
	}

	public List<String> processLegacy(List<String> items) {
		List<String> result = new ArrayList<>();
		for (String item : items) {
			if (item != null) {
				result.add(item.toUpperCase());
			}
		}
		return result;
	}

}