package Exercici5;

public class Lambda_5 {

	public static void main(String[] args) {

		Pi valor = () -> 3.1415;
		System.out.println(valor.getPiValue());
	}

	@FunctionalInterface
	interface Pi {

		public double getPiValue();
	}

}
