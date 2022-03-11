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
		case 0: stepsTaken++;
		break;
			
		}
	}
}
