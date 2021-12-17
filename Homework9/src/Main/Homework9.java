// H O M E W O R K   # 9
// C S C   1 5
// Student's Name Here: MICO BARCELONA

package Main;

public class Homework9{
	public static void main(String[] args){
		// My tests (Do NOT modify this part!)
		int[] a = {24,3,12,55,6,21,35,7,33,10};
		int[] b = {72,103,3,56,87,23,9,78,5,110};
		p(divide(10,0));
		p(divide(20,5));
		p(getUnsignedIntString(-100));
		p(getUnsignedIntString(1000));
		p(Integer.toString(getMaxValue(a)));
		p(Integer.toString(getMaxValue(b)));
		p(getArrayElement(a, 3));
		p(getArrayElement(b, 10));
		p(twoSum(a, 31));
		p(twoSum(b, 113));
	}
	
	public static String getUnsignedIntString(int value){
		
		if (value < 0){
			
			
			return "0";
		}
		else
		{
			
			return Integer.toString(value);
		}
			
		
	}
	
	
	
	
	public static String getArrayElement(int[] a, int index){
		
		try{
			
			
			return Integer.toString(a[index]);
			
		}catch(Exception e){
			
			return ("Out of Bounds");
			
			
		}
			
	
	}	
		
		
	

	
	
	
	
	
	public static int getMaxValue(int[] a){
		
		
		int x = a[0];
		
		for (int i = 0; i < a.length; i++)
			
			if (a[i] > x) {
				
				x = a[i];
			}
		
			return x;
		
	}

		
		
		
		
		
		
	
	
	
	public static String divide(int v1, int v2){
		
		
	
		
		try{
			
			int k = v1/v2;
				
			return Integer.toString(k);
			
		} catch (Exception e){
			
			
			return "Undefined";		
			
		}
		
		
		
			

	}
	           
	
	public static String twoSum(int[] a, int sum){
		
	String ret = "";
   
        	int i;
        	int k;
        	int numYes;
        	int numNo;
        	
        for(i=0; i< a.length; i++){
            
        	
        	numYes = a[i];

          
            
            for(k=i+1; k<a.length; k++){
                
            	
            	numNo = a[k];	
                
               
                
                if(numYes + numNo == sum){
                   
                	
                    ret = Integer.toString(numYes) + "," + Integer.toString(numNo);

            }
        }
     }	 
		
		
		return ret;
		
	    	   
	       }
	       
	       
		
		
		
		
		
		
		
		
		
		
	           
	           

	     

	    
		
	
	
	
	

	
	
	
	/* Given for easy printing */
	public static void p(String inp){
		System.out.println(inp);
	}
}