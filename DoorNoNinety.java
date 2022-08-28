import java.util.*;
public class DoorNoNinety {
	public static void main(String[] args) {
		// TODO autho generated...
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int count=0;
		for(int i=1;i<=15;i++) {
			String bin=Integer.toBinaryString(i);
			int temp=(Integer.parseInt(bin)*9);
			if(temp%n==0) {
				count+=1;
			}
			if(count==1) {
				System.out.print(temp);
				break;
			}
		}
	}

}
