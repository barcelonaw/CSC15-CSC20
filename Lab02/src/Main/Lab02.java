// Your name here: 

package Main;

import java.util.StringTokenizer;

public class Lab02{
	public static void main(String[] args){
		// My code to dynamically create a small movie database (DO NOT MODIFY OR REMOVE!)
		String[] movies = new String[5];
		movies[0] = "Shawshank Redemption*1994*Tim Robbins*2.36";
		movies[1] = "The Godfather*1972*Al Pacino*2.92";
		movies[2] = "Raging Bull*1980*Robert De Niro*2.15";
		movies[3] = "Million Dollar Baby*2004*Hilary Swank*2.2";
		movies[4] = "Straight Outta Compton*2015*Jason Mitchell*2.45";
		// End of code
		
		// TODO: Write your code to parse the data, and display the data in a meaningful way...
		// (Use the instructions in the hand out to complete the assignment for full credit)
	
		
		
		
		
		
		// ARRAYS TO HOLD PARSED DATA
		
		String[] titles = new String[movies.length];
	       
	    int[] years = new int[movies.length];
	       
	    String[] stars = new String[movies.length];
	       
	    float[] runtimes = new float[movies.length];
	       
	       
	       
	    // CREATE A LOOP THAT ITERATES THROUGH THE STRINGS   
	       
	    for (int i = 0; i < movies.length; i++) {
	        
	    	   	String raw = movies[i];
	    	   
	    StringTokenizer st = new StringTokenizer(raw, "*");
	    	  
	    	  				//SAVING THE TOKENS
	    	   
	    	  			titles[i] = st.nextToken("*");
	           
	           
	    	  			years[i] = Integer.parseInt(st.nextToken("*"));
	           	
	           
	    	  			stars[i] = st.nextToken("*");
	           
	           
	    	  			runtimes[i] = Float.parseFloat(st.nextToken("*"));
	     
	    	  			
	    	  			//PRINT STATEMENTS
	       
	       }
	       

	       System.out.println("-------MOVIES-------");
	       for (String t: titles) {
	           System.out.println(t);
	       }


	       
	       System.out.println("-------YEARS-------");
	       
	       for (int y: years) {
	           System.out.println(y);
	       }


	       
	       System.out.println("-------STARS-------");
	       for (String s: stars) {
	           System.out.println(s);
	       }


	       
	       System.out.println("-------RUNTIMES-------");
	       for (float r: runtimes) {
	           System.out.println(r);
	       }
	   }
	}