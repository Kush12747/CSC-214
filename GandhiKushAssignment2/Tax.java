import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double tax = 0;//collects tax value
		
		//asking the martial status
		System.out.print("Are you Married(1) or Single(2)? " );
		int status = input.nextInt();
		
		//asks for income
		System.out.print("Enter your income: ");
		double income = input.nextDouble();
		
		//single status tax calculator
		if (status == 2) {
			if (income > 0 && income <= 8000) {
				tax = income * 0.10;
			}
			else if (income > 8000 && income <= 32000) {
				tax = 800 + (0.15 * (income - 8000));
			}
			else if (income > 32000) {
				tax = 4400 + (0.25 * (income - 32000));
			}
		System.out.println("The Tax will be: " + tax);
		}
		//married status tax calculator
		else if (status == 1) {
			if (income > 0 && income <= 16000) {
				tax = 0.10 * income;
			}
			else if (income > 16000 && income <+ 64000) {
				tax = 1600 + (0.15 * (income - 16000));
			}
			else if (income > 64000) {
				tax = 8800 + (0.25 * (income - 64000));
			}
		System.out.println("The Tax will be: " + tax);
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
