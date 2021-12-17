/* H O M E W O R K   # 8
 * C S C   1 5
 * 
 * Student's Name Here: 
 * 
 * Follow the directions on the Homework #8 hand out and submit this file via Canvas by the due date.
 * 
 * */

package Main;

public class Homework8{
	public static void main(String[] args){
		// TODO: Follow Homework #8 instructions for assignment and place code below...
		// Feel free to use the p() method to print text instead of System.out.println()
		
		// TODO: Write file data...
		
		

	EZFileWrite ezw = new EZFileWrite("tester.txt");
		
				int []x = new int[6];
		
		for(int i=1; i < x.length; i++){
			
			ezw.writeLine("Test Line #" + (x[i]=i));
		}
		
		ezw.saveFile();
		
		
		
		
		

		
		// TODO: Read file data in and display...
		
	EZFileRead ezr = new EZFileRead("tester.txt");
		
		
				int testline = ezr.getNumLines();
		
		String testforline = ezr.getLine(0);
		for (int i = 0; i < ezr.getNumLines(); i++){
			
				testforline = ezr.getLine(i);
				p(testforline);

		}
		
		ezw.saveFile();
		
		
		// TODO: Append to a file...
		
	
		
		
		EZFileWrite eza = new EZFileWrite("testwrite2.txt");
		
		for (int i = 0; i< ezr.getNumLines(); i++){
		
		}
		
		
		int []y = new int[4];
		
		
			for(int i=1; i < y.length; i++){
			
					eza.writeLine("Append Line #" + (y[i]=i));
		
			}
	
					eza.saveFile();	
		
		
		
		// TODO: Display results of new file
	
			EZFileRead ezr2 = new EZFileRead("testwrite2.txt");
					
					
					int appendLine = ezr2.getNumLines();
					
					String appenednewLine = ezr2.getLine(0);
					
					for (int i = 0; i < ezr2.getNumLines(); i++){
						
							appenednewLine = ezr2.getLine(i);
							p(appenednewLine);

					}
					
					ezw.saveFile();
				
					
					
	}
	
	public static void p(String out){
		System.out.println(out);
	}
}