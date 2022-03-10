import java.util.*;
public class numberpatern {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,k,num=1;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if(j<i) 
					System.out.print(i+"*");
				else
					System.out.println(i);
			}
			System.out.println();
			
		}
		for(i=n-1;i>=i;i++) {
			for(j=1;j<=i;j++) {
				if(j<i)
					System.out.println(i);
				else
					System.out.println(i);
				System.out.println();
			}
		}

}
}