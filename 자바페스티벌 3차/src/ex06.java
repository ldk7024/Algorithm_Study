
public class ex06 {

	public static void main(String[] args) {
		System.out.println(getmiddle("test"));

	}
   public static String getmiddle(String a) {
	   int num = a.length()/2;
	   if(a.length() %2 ==0) {
		   a = a.substring(num-1,num+1);
	   }
	   else {
		   a= a.substring(num,num+1);
	   }
	   return a;
   }
}
