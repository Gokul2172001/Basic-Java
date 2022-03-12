import java.util.*;
public class Two_dimensional_Array {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		int a=input.nextInt();
		int arr[][]=new int[a][a];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++) {
				arr[i][j]=input.nextInt();
			}
				
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		 
	}

}
