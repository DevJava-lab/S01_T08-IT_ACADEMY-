package Exercici2;

import java.util.*;

public class Lambda_2 {

	public static void main(String[] args) {

		List<String> paraules = Arrays.asList("xocolata", "llet", "foto", "cotxe", "paper", "pedra", "telefon");

		List<String> resultat = filtreLlista(paraules, "o", 5);

		resultat.forEach(p->System.out.println(p));
		
	}

	public static List<String> filtreLlista(List<String> elements, String vocal, int numLletres) {

		List<String> paraulesEscollides = new ArrayList<>();

		elements.forEach(paraula -> {
			if (paraula.contains(vocal) && paraula.length() > numLletres) {
				paraulesEscollides.add(paraula);
			}
		});

		return paraulesEscollides;
	}
}
