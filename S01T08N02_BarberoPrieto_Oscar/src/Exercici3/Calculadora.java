package Exercici3;

public class Calculadora {

	public static void main(String[] args) {

		calcular suma = (a, b) -> a + b;
		calcular resta = (a, b) -> a - b;
		calcular multiplicacio = (a, b) -> a * b;
		calcular divisio = (a, b) -> a / b;

		System.out.println("Resultat suma : " + suma.operacio(9, 3));
		System.out.println("Resultat resta : " + resta.operacio(9, 3));
		System.out.println("Resultat multiplicació : " + multiplicacio.operacio(9, 3));
		System.out.println("Resultat divisió : " + divisio.operacio(9, 3));
	}

	@FunctionalInterface
	interface calcular {

		public float operacio(int a, int b);
	}
}
