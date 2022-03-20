import java.util.Arrays;
import java.util.Scanner;
public class Mixed_Sorting {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		int num=input.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<num/2;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=num-1;i>=num/2;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
