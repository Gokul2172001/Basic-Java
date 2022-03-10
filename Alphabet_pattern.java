import java.util.Scanner;
public class Alphabet_pattern {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,n,i,alphabet=64;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print((char) (alphabet+j));
			}
			System.out.println();
		}

}
}	