package example3;

public class MultiThreadExample {
	public static void main(String[] args) {
		MultiThread t1 = new MultiThread();
		MultiThread t2 = new MultiThread();

		t1.start();
		t2.start();
	}
}