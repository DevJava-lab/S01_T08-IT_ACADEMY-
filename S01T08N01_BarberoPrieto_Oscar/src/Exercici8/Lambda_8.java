package Exercici8;

public class Lambda_8 {

	public static void main(String[] args) {
		
		Invertir value= str-> {
			StringBuilder rev=new StringBuilder(str);
			return rev.reverse().toString();
		};

		System.out.println(value.reverse("tota la paraula al revés"));
	}

	@FunctionalInterface
	interface Invertir {

		public String reverse(String str);

	}
}