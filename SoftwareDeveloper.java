import java.util.*;
public class SoftwareDeveloper {
	static void sort(String arr[], int n) {
	for(int i=1;i<n;i++) {
		String temp=arr[i];
		int j=i-1;
		while(j>=0 && arr[i].length()<arr[j].length()) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=temp;
	}
	}
	public static void getarray(String arr[], int n) {
		Scanner input=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			arr[i]=input.next();
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String arr[]=new String[n];
		getarray(arr,n);
		sort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
