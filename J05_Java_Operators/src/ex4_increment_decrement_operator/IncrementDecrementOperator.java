package ex4_increment_decrement_operator;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int sayi1 = 30;
		int a, b, c, d, e, f;
		a = ++sayi1;
		b = sayi1--;
		c = --sayi1;
		d = ++sayi1;
		e = sayi1++;
		f = sayi1;

		System.out.println("A degeri:" + a);
		System.out.println("B degeri:" + b);
		System.out.println("C degeri:" + c);
		System.out.println("D degeri:" + d);
		System.out.println("E degeri:" + e);
		System.out.println("F degeri:" + f);

	}

}