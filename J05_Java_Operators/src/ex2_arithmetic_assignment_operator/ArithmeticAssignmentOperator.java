package ex2_arithmetic_assignment_operator;

public class ArithmeticAssignmentOperator {

	public static void main(String[] args) {

		int a = 20, b = 5, c = -14, d = 21;

		a += 5; /* a veri tipini 5 ile toplayıp tekrar a degiskenine ata */
		b -= 2; /* b veri tipini 2'den cikartip tekrar b degiskenine ata */
		c *= 10;/* c veri tipini 10 ile carpip tekrar c degiskenine ata */
		d /= 8; /* d veri tipini 8'e bolup tekrar d degiskenine ata */

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}