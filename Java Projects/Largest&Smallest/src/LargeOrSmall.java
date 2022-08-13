import java.util.Scanner;

public class LargeOrSmall {

	public static void main(String[] args) {
		int num, smallest, largest;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer (-99 to stop): ");
		num = input.nextInt();
		
		//set large and small to num to compare later
		largest = smallest = num;
		
		//loop for user to enter as many times 
		while (num != -99) {
			System.out.print("Enter an integer (-99 to stop): ");
			num = input.nextInt();
			
			//if case to test which number is large and small
			if (num != -99) {
				if (num > largest) {
					largest = num;
				}
				else if (num < smallest) {
					smallest = num;
				}
			}
		}
		System.out.println("The smallest number was: " + smallest + "\nThe largest number was: " + largest);
	}
}
