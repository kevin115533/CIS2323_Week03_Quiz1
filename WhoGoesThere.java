import java.util.Scanner;

public class WhoGoesThere {
	public static void main (String[] args) {
		
		String fName, sName;
		int age;
		
		Scanner Input1 = new Scanner(System.in);
		Scanner Input2 = new Scanner(System.in);
		Scanner Input3 = new Scanner(System.in);
		
		System.out.print("What is your first name: ");
		fName = Input1.nextLine();
		
		System.out.print("What is your last name: ");
		sName = Input2.nextLine();
		
		System.out.print("What is your age: ");
		age = Input3.nextInt();
		
		System.out.println("As long as you are over the age of " + age + " then ");
		System.out.println("You are free to pass " + fName + " " + sName);
		
	}

}
