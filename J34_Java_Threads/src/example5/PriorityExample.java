package example5;

public class PriorityExample {
	public static void main(String[] args) {
		PriorityThread t1 = new PriorityThread();
		PriorityThread t2 = new PriorityThread();
		PriorityThread t3 = new PriorityThread();

		t1.setPriority(Thread.MIN_PRIORITY); // Öncelik 1
		t2.setPriority(Thread.NORM_PRIORITY); // Öncelik 5 (Varsayılan)
		t3.setPriority(Thread.MAX_PRIORITY); // Öncelik 10

		t1.start();
		t2.start();
		t3.start();
	}
}