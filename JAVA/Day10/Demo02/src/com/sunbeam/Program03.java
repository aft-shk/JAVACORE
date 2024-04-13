package com.sunbeam;

enum AccountType {
	SAVINGS, CURRENT, DMAT
}

enum AccountType2 {
	SAVINGS() {
		@Override
		public String toString() {
			return "acc is Savings";
		}
	},
	CURRENT() {
		@Override
		public String toString() {
			return "acc is Current";
		}
	},
	DMAT() {
		@Override
		public String toString() {
			return "acc is D-mat";
		}
	};
}

enum AccountType3 {
	SAVINGS(2.5) {
		@Override
		public String toString() {
			return "acc is Savings";
		}
	},
	CURRENT(1.5) {
		@Override
		public String toString() {
			return "acc is Current";
		}
	},
	DMAT(0) {
		@Override
		public String toString() {
			return "acc is D-mat";
		}
	};

	private double roi;

	private AccountType3(double roi) {
		this.roi = roi;
	}

	public double getRoi() {
		return roi;
	}
}

class BankAccount {
	int accno;
	double balance;
	// AccountType type;
	// AccountType2 type;
	AccountType3 type;

	public BankAccount(int accno, double balance, int type) {
		this.accno = accno;
		this.balance = balance;
		// this.type = AccountType.values()[type];
		// this.type = AccountType2.values()[type];
		this.type = AccountType3.values()[type];
	}

//	@Override
//	public String toString() {
//		return "BankAccount [accno=" + accno + ", balance=" + balance + ", type=" + type + "]";
//	}

	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", balance=" + balance + ", type=" + type + ", roi=" + type.getRoi()
				+ "]";
	}

}

public class Program03 {

	public static void main(String[] args) {
		// to-do to ask for which account to create

		BankAccount a1 = new BankAccount(1, 10000, 0);
		System.out.println(a1);

		BankAccount a2 = new BankAccount(2, 20000, 1);
		System.out.println(a2);
	}

}
