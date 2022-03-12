import java.util.Scanner;
public class reversearray {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		//int max=0;
		int a=input.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=a-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
