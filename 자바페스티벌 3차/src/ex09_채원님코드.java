
public class ex09_채원님코드 {

	public static void main(String[] args) {
		 int input = 8;
	      int a1 = 1;
	        
	        System.out.print(a1+" ");
	        
	      for(int i=1; i<input; i++) {
	      System.out.print(fibo(i)+" ");
	      }
	      
	   }
	   public static int fibo(int input) {
	      int a1 =0;
	      int a2 = 1;
	      int a3 = 0;
	      int result = 0;
	      
	       for(int i=1; i<=input; i++){
	               a3=a1+a2;
	               result = a3;
	               a1=a2;
	               a2=a3;
	      }
	       return result;
	   }
	   

	}

}
