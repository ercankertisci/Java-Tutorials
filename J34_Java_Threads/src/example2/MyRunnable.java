package example2;

class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Runnable Thread çalışıyor: " + Thread.currentThread().getName());
	}
}