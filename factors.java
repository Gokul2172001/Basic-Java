import java.util.*;
public class factors {
	public static Scanner fact;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		fact=new Scanner(System.in);
		System.out.println("Enter the number to find factor...= ");
		number=fact.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
