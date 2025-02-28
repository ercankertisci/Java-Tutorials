package example6;

class InterruptThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			if (Thread.interrupted()) {
				System.out.println(Thread.currentThread().getName() + " durduruldu!");
				return;
			}
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
}