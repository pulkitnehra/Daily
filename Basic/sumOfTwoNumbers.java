import java.util.Scanner;
public class sumOfTwoNumbers{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();

		System.out.println("Enter the second number: ");
		int num2 = scan.nextInt();
		
		// reading a character in java
		System.out.println("Select the operation you want to perform(+ / - / * / /): ");
		char op = scan.next().charAt(0);

		calculate(num1, num2, op);
	}

	public static void calculate(int num1, int num2, char op){
		int result;
		switch(op){
			case '+':
			result = num1 + num2;
			System.out.println("The addition is: "+result);
			break;

			case '-':
			result = num1 - num2;
			System.out.println("The subtraction is: "+result);
			break;

			case '/':
			result = num1 / num2;
			System.out.println("The division is: "+result);
			break;

			case '*':
			result = num1 * num2;
			System.out.println("The multiplication is: "+result);
			break;
			default:
			System.out.println("Please enter a valid operator!\n Try again next time");
		}
	} 
}