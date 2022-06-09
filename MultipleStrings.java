
public class MultipleStrings {

	public static void main(String[] args) {
 String s="hoe are you	hello grtgdg	world";
  //String st=s.replaceAll(" ", "");
  String[] st1=s.split(" ");
  for(int i=0;i<st1.length;i++)
  {
	  System.out.print(st1[i]);
  }
  //System.out.println(st);
	}

}
