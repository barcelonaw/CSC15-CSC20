package Main;


//MICO BARCELONA

//Public void

interface ShotGlass {
	
	String shot = "Take a shot!";
		
		
	public void takeShot();
	
}




//Default void


interface Lemon{
	
	
	default void Test(){
		
		
		
	}
	
}





interface Random{
	
	static void bonk(){
		
		System.out.println("Static method");
	}	
		
		void overM (String str);
}




//Class that implements interfaces
public class Lab03 implements ShotGlass, Lemon, Random{

	public static void main(String[] args){
		 Lab03 x = new Lab03();
		
		 System.out.println(shot);
		 
		 
		 x.takeShot();
		
	 
		 //--------------------------------------------
		
		 System.out.println("Default method");
		
		 x.Test();
			 
		 
		
		//--------------------------------------------
		 
		Random.bonk();
		
		x.overM("Static method overrided");
		
		
		 	 
	}

	//Implemention methods
	
	@Override
	public void takeShot() {
		System.out.println("Shot was taken!");
		
	}



	@Override
	
	public void Test(){
		
		System.out.println("Default method overrided");
		

	}
	
	
	@Override
	public void overM(String str){
	
		System.out.println(str);
	}
	

}

