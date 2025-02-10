package ex6_comparison_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 30;

		System.out.println("Sayı 1: " + sayi1);
		System.out.println("Sayı 2: " + sayi2);

		// Karşılaştırma Operatörlerini Kullanma
		System.out.println("Sayi1 == Sayi2: " + (sayi1 == sayi2)); // false
		System.out.println("Sayi1 != Sayi2: " + (sayi1 != sayi2)); // true
		System.out.println("Sayi1 > Sayi2: " + (sayi1 > sayi2)); // false
		System.out.println("Sayi1 < Sayi2: " + (sayi1 < sayi2)); // true
		System.out.println("Sayi1 >= Sayi2: " + (sayi1 >= sayi2)); // false
		System.out.println("Sayi1 <= Sayi2: " + (sayi1 <= sayi2)); // true
	}
}