package Exercici6;

import java.util.*;

public class Lambda_6 {

	public static void main(String[] args) {

		List<?> elements = Arrays.asList("cotxe", "perruqueria", 12, "amapola", 67, 23, "Josep", "vidre", 87, 120);

		elements.sort(Comparator.comparingInt(element -> element.toString().length()));

		elements.forEach(System.out::println);

	}
}
