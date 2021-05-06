
public class ex02 {

	public static void main(String[] args) {
     int [][]arr = new int[5][5];
     int cnt =1;
    System.out.println("원본");
     for(int i=0; i<arr.length ;i++ ) {
    	 for(int j=0 ; j<arr.length ; j++) {
    		 arr[i][j] = cnt++;
    		 System.out.print(arr[i][j]+ "\t");
    	 }
    	 System.out.println();
    	
     }
     System.out.println();
     System.out.println("180도 회전");
     for(int i=arr.length-1 ; i>=0; i--) {
    	 for(int j=arr.length-1 ; j>=0 ; j--) {
    	System.out.print(arr[i][j]+ "\t");
    	
    	 }
    	 System.out.println();
     }
	
	}

}
