import java.util.Scanner;
public class Multi_operations_on_Strings {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		String str=new String("Engineering");
		char arr[]=str.toCharArray();
		System.out.println(str.length());
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int length=arr.length/2;
		System.out.print(arr.length);
		System.out.println();
		for(int i=length;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		int sum=arr[arr.length-1]+arr[0];
		System.out.println();
		System.out.print(sum);
	}

}
