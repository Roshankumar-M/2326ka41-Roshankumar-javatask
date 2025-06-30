package codejava;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(getName() + " - " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread obj = new MyThread();
		MyThread t1 = new MyThread();
		obj.start();
		obj.join();
		t1.start();
	}
}