import java.util.Scanner;

public class Bank {

	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\t\tWelcome to the ATM!");
		System.out.println("Here are your options:\n "
						 + "1. Deposit\n 2. withdraw\n 3. Check Balance");
		System.out.print("What action would like to do: ");
		int option = input.nextInt();
		
		switch (option) {
		case 1:
			
		}
	}

}
