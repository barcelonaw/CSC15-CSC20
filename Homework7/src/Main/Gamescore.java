/* H O M E W O R K   # 7
 * C S C   1 5
 * 
 * Student's Name Here: MICO BARCELONA
 * 
 * Follow the directions on the Homework #7 hand out and submit this file via Canvas by the due date.
 * 
 * */

package Main;

																/* Create a class that handles keeping track of a video game's score (according to specifications on the hand out)
 * 
 * Fill in the fields, constructor body, and method bodies to complete the assignment. */

public class Gamescore{
																						// TODO: Fields...
	
	
private int score;
	
	
	
															// TODO: Constructor...
	
	
	
public Gamescore(int startScore){
	startScore = score;
}




																						// TODO: Methods...



// GET SCORE
	public int getScore(){
	
		return score;
	
	}
	
	
//INCREASE SCORE
	
	public void increaseScore(int amt){
	
		score = score + amt;
		
	
		

		
	
	}
	
//DECREASE SCORE
	
	
	public void decreaseScore(int amt){
		
		
		score = score - amt;
				
	
		

		
		}
	
	
//RESET SCORE
	
	public void resetScore(){
		
		score = 0;
	
		
		
		}
	
	//SET SCORE
	
	public void setScore(int value){
		
		
		score = value;
		
		
		}
	
	//TO STRING
	
	public String toString(){
		
		
		return "Score: " + score;
		
		}
}