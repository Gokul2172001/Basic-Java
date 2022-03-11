import java.util.Scanner;
public class array {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input=new Scanner(System.in);
		int a=input.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
