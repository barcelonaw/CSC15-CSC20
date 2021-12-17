// H O M E W O R K   # 1 0
// C S C   1 5
// Student's Name Here: MICO BARCELONA

package Main;

import java.util.StringTokenizer;

public class Homework10{
	public static void main(String[] args){
		// My code to dynamically create a text file (DO NOT MODIFY OR REMOVE!)
		EZFileWrite efw = new EZFileWrite("parse.txt");
		efw.writeLine("Shawshank Redemption*1994*Tim Robbins*2.36");
		efw.writeLine("The Godfather*1972*Al Pacino*2.92");
		efw.writeLine("Raging Bull*1980*Robert De Niro*2.15");
		efw.writeLine("Million Dollar Baby*2004*Hilary Swank*2.2");
		efw.writeLine("Straight Outta Compton*2015*Jason Mitchell*2.45");
		efw.saveFile();
		// End of test
		
		// TODO: Write your code to load the text file into memory, parse it, and display the data in a meaningful way...
		// (Use the instructions in the hand out to complete the assignment for full credit)
		
		EZFileRead ezr = new EZFileRead("parse.txt");
		
		
		
			int i = 0;
			
		
			
			
				String[] movies = new String[5];
			
				int[] years = new int [5];
			
				String[] stars = new String [5];
			
				float[] runtimes = new float [5];
			
				for (i = 0; i < ezr.getNumLines(); i++) {
				
						try{String raw = ezr.getLine(i);
							
								StringTokenizer st = new StringTokenizer(raw, "*");
							
									movies[i] = st.nextToken();
							
									years[i] = Integer.parseInt(st.nextToken());
							
									stars[i] = st.nextToken();
							
									runtimes [i] = Float.parseFloat(st.nextToken());
							
						} catch(ArrayIndexOutOfBoundsException e){
							
							
			// -------------------------------------------------------------------------------------				
				
				System.out.println("Out of Bounds");
			}
			
			
			System.out.println("----------MOVIES----------");
			for (String M: movies){
				System.out.println(M);
			}
			
			System.out.println("----------YEARS----------");
			for (int Y: years){
				System.out.println(Y);
			}
			
			
			
			System.out.println("----------STARS----------");
			for (String S: stars){
				System.out.println(S);
			}
			
			System.out.println("----------RUNTIMES----------");
			for (float R: runtimes){
				System.out.println(R);
			}
	}
	
}}