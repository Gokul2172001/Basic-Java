import java.util.*;
public class arrayswapping {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		int a=input.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=input.nextInt();
		}
		//for(int i=0;i<a;i++) {
			//System.out.println(arr[i]);
		//}
		//int temp=arr[0];
		//arr[0]=arr[a-1];
		//arr[a-1]=temp;
		//arr[0]=arr[0]+arr[a-1];
		//arr[a-1]=arr[0]-arr[a-1];
		//arr[0]=arr[0]-arr[a-1];
		//arr[2]=arr[2]*arr[a-3];
		//arr[a-3]=arr[2]/arr[a-3];
		//arr[2]=arr[2]/arr[a-3];
		
		for(int i=0;i<a;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
