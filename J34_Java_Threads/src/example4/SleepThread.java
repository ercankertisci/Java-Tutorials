package example4;

class SleepThread extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000); // 1 saniye bekler
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
}