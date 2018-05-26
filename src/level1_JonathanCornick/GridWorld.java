package level1_JonathanCornick;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
    public static void main(String[] args) {
		World w = new World();
		Bug b1 = new Bug();
		b1.setColor(Color.GREEN);
		b1.turn();
		w.add(12, b1);
		
		
		w.show();
		
	}
}
