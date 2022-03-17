import java.util.*;
public class Array_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
