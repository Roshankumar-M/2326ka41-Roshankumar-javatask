package codejava;

class MyTask implements Runnable {
	public void run() {
		System.out.println("Hello from " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Runnable T = new MyTask();
		new Thread(T).start();
		new Thread(T).start();
	}
}