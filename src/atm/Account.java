package atm;

import static atm.AtmInterface.n;

class Account {

	private long cardNumber;
	private int pin;
	private String[] history = new String[n];
	private double balance;


	Account(long cardNumber, int pinCode, double initialBalance) {
		if (initialBalance > 0.0) {
			this.balance = initialBalance;
			this.setHistory(initialBalance + "\t" + "Cr");
		}
		this.cardNumber = cardNumber;
		this.pin = pinCode;
	}

	void setPin(int newPin) {
		this.pin = newPin;
	}

	boolean checkPin(int pin) {
		return this.pin == pin;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getBalance() {
		return balance;
	}

	void changeBalance(double balance) {
		this.balance += balance;
	}

	boolean checkCardNumber(long cardNumber) {
		return this.cardNumber == cardNumber;
	}

	void setHistory(String history) {
		// shifting all transactions
		if (this.history[0] != null) {
			System.arraycopy(this.history, 0, this.history, 1, n - 1);
		}
		// last history is then inserted in array index 0
		this.history[0] = history;
	}

	String getHistory(int n) {
		return history[n];
	}

}
