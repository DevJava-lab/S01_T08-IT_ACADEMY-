package Exercici4;

import java.util.*;

public class Lambda_4 {
	
	public static void main(String[] args) {

		List<String> mesosAny = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost",
				"Setembre", "Octubre", "Novembre", "Desembre");
		
		mesosAny.forEach(System.out::println);  

	}

}
