import java.util.*;
public class sumofarrays {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		int sum1=0,sum2=0,sum3;
		int a=input.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<a;i++) {			
			if(arr[i]%2==0) {
				sum1=sum1+1;
			}
			else
				sum2=sum2+1;
		}
		//sum3=sum1+sum2;
		System.out.println(sum1);
		System.out.println(+sum2);
		//System.out.println(sum3);
	}

}
