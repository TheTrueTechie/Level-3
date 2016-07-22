import java.util.Random;

public class SnakesOnAPlane2 {

}

class Randomness {
	public boolean ranTru() {
		Random r = new Random();

		return r.nextBoolean();

	}

	public int ranNum() {
		Random f = new Random();

		return f.nextInt(9) + 1;
	}
}

class Snake {
	int viciousness = 0;
	boolean venomous = false;
	
	Snake() {
		
	}
}

class Plane {
	
	
	int nunberOfPassengers = 0;
	
	
}