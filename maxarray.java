import java.util.*;
public class maxarray {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		int max=0;
		int a=input.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=input.nextInt();
		}
		//for(int i=0;i<a;i++) {
			//System.out.println(arr[i]+" ");
		//}
		max=arr[0];
		for(int i=0;i>a;i++) {
			arr[i]=arr[0];
		}
		System.out.println(max);
	}

}
