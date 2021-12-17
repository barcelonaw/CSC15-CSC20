// Your name here: MICO BARCELONA

package Main;

import java.util.ArrayList;

public class StackList{
	// Fields
	private ArrayList<String> a;		// Declared object
	
	// Constructor
	
	
	
	public StackList(){
		
		a = new ArrayList<String>();
		
	}
	
	// Methods
	public void push(String item){
	
		a.add(item);
		
	}
	
	public String pop(){
		
		if(this.isEmpty())
			
			return "EMPTY";
		
		String data = a.remove(0);
		
		return data;
		
	}
	
	public String peek(){
		
		
		if(this.isEmpty())
			
			return "EMPTY";
			
		return a.get(0);
		
		
	}
	
	public boolean isEmpty(){
		
		if(this.size() == 0)
			
			return true;
		
		return false;
					
		
	}
	
	public int size(){
		
		return a.size();
		
	}
	
	public void clear(){
		
		a.clear();
		
	}
}