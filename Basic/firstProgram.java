// package Basic;
import java.util.Scanner;
public class firstProgram{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		// System.out.println("Hello, World!");
		System.out.println("Enter your first name: ");
		String firstName = scan.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = scan.nextLine();
		scan.close();
		System.out.println("Your full name is: "+firstName+" "+lastName);
	}
}