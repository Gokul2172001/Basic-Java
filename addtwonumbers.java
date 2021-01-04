//Java program add two numbers.
import java.util.Scanner;
class addtwonumbers {
	private static Scanner sc; 
	public static void main(String args[]) {
		int num1,num2,sum;
		sc=new Scanner(System.in);
		System.out.println("Enter the first number...");
		num1=sc.nextInt();
		System.out.println("Enter the second number...");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("The addition of the number is ...." +sum);
	}
}

		