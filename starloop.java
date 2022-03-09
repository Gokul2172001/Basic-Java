import java.util.*;
public class starloop {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		input=new Scanner(System.in);
		n=input.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i==1||i==n||j==1) {
					System.out.print("$");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
