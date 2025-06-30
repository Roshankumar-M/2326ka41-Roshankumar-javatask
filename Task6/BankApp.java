package codejava;

class BankAccount {
	int balance = 1000;

	synchronized void withdraw(int amount) {
		String user = Thread.currentThread().getName();
		System.out.println(user + " trying to withdraw $" + amount);
		if (balance >= amount) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			balance -= amount;
			System.out.println(user + " successfully withdrew $" + amount + ". Balance: $" + balance);
		} else {
			System.out.println(user + " failed to withdraw. Insufficient balance: $" + balance);
		}
	}
}

public class BankApp {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		Runnable task = () -> account.withdraw(400);

		Thread t1 = new Thread(task, "Dharani");
		Thread t2 = new Thread(task, "Aishu");
		Thread t3 = new Thread(task, "Nithin");

		t1.start();
		t2.start();
		t3.start();
	}
}