
public class ex09 {

	public static void main(String[] args) {
		int input = 8;
		for(int i =1 ; i<= input ; i+=1) {
			System.out.print(fibo(i)+" ");
		}

	}
	public static int fibo(int input) {
		if (input<=1) {
			return input;
		}
		else {
			return fibo(input -2) + fibo(input -1);
		}
	}

}
