// Java program to find average marks of the exam.
import java.util.Scanner;
class average {
	private static Scanner sc;
	public static void main(String args[]) {
		int mark1,mark2,mark3,mark4,mark5,total,average;
		sc=new Scanner(System.in);
		System.out.println("Enter the mark of Tamil...");
		mark1=sc.nextInt();
		System.out.println("Enter the mark of English...");
		mark2=sc.nextInt();
		System.out.println("Enter the mark of Mathematics...");
		mark3=sc.nextInt();
		System.out.println("Enter the mark of Science...");
		mark4=sc.nextInt();
		System.out.println("Enter the mark of Social Science...");
		mark5=sc.nextInt();
		total=mark1+mark2+mark3+mark4+mark5;
		System.out.println("The total marks of the student is ..");
		System.out.println(+total);
		average=total/5;
		System.out.println("The average of the mark is :"+average);
	}
}

		
		