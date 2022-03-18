import java.util.*;
public class Reverse_me_If_you_can {
	public static void main(String args[]) {
		int i,j,len;
		char temp;
		Scanner s=new Scanner(System.in);
		String ch=s.nextLine();
		char str[]=ch.toCharArray();
		len=str.length;
		for(i=0,j=len-1;i<j;i++,j--) {
			while(!(str[i]>=65 && str[i]<=122))
			i++;
			while(!(str[j]>=65 && str[j]<=122))
			j--;
			temp=str[i];
			str[i]=str[j];
			str[j]=temp;
		}
		for(i=0;i<len;i++)
		System.out.print(str[i]);
	}
}