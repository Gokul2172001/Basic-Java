//Java program for find vowel and consonent;
import java.util.Scanner;
class vowelconsonent {
	private static Scanner sc;
	public static void main(String args[]) {
		char ch;
		sc=new Scanner(System.in);
		System.out.println("Enter the alphabet ...");
		ch=sc.nextChar();
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("The alphabet "+ ch + " is a vowel.");
		}
		else {
			System.out.println("The alphabet "+ ch + " is a consonent.");
		}
	}
}