package level1_JonathanCornick;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
    public static void main(String[] args) {
    	
    	
    	World w = new World();
    	Bug b1 = new Bug();
    	
    	
    	int j = 0;
    	for (int i = 0; i < 10; i+=2) {
    		int k = i;
    		j+=1;
    		Location l = new Location(k , j);
			w.add(l, b1);
		}
    	
    	
    	
    	
    	
    	
		
//		int r = 10;
//		
//		for (int i = 0; i < 10; i++) {
//			Location l = new Location(i, i);	
//			w.add(l, b1);
//			r--;
//			Location k = new Location(i, r );
//			w.add(k, b1);
//		}
		
		
		
		
		
		
	//	Bug b1 = new Bug();
	//	Location l = new Location(1,1);
	//	Location k = new Location(5, 4);
	//	Location y = new Location(5, 6);
	//	Flower p = new Flower(Color.BLACK);
	//	Flower v = new Flower(Color.YELLOW);
      //  int h = new Random().nextInt(5);
      //  h+=5;
	//	Location e = new Location(h , h);
	//	Bug b2 = new Bug();
	//	b2.setColor(Color.BLUE);
	//	b2.turn();
	//	b2.turn();
	//	b1.setColor(Color.GREEN);
	//	b1.turn();
	//	w.add(l, b1);
	//	w.add(e, b2);
	//	w.add(k, p);
	//	w.add(y, v);
		
		
		w.show();
		
	}
}
