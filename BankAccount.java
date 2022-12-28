package oppstask;

import java.util.Random;

class Person {
	private String name;
	private float age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public float getAge() {
		return age;
	}

}

class Account {
	private long accNum;
	private double balance;
	private String accHolder;

	public void deposit(double amt) {
		balance = balance + amt;
		System.out.println("deposited amount is : " + amt);
		System.out.println("Total amount is  " + getBalance());
	}

	public void withDraw(double amt) {
		balance = balance - amt;
		System.out.println("Withdrawn element is : " + amt);
		System.out.println("Total amount is  " + getBalance());
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

}

class SavingAc extends Account {
	final float minbal = 1000;
	double bal;

	public double getC() {
		return bal;
	}

	public void setC(double bal) {
		this.bal = bal;
	}

	public void withDraw(double amt) {
		if (bal > minbal) {
			if (bal > amt) {
				bal = bal - amt;
				System.out.println("withdrawn amount : " + amt);
				System.out.println(" Your Account balance is:" + getC());

			}

			else {
				System.out.println("your account balane is low");
				System.out.println(" Your Account balance is:" + getC());
			}
		}

	}
}

class CurrentAcc extends Account {
	double overdraft = -1000;
	double bal;
	double a;

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public void withdraw(double amut) {
		a = bal - amut;

		if (a > overdraft) {
			System.out.println("withdrawn amount : " + amut);
			bal = bal - amut;
			setBal(bal);
			getBal();
			System.out.println("withdrawn amount : " + amut);

			System.out.println("Your Account balance is:" + getBal());

		} else {
			System.out.println("False");

		}

	}
}

public class BankAccount {

	public static void main(String[] args) {
		long min = 100000000000000l;
		long max = 422347203685477l;
		Account a = new Account();
		SavingAc s = new SavingAc();
		Person p = new Person();
		Random r = new Random();
		CurrentAcc c1 = new CurrentAcc();

		long accNum1 = r.nextLong(min, max);
		a.setAccNum(accNum1);
		p.setName("dheeraj");
		p.setAge(23);
		a.setBalance(10000);
		a.setAccHolder(p.getName());
		System.out.println("Account holder name: " + a.getAccHolder());
		System.out.println("Account No: " + a.getAccNum());
		System.out.println("balance : " + a.getBalance());
		a.deposit(3000);
		s.setC(a.getBalance());
		c1.setBal(a.getBalance());
		System.out.println(c1.getBal());
		c1.withdraw(2000);
		System.out.println("\n");

		long accNum = r.nextLong(min, max);
		a.setAccNum(accNum);
		p.setName("kumar");
		p.setAge(18);
		a.setBalance(5000);
		a.setAccHolder(p.getName());
		System.out.println("Account holder name: " + a.getAccHolder());
		System.out.println("Account No: " + a.getAccNum());
		System.out.println("balance : " + a.getBalance());
		a.deposit(4000);
		s.setC(a.getBalance());
		c1.setBal(a.getBalance());
		c1.withdraw(2000);
		System.out.println("\n");
	}
}