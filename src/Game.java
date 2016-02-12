import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Game {
	String map;
	int maxKills;
	ArrayList<Player> Players;
	Random r = new Random();
	

	Game(String map, int maxKills) {
		this.map = map;
		this.maxKills = maxKills;
		Players = new ArrayList<Player>(); 
	}

	public void Add(Player...skrub) {

		for (Player player : skrub) {
		 Players.add(player); 
		}
	}

	boolean isOver() {
		for (Player player : Players) {
			if (player.getKills() >= maxKills) {
				return true;

			}
		}
		return false;

	}

	public void play() {
		while (!isOver()) {
			int a = r.nextInt(Players.size());
			int b = r.nextInt(Players.size());
			Player player1 = Players.get(a);
			Player player2 = Players.get(b);

			if (player1.equals(player2)) {
				continue;
				
			}
			
			
			player1.Shoot(player2);
			System.out.println(player1.getName() + " ︻デ┳═ー " + player2.getName());
		
		
		}
		
	}
	
	public Player getWinner() {
		int maxScore = 0;
		Player player = null;
		for (Player p : Players) {
		if(p.getKills()>maxScore) {
			maxScore=p.getKills();
			player=p;
		}
		}
		return player;
	}
	public class Pcomp implements Comparator<Player> {

		@Override
		public int compare(Player o1, Player o2) {
			// TODO Auto-generated method stub
			return o1.Score()-o2.Score();
		}
		
	}
	
public ArrayList<Player> getRanking() {
	Players.sort(new Pcomp());
	return Players; 
}
	
}


