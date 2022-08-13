
public class Microwave {
	//variables for our microwave for level and time
	int time = 0;
	int level = 0;
	
	public void start() {
		//print statement of cooking time
		System.out.println("Cooking for " + time + " seconds at level " + level);
	}
	
	public void increaseTime() {
		//increase the time by 30sec
		time = time + 30;
	}
	
	public void levelSwitch() {
		//increase the level by 1
		level = level + 1;
	}
	
	public void reset() {
		//set time back to 0 for reset
		time = 0;
	}
}
