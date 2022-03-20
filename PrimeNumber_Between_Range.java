import java.util.Scanner;
public class PrimeNumber_Between_Range {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		int count=0;
		int num1=input.nextInt();
		int num2=input.nextInt();
		for(int i=num1;i<num2;i++) {
			for(int j=2;j<=i;j++) {
				if(num1%j==0) {
					count=count+1;
				}
			}
			if(count==1) {
				System.out.print(i+" ");
			}
		}
	}

}
