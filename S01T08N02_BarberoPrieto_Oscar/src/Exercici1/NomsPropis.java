package Exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NomsPropis {

	public static void main(String[] args) {

		List<String> noms = Arrays.asList("Irune", "Ari", "ana", "Josep", "Nerea", "Ada", "Josep", "Ana", "Albert");

		List<String> filtre = escollirNoms(noms);

		filtre.forEach(System.out::println);

	}

	public static List<String> escollirNoms(List<String> llista) {

		return llista.stream().filter(x -> x.startsWith("A") && x.length() == 3).collect(Collectors.toList());

	}
}
