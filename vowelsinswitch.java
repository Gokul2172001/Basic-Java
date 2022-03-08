import java.util.*;
public class vowelsinswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vowel = new Scanner(System.in);
		char ch;
		System.out.println("Enter the character...");
		ch=vowel.next().charAt(0);
		switch(ch) {
		case 'a': 
		case 'e':
		case 'i':
		case 'o': 
		case 'u':
		case 'A': 
		case 'E': 
		case 'I':
		case 'O':
		case 'U': {
			System.out.println(ch+" is a vowel..");
			break;
		}
		default: {
			System.out.println(ch+" is not a vowel..");
		}
		}
	}

}
