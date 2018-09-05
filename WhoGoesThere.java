import java.util.Scanner;

public class WhoGoesThere {
	public static void main (String[] args) {
		
		String fName, sName;
		int age;
		
		Scanner Input = new Scanner(System.in);

		System.out.print("What is your first name: ");
		fName = Input.nextLine();
		
		System.out.print("What is your last name: ");
		sName = Input.nextLine();
		
		System.out.print("What is your age: ");
		age = Input.nextInt();
		
		System.out.println("As long as you are over the age of " + (age - 10) + " then ");
		System.out.println("You are free to pass " + fName + " " + sName);
		
	}

}
