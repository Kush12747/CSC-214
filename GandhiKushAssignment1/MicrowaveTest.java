
public class MicrowaveTest {

	public static void main(String[] args) {
		Microwave test = new Microwave();
		test.levelSwitch();
		test.levelSwitch();
		test.increaseTime();
		test.increaseTime();
		test.increaseTime();
		test.increaseTime();
		test.start();
		test.reset();
		test.start();

	}

}
