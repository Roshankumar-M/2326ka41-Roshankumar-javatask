package codejava;

class ThreadEx extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadEx M = new ThreadEx();
		M.start();
	}
}