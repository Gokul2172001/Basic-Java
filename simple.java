import java.util.*;
public class simple  {
	public static void main(String args[]) {
		Scanner ask = new Scanner(System.in);
		char alphabet;
		alphabet=ask.next().charAt(0);
		if((alphabet>='a'&&alphabet<='z')||(alphabet>='A'&&alphabet<='Z')) {
			System.out.println(alphabet+" is an Alphabet");
		}
		else {
			System.out.println(alphabet+" is not an Alphabet");
		}
			
		//int a=-10;
		//char vowel,a,e,i,o,u,A,E,I,O,U;
		//vowel=ask.next().charAt(0);
		//if((vowel=='a')||(vowel=='e')||(vowel=='i')||(vowel=='o')||(vowel=='u')||(vowel=='A')||(vowel=='E')||(vowel=='I')||(vowel=='O')||(vowel=='U')) {
			//System.out.println(vowel+" is a VOWEL. ");
		//}
		//else {
			//System.out.println(vowel+" is not a vowel. ");
		//}
		//int b=a++;
		//int a,b,c1;
		//int c1,c2,c3,c4,c5;
		//a=ask.nextInt();
		//b=ask.nextInt();
		//c1=a^b;
		//c2=a-b;
		//c3=a*b;
		//c4=a/b;
		//c5=a%b;
		//System.out.println("Addition of two Numbers: "+c1);
		//System.out.println("Substraction of two Numbers: "+c2);
		//System.out.println("Multiplication of two Numbers: "+c3);
		//System.out.println("Division of two Numbers: "+c4);
		//System.out.println("Modulo of two Numbers: "+c5);
		//System.out.println(a>>>3);
		//System.out.println(b);
	}
}