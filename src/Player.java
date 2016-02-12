import java.util.Comparator;

public class Player {
	private String name;
	public int kills;
	private int deaths;
	private int ping;

	
	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	Player(String name) {
		this.name = name;
	}

public void Shoot(Player skrub) {
		this.kills+=1; 
		skrub.Die();
	
	}
	public void Die() {
		this.deaths+=1;
	}
	public int Score() {
		return kills; 
	}
	
	public String getName() {
		return name;
		
	}
	
	
}

