package codejava;

class TicketBooking {
	int seats = 5;

	synchronized void bookTicket(String name, int wanted) {
		System.out.println(name + " trying to book " + wanted + " seat(s).");
		if (seats >= wanted) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			seats -= wanted;
			System.out.println(name + " booked " + wanted + " seat(s). Remaining: " + seats);
		} else {
			System.out.println(name + " failed. Not enough seats. Remaining: " + seats);
		}
	}

	public static void main(String[] args) {
		TicketBooking tb = new TicketBooking();

		Runnable user1 = () -> tb.bookTicket("Bharathi", 2);
		Runnable user2 = () -> tb.bookTicket("Arjun", 3);
		Runnable user3 = () -> tb.bookTicket("Srimathi", 1);

		new Thread(user1).start();
		new Thread(user2).start();
		new Thread(user3).start();
	}
}