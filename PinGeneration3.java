import java.util.*;
public class PinGeneration3 {
	public static Scanner input;
	public static void main(String[] args) {
		input=new Scanner(System.in);
		int count=0,n;
		n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
			}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count=count+1;
				}
			}
		}
		System.out.print(count);
	}

}
