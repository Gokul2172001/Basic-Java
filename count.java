import java.util.*;
public class count {
	public static Scanner coun;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,count=0;
		coun=new Scanner(System.in);
		number=coun.nextInt();
		System.out.println("Enter the number.."+number);
		while(number!=1) {
		 {
				count++;
				number=number/10;
			}
		}
		System.out.println(count);
	}

}
