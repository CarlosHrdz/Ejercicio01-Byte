package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio01Application {

	public static void main(String[] args) {
		// 1. DATOS DE PRUEBA
		List<String> entrada = Arrays.asList("hola", "mundo", null, "java");

		System.out.println("--- Lista Original ---");
		System.out.println(entrada);

		// 2. PROBAMOS EL MÉTODO ANTIGUO
		Ejercicio01Application demo = new Ejercicio01Application();
		List<String> resultadoAntiguo = demo.processLegacy(entrada);

		System.out.println("\n--- Resultado Método Antiguo ---");
		System.out.println(resultadoAntiguo);

		// 3. PROBAMOS EL MÉTODO NUEVO (STREAM)
		List<String> resultadoStream = demo.processStream(entrada);

		System.out.println("\n--- Resultado Método Nuevo ---");
		System.out.println(resultadoStream);
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

	public List<String> processStream(List<String> items) {
		return items.stream()
				.filter(item -> item != null)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
	}

}