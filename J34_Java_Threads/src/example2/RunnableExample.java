package example2;

public class RunnableExample {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start(); // Thread başlatılır
	}
}