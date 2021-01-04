//Java program for multiply the two number.
import java.util.Scanner;
class multwonumbers {
	private static Scanner sc;
	public static void main(String args[]) {
		int num1,num2,mul;
		sc=new Scanner(System.in);
		System.out.println("Enter the first number...");
		num1=sc.nextInt();
		System.out.println("Enter the second number...");
		num2=sc.nextInt()l;
		mul=num1*num2;
		System.out.println("The multiplication of the numbers is ....."+mul);
	}
}

