//Java program for ascii value of a character.
import java.util.Scanner;
class asciivalue {
	private static Scanner sc;
	public static void main(String args[]) {
		sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter the character....");
		ch=sc.nextChar();
		int ascii=ch;
		int castAscii=(int) ch;
		System.out.println("The ASCII value of "+ch+ " is:"+ascii);
		System.out.println("THe ASCII value of "+ch+ " is:"+castAscii);
	}
}