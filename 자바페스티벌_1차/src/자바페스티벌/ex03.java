package 자바페스티벌;

public class ex03 {

	public static void main(String[] args) {
		int result =0;
		for (int i =1 ; i<101 ; i++) {
			if(i%2==1) {System.out.print(i+" ");
			result+=i;
				
			}
			else {System.out.print("-"+i+" ");
			result-=i;
				
			}
		}System.out.println();
		System.out.println("결과: "+result);

	}

}
