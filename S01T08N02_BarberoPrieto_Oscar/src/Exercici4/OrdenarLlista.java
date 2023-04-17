package Exercici4;

import java.util.*;
import java.util.stream.Collectors;

public class OrdenarLlista {

	public static void main(String[] args) {

		List<String> paraules = Arrays.asList("l'escopeta de joguina", "23", "xocolata molt calenta", "573",
				"un dia d'estiu", "maquina", "88", "el nen del pijama");

		System.out.println("-> Ordenat alfabèticament pel primer caràcter.\n");

		paraules.stream().sorted(Comparator.comparingInt(p -> p.charAt(0))).forEach(System.out::println);

		System.out.println("\n-> Les cadenes que contenen una \"e\" primer, la resta de cadenes després.\n");

		Map<Boolean, List<String>> subllistes = paraules.stream().sorted()
				.collect(Collectors.partitioningBy(p -> p.contains("e")));

		List<List<String>> llistaStrings = new ArrayList<>(subllistes.values());

		System.out.println("Llista amb \"e\" : " + llistaStrings.get(1));
		System.out.println("Resta de la llista  : " + llistaStrings.get(0));

		System.out.println("\n-> Modifica  ‘a’ per un ‘4’.\n");

		paraules.stream().map(p -> p.replace("a", "4")).forEach(System.out::println);

		System.out.println("\n->Mostra només els elements que són numèrics.\n");

		paraules.stream().filter(p -> p.charAt(0) > 48 && p.charAt(0) < 57).forEach(System.out::println);

	}

}
