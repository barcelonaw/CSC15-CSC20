// MICO BARCELONA

package Main;

public class StackInt{
	// Fields
	private int[] a;			// Array to hold the stack items behind the scenes
	private int top;			// This is the "top" of the stack
	private final int n = 256;	// This is going to be the fixed size of the stack
	
	// Constructor
	public StackInt(){
// TODO: Initialize the private fields (except the final constant "n")
		
		a = new int[n];
		
		top = -1;
	}
	

	
	// Methods
	public void push(int item){
// TODO: Add the item to the stack based on how stacks are supposed to work
	
		if(top == n-1)
			
			return;
		
		a[++top] = item;
		
	}
	
	
	public int pop(){
		
// TODO: Remove and return the item at the top of the stack. If stack is empty, return -1
		
		
		if(top >= 0){
			
			return a[top--];
		}
		
		return -1;		// This can be removed but is here to prevent the Java error while testing!
	}
	
	
	
	
	public int peek(){
		
		
// TODO: Return the item at the top of the stack. If stack is empty, return -1
		
		
		
		if(top>=0){
		
			return a[top];
		}
		return -1;		// This can be removed but is here to prevent the Java error while testing!
	} 
	
	
	
	
	
	public boolean isEmpty(){
// TODO: Return whether the stack is empty (true if empty) or not (false if stack is not empty)	
		
		
		if(top == -1)
			
			return true;
		!
	}
	
	
	
	
	
	public int size(){
		
// TODO: Return how many items are currently in the stack; Return 0 if stack is empty
// This can be removed but is here to prevent the Java error while testing!	
		
		return top + 1;
		
	}
	
	public void clear(){

// TODO: Find a way to clear access to the stack so it appears empty to the user (Consider "Lazy Evaluation" for efficiency	
		  	
		
top = -1;
		   
		   
}
	
	
	
	public String toString(){
		
		
	
		String str = "";
		       
			if(isEmpty()){
		         
				return "[]";
		  		
		       }else{
		     
		    	   for(int i = top; i>=1; i--){
		        	   
		    		   str = "," + a[i] + str;
		           }
		    	   
		    	   str = "[" + a[0] + str + "]";
		       }
	
			return str;
		      
		   }
	
}


