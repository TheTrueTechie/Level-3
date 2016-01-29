import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CDPlayer {
	public static void main(String[] args) {
		ArrayList<Song> CD = new ArrayList<Song>();
		CD.add(new Song("Goodbye", 60));
		CD.add(new Song("Adios", 59));
		CD.add(new Song("Ploopy's Mixtape", 999999999));
		System.out.println(getDuraction(CD));
	}

	public static int getDuraction(ArrayList<Song> CD) {
		int totalLength = 0;

		for (Song song : CD) {
			totalLength = totalLength + song.getTime();
		}
		return totalLength;
	}

}
