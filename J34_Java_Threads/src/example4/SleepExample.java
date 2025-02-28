package example4;

public class SleepExample {
	public static void main(String[] args) {
		SleepThread t1 = new SleepThread();
		SleepThread t2 = new SleepThread();

		t1.start();
		t2.start();
	}
}