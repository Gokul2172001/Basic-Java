//Java program for swap two numbers
import java.util.Scanner;
class swap {
	private static Scanner sc;
	public static void main(String args[]) {
		float first,second,temporary;
		sc=new Scanner(System.in);
		System.out.println("Enter the first number......");
		first=sc.nextFloat();
		System.out.println("Enter the second number.....");
		second=sc.nextFloat();
		System.out.println("---------- Before Swapping ----------");
		System.out.println("The first number is :" + first);
		System.out.println("The second number is :" + second);
		System.out.println("---------- After Swapping ----------");
		temporary=first;
		first=second;
		second=temporary;
		System.out.println("The first number is :" + first);
		System.out.println("The second number is :" + second);
	}
}