//Java program for find the number is even or odd.
import java.util.Scanner;
class even {
	private static Scanner sc;
	public static void main(String args[]) {
		int num;
		sc=new Scanner(System.in);
		System.out.println("Enter the number....");
		num=sc.nextInt();
		System.out.println(". . . . . . . . . . . . . . . . . .");
		System.out.println(". . . . . . . . . . . . . . . . . .");
		System.out.println(". . . . . . . . . . . . . . . . . .");
		System.out.println(". . . . . . . . . . . . . . . . . .");
		if(num%2==0) {
			System.out.println("The entered number is even..");
		}
		else {
			System.out.println("The entered number is odd..");
		}
	}
}
		