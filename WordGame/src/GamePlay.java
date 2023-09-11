import java.util.Scanner;
public class GamePlay{	
		
	public static void main(String[]args) {
		Person person ;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String firstName = keyboard.nextLine();
		System.out.println("Would you like to enter a last name? Leave blank if not.");
		String lastName = keyboard.nextLine();
		if(lastName.equals(""))
			person = new Person(firstName);
		else
			person = new Person(firstName,lastName);
		Numbers num = new Numbers();
		num.generateNumber();
		boolean win = false;
		while (!win) {
	       //enter guess
			System.out.print(person.getName()+ " "+ person.getLastName()+" enter guess: ");
			int guess = keyboard.nextInt();
			win = num.compareNumber(guess);
			
		}
	}
}
