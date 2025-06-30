package codejava;

public class BankAccount {
	    private double balance;
	    public BankAccount(double initialBalance) {
	        if (initialBalance < 0) {
	            throw new IllegalArgumentException("Initial balance cannot be negative.");
	        }
	        this.balance = initialBalance;
	    }
	    public void deposit(double amount) {
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Deposit amount must be positive.");
	        }
	        balance += amount;
	        System.out.println("Deposited: $" + amount);
	    }
	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Withdrawal amount must be positive.");
	        }
	        if (amount > balance) {
	            throw new IllegalArgumentException("Insufficient funds.");
	        }
	        balance -= amount;
	        System.out.println("Withdrew: $" + amount);
	    }
	    public double getBalance() {
	        return balance;
	    }
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(100.0);
	        account.deposit(50.0);
	        System.out.println("Current Balance: $" + account.getBalance());
	        account.withdraw(30.0);
	        System.out.println("Current Balance: $" + account.getBalance());
	       
	    }
	}


