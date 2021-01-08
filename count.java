//Java program for count the digits.
import java.util.Scanner;
class count {
	private static Scanner sc;
	public static void main(String args[]) {
		int number,count;
		sc=new Scanner(System.in);
		System.out.println("Enter the number that you want to count...");
		number=sc.nextInt();
		while(number%10==0) {
			number=number%10;
			count++;
		}
		System.out.println("The number of digits are....."+count);
	}
}	