package example5;

public class KareMain {

	public static void main(String[] args) {
		Kare kare1 = new Kare();
		Kare kare2 = new Kare(10);
		Kare kare3 = new Kare(20, 15);

		System.out.println("Kare1: En = " + kare1.en + ", Boy = " + kare1.boy);
		System.out.println("Kare2: En = " + kare2.en + ", Boy = " + kare2.boy);
		System.out.println("Kare3: En = " + kare3.en + ", Boy = " + kare3.boy);
	}
}