import java.util.Scanner;
import java.util.Arrays;

//class for testing the scores entered by the user by using another array
//to pass the values.
class TestScores {

	private double[] grades;
	
	//constructor for scores
	public TestScores(double[] scores) {
		grades = scores;
		//exception for abnormal situations
		try {
			for (int i = 0; i < grades.length; i++) {
				if (scores[i] < 0 || scores[i] > 100) {
					//throw this exception to the user
					throw new IllegalArgumentException("Test Scores must have a value less than 100 and greater than 0.");
				}
				else {
					grades[i] = scores[i];
				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.exit(0);
		}
	}
	//average function to calculate the average of the test scores
	public double calcAverage() {
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum / grades.length;
	}
}

public class TestScoresDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of test scores: ");
		int x = input.nextInt();
		
		//make an array for how many values the user wants and store them into
		//the scores array
		double[] scores = new double[x];
		for (int i = 0; i < x; i++) {
			System.out.print("Enter test score " + (i + 1) + ": ");
			scores[i] = input.nextDouble();
		}
		//object for the TestScores class to get average
		TestScores t = new TestScores(scores);
		System.out.println(t.calcAverage());
	}
}