import java.util.*;
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner grade = new Scanner(System.in);
		int mark;
		mark=grade.nextInt();
		System.out.println("Enter the Mark: "+mark);
		if(mark>=95) {
			System.out.println("You are A+ grade.");
		}
		else if(mark>=90) {
			System.out.println("You are A grade.");
		}
		else if(mark>=85) {
			System.out.println("You are B+ grade.");
		}
		else if(mark>=80) {
			System.out.println("You are B grade.");
		}
		else if(mark>=75) {
			System.out.println("You are C+ grade.");
		}
		else if(mark>=70) {
			System.out.println("You are C grade.");
		}
		else if(mark>=65) {
			System.out.println("You are D+ grade.");
		}
		else if(mark>=60) {
			System.out.println("You are D grade.");
		}
		else if(mark>=50) {
			System.out.println("You are E grade.");
		}
		else {
			System.out.println("You are Fail.");
		}
			
			

	}

}
