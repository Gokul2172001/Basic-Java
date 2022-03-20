import java.util.Scanner;
public class Majority_Element_count {
	public static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input=new Scanner(System.in);
		char majority=' ';
		int count=0,con=0;
		String str =input.nextLine();
		String str1=str.trim();
		char arr[]=str1.toCharArray();
		/*for(int i=0;i<str.length();i++) {
			System.out.print(arr[i]+" ");
		}*/
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					con=con+1;
					if(con>count) {
						count=con;
						con=0;
					if(arr[i]>majority) {
						majority=arr[i];
					
					}
					}
				}
			}
			
		}
		System.out.print(majority);
		
	}

}
