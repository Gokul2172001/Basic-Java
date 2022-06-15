import java.util.*;
public class PRPMilestone1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int inp1=input.nextInt();
		int temp=inp1;
		int i=0;
		int arr1[]=new int[4];
		while(temp!=0) {
			arr1[i]=temp%10;
			temp=temp/10;
			i=i+1;
		}
		Arrays.sort(arr1);
		for(i=0;i<=3;i++) {
			System.out.println(arr1[i]);
		}
	}

}
