package Exercici1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Alumne> bbddAlumnes = new ArrayList<>();

		bbddAlumnes.add(new Alumne("Pere", 16, "Java", 4.5));
		bbddAlumnes.add(new Alumne("Aina", 18, "PHP", 8));
		bbddAlumnes.add(new Alumne("Judith", 20, "CSS", 6.5));
		bbddAlumnes.add(new Alumne("Antoni", 19, "Java", 7.5));
		bbddAlumnes.add(new Alumne("Mireia", 20, "PHP", 4.9));
		bbddAlumnes.add(new Alumne("Nerea", 16, "CSS", 6.5));
		bbddAlumnes.add(new Alumne("David", 21, "Java", 3.8));
		bbddAlumnes.add(new Alumne("Irune", 18, "PHP", 8.2));
		bbddAlumnes.add(new Alumne("Albert", 19, "Java", 4.5));
		bbddAlumnes.add(new Alumne("Xavier", 17, "CSS", 9));

		// Mostra per pantalla el nom i l’edat de cada alumne/a.

		System.out.println("\n--------------- Alumnes : Nom i Edat---------------------------------------------\n");
		bbddAlumnes.forEach(p -> System.out.print(p.getNom() + " , " + p.getEdat()));

		// Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna
		// a aquests alumnes a una altra llista i mostra per pantalla la nova llista.

		System.out.println("\n--------------- Alumnes : Nom comença per 'a' -------------------------------\n");
		List<?> llistaNoms = bbddAlumnes.stream().filter(p -> p.getNom().toLowerCase().startsWith("a")).collect(Collectors.toList());

		llistaNoms.forEach(System.out::println);

		// Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior

		System.out.println("\n--------------- Alumnes : Nota 5 o major ----------------------------------------\n");
		bbddAlumnes.stream().filter(p -> p.getNota() >= 5).forEach(System.out::println);

		// Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que
		// no són de PHP.

		System.out.println("\n--------------- Alumnes : Nota 5 i no fan PHP ----------------------------------\n");
		bbddAlumnes.stream().filter(p -> p.getNota() > 5 && p.getCurs() != "PHP").forEach(System.out::println);

		// Mostra tots els alumnes que fan JAVA i són majors d’edat.

		System.out.println("\n--------------- Alumnes : Estudien JAVA i son majors edat ------------------\n");
		bbddAlumnes.stream().filter(p -> p.getCurs() == "Java" && p.getEdat() > 18).forEach(System.out::println);

	}

}
