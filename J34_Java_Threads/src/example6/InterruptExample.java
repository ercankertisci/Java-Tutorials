package example6;

public class InterruptExample {
	public static void main(String[] args) {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		t1.interrupt(); // Thread'i durdurur
	}
}