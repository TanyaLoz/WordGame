import java.util.random.*;

public class Numbers {
	private int randomNum;
	
	public Numbers() {
		
	
	}
	
	public int getRandomNum() {
		return randomNum;
	}
	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
	}
	public void generateNumber() {
		randomNum = (int) (101 * Math.random());
	}
	public boolean compareNumber(int guess) {
	    if(guess == randomNum) {
		System.out.println("Congratulations, you guessed the number!");
		return true;
		}
	    else if (guess>randomNum) {
		System.out.println("I'm sorry.That guess was too high.");
		return false;
	    
	    }
	    else if (guess<randomNum)
	    System.out.println("I'm sorry.That guess was too low.");
		return false;
	}
}
