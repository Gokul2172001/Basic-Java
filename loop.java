import java.util.*;
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,i;
		a=sc.nextInt();
		System.out.println("Enter the first value.."+a);
		i=sc.nextInt();
		System.out.println("Enter the last value.."+i);
		for(;a<=i;a++) {
			System.out.println(a);
		}
		

	}

}
