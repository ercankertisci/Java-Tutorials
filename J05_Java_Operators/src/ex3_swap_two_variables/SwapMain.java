package ex3_swap_two_variables;

public class SwapMain {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c;
		c = a;
		a = b;
		b = c;

		/* 5 olan a degeri c degiskenine aktarildi */
		/* 10 olan b degeri a degiskenine aktarildi a degiskeni 10 oldu */
		/* 5 olan c degeri b degiskenine aktarildi b degiskeni 5 oldu */

		System.out.println("a degiskenin degeri:" + a);
		System.out.println("b degiskenin degeri:" + b);

	}

}
