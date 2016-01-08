import java.util.Random;

public class SnakesOnAPlane {
	int viciousness;
	boolean venomous;
	public static void main(String[] args) {
		
	}

	SnakesOnAPlane(int viciousness, boolean venomous) {
		this.viciousness = viciousness;
		this.venomous = venomous;
	}

	public int getViciousness() {
		return viciousness;
	}

	public void setViciousness(int viciousness) {
		this.viciousness = viciousness;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}

}
