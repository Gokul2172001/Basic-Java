//Java program for check pallindrome in the number.
import java.util.*;
class pallindrome
{
	private static Scanner input;
	public static void main(String args[])
	{
		int n,temp,rem,rev=0;
		input=new Scanner(System.in);
		System.out.println("Enter the number you wish");
		n=input.nextInt();
		temp=n;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("reversed number of you entered.."+rev);
		if(n==rev)
		{
			System.out.println("The entered numbers are a palindrome.");
		}
		else
		{
			System.out.println("The entered numbers are not a palindrome.");
		}
	}
}