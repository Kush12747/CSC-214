import java.util.Scanner;

public class Palindrome {

	//loop to check if the characters match backwards
	public static boolean palindromeCheck(char[] arr, int count) {
		for (int i = 0, j = count - 1; i <= j; i++, j--) {

            if (arr[i] != arr[j]) { 
            	return false; 
            }
        } 
		return true; 
  }
	
	public static void main(String[] args) {
		while (true) {
			Scanner input = new Scanner (System. in);
	        System.out.print ("Enter a string: ");
	        String message = input.nextLine();
	        
	        //creating an array to put words into
	        char[] collect = message.toCharArray();
	        int size = collect.length;
	        
	        //program to quit by user
	        if (message.equals("exit") || message.equals("Exit")) 
	        	{ break; }
	        
	        //goes through function above to check if it's a palindrome
	        //or not
	        if (palindromeCheck(collect, size)) {
	            System.out.println("True");
	        }
	        else {
	            System.out.println("False");
	        }
	    }
	}
}
