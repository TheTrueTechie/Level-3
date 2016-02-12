import java.util.ArrayList;

public class BO3Server {
	public static void main(String[] args) {
		ArrayList<Game>Games= new ArrayList<Game>(); 
		Player Shiva = new Player("Shiva"); 
		Player ColedaSkrub = new Player("ColedaSkrub");
		Player JackdaSkrub = new Player("JackdaSkrubAtHalfLife");
		Player JamesdaSkrub = new Player("JamesdaSkrub");

		Game game = new Game("nuketown", 25);
		game.Add(Shiva, ColedaSkrub, JackdaSkrub);
		game.play();
		System.out.println("MLG Winner - Shiva has " + Shiva.getKills());
		System.out.println("MLG Loser - ColedaSkrub has " + ColedaSkrub.getKills());
		System.out.println("MLG Half Life = JackdaSkrubAtHalfLife has " + JackdaSkrub.getKills());
		
		System.out.println(game.getRanking());
		for (Player p : game.getRanking()) {
			System.out.println(p.getName() + " got a score of " + p.getKills() + " (ง'̀-'́)ง");
		}
	}
	
}

