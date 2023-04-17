package Exercici1;

import java.util.*;

public class Lambda_1 {

	public static void main(String[] args) {

		List<String> paraules = Arrays.asList("xocolata", "llet", "foto", "cotxe", "paper", "pedra", "telefon");

		List<String> resultat = filtreLlista(paraules, "o");
		
		resultat.forEach(p->System.out.println(p));
	}

	public static List<String> filtreLlista(List<String> elements, String vocal) {

		List<String> paraulesEscollides = new ArrayList<>();

		elements.forEach(paraula -> {
			if (paraula.contains(vocal)) {
				paraulesEscollides.add(paraula);
			}
		});

		return paraulesEscollides;
	}
}
