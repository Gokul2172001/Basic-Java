import java.util.*;
public class find_array {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("enter number to find:");
	int find=sc.nextInt();
	for(int i=0;i<5;i++)
	{
		if (a[i]==find)
		{
			System.out.println(find+"present at position of "+(i+1));
		}
	}
	}
}
			// TODO Auto-generated method stub

	


