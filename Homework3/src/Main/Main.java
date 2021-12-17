package Main;

public class Main{
	public static void main(String[] args) {
			
		
		int i = 0;
		final int max = 10;
		
		// The "while loop", when executed, runs infinitely until there is a trigger.
		// In this case the trigger is (i < max), we add the ++ unary operator to increase it by 1
		// As soon as 1 is = to 10 it will stop running 
		
		
		while (i < max){		
			
			System.out.println(Integer.toString(i));
			i++;	
		}

		// The "do while" loop
		
		int one = 0;
		
		
		do{
			System.out.println(one);
			one++;
		}
		
		while (one < 10);
		
		
		// The "for" loop
		
		
	for (int juan = 1; juan > 10; juan++){
			
			System.out.println(juan);
		}
		
		
		
		}
}