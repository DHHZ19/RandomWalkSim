

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
		    x++;
			break;
			case 1: 
			x--;
			break;
		
			case 2: 
			
			y++;
			
			break;
			
			case 3: 
		    
		    y--;
			 
			break;
			
			default: 
				System.out.println("Invalid Direction");
			}
			stepsTaken++;
		}
		
		 
		 public boolean moreSteps() {
			return (stepsTaken <= maxSteps);
			 
		 }
		 
		 public boolean inBounds() {
//			do {
//				return true;
//			}while(maxCoord >= x && maxCoord >= y && maxCoord <= -x && maxCoord <= -y);
	//		 "return x >= 0 && x <= maxCoord && y >= 0 && y <= maxCoord;"
			 return maxCoord >= x && maxCoord <= x && -y >= 0 && y <= maxCoord;
		 }
		
		public String toString(){
			return "Steps: " + stepsTaken + " Poisiton: " + x + "," + y;
		}
		
		public String walk(){
			do {
				takeStep();
		   }while(moreSteps() && inBounds());
			return toString();
		}
	}


