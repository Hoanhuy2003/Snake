package games;

import java.util.Random;

public class Food {
     int x;
     int y;
	public Food(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void placeFood(int boarWidth, int boarHeight, int tileSize) {
		Random random = new Random();
		x = random.nextInt((boarWidth / tileSize) -2)+1;
		y = random.nextInt((boarHeight / tileSize) -2)+1;
	}
     
}

