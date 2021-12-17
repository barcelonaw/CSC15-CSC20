// MICO BARCELONA

package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Lab10{
	public static void main(String[] args){
		// TEST PORTION (DO NOT MODIFY!)
		ArrayList<String> alist = new ArrayList<String>();	// Created array list
		Stack<Integer> st = new Stack<Integer>();			// Created stack
		final int n = 10;
		for(int i = 0; i < n; i++){
			alist.add(Integer.toString(i));
			st.push(i);
		}
	
	   Iterator<String> arrayIterator = alist.iterator();
	   
	   	while(arrayIterator.hasNext()) {
	   		
	   		p(arrayIterator.next());
	   		 		
	   		
	   		
	   	}
	
	   	Iterator<Integer> stackIterator = getStackIterator(st);
	   	
	   		while(stackIterator.hasNext()) {
	   			
	   			pn(st.pop());
	   			
	   		}
	   		
	}
	
	
	   
	 public static Iterator<String> getArrayListIterator(ArrayList<String> arrayList) {
		  
		   Iterator<String> it = arrayList.iterator();
		   
		   		return it;
	   }
	
	   
	   
	   
	 

	
	

	   
	/* Helper method for easy printing on same line */
	public static <E> void p(E item){
		System.out.print(item + " ");
	}
	
	
	
	
	
	/* Helper method for easy printing with line return */
	public static <E> void pn(E item){
		System.out.println(item);
	}
}