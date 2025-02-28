package example5;

class PriorityThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " öncelik: " + Thread.currentThread().getPriority());
	}
}