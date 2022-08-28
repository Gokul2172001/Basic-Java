import java.util.*;
public class StockExchangeSpecialist {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		int v=Integer.parseInt(s);
		int temp=v;
		int stock=0;
		while(temp>0) {
			int fact=temp%10;
			temp=temp/10;
		for(int i=fact-1;i>0;i--) {
			fact=fact*i;
		}
		stock=stock+fact;
		}
		if(v==stock) {
			System.out.print("Right");
		}
		else {
			System.out.print("Wrong");
		}
	}

}
