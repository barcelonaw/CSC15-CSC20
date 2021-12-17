// Your name here: MICO BARCELONA

package Main;

public class Lab09{
	public static void main(String[] args){
		// My tests (DO NOT MODIFY!)
		int[] a = {3,2,6,4,15,7,9,8,6};
		p(recurseSum(a));				// Sum should be 60
		p(recurseMax(a));				// Max should be 15
		// End of tests!
	}
	
	// Recursive methods below here...
	public static int recurseSum(int[] a){
		
		int total = recurseSum(a, a.length);
		
			return total;
	
	}
	
	
	private static int recurseSum(int[] a, int i){
		
		if (i <= 0){
			
			return 0;
	}else{
		
		return (recurseSum(a, i-1) + a[i-1]);
		
	}
}
	
	public static int recurseMax(int[] a){
		
		int max = recurseMax(a, a.length);
		
			return max;	
		
	}
	
	
	
	private static int recurseMax(int[] a, int i){
		
		if(i==1){
			
			return a[0];
		
	}else{
			return Math.max(a[i-1], recurseMax(a, i-1));
			
				

	}
}
	// End recursive methods
	
	/* Method to make printing text easy */
	public static <E> void p(E item){
		System.out.println(item);
	}
}