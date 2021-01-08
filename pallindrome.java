//Java program for check pallindrome in the number.
import java.util.Scanner;
class pallindrome
{
	private static Scanner sc;
	public static void main(String args[])
	{
		int number,temp,remainder,reverse=0;
		sc=new Scanner(System.in);
		System.out.println("Enter the number you wish");
		number=sc.nextInt();
		temp=number;
		while(temp>0)
		{
			remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
		}
		System.out.println("reversed number of you entered.."+reverse);
		if(number==reverse)
		{
			System.out.println("The entered numbers are a palindrome.");
		}
		else
		{
			System.out.println("The entered numbers are not a palindrome.");
		}
	}
}