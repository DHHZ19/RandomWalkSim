import java.util.*;

public class RandomWalk {
	private int x;
	private int y;
	private int maxSteps;
	private int maxCoord;
	private int stepsTaken;
	Random rand = new Random();
	
	
	RandomWalk(int max, int edge){
		maxSteps = max;
		maxCoord = edge;
	}
	
	
	RandomWalk(int max, int edge, int startX, int startY){
		maxSteps = max;
		maxCoord = edge;
		x = startX;
		y = startY;
	}
	
	
	 void takeStep() {
		int randDirection;
		randDirection = rand.nextInt(4);
		switch(randDirection){
		case 0: 
	    stepsTaken++;
		System.out.printf("Moved Forward");
		break;
		
		case 1: 
		stepsTaken++;
		System.out.printf("Moved Right");
		break;
		
		case 2: 
		stepsTaken++;
		System.out.printf("Moved Backward");
		break;
		
		case 3: 
	    stepsTaken++;
		System.out.printf("Moved Forward");
		break;
		
		default: 
			System.out.println("Invalid Direction");
		}
	}
	
	 
	 boolean moreSteps() {
		 do {
			 return true;
		 }while(stepsTaken < maxSteps);
		 
	 }
	 
	 boolean inBounds() {
		do {
			return true;
		}while((maxCoord > x) && (maxCoord > y));
	 }
	
	public String toString() {
		return("Steps: " + stepsTaken + "Poisiton: " + x + "," + y);
	}
	
	public String walk(){
		do {
			takeStep();
	 }while(moreSteps() && inBounds());
		return toString();
	}
	
	
}
