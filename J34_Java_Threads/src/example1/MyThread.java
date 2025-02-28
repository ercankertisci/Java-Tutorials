package example1;

class MyThread extends Thread {
	public void run() {
		System.out.println("Thread çalışıyor: " + Thread.currentThread().getName());
	}
}