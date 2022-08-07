import java.util.*;
public class Flames_using_String {
	public static Scanner input;
	public static void main(String[] args) {
		input=new Scanner(System.in);
		int count1,count2,count3;
		String str1=input.nextLine();
		String str2=input.nextLine();
		//After entering those strings then it converted into arrays.
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr1[i]=0;
					arr2[i]=0;
					
				}
			}			
		}
		String str3=String.valueOf(arr1);
		String str4=String.valueOf(arr2);
		String str5=str3.trim();
		String str6=str4.trim();
		count1=str5.length();
		count2=str6.length();
		count3=count1+count2;
		System.out.println(count3);
		swith(count3) {
			case1:System.out.println("Friend");
			break;
			case2:System.out.println("Lover");
			break;
			case3:System.out.println("Affection");
			break;
			case4:System.out.println("Marriage");
			break;
			case5:System.out.println("Enemy");
			break;
			default:System.out.println("Siblings");
	}

}
