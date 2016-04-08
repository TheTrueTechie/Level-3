import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman implements KeyListener {
	 Stack<String> hangmanStack = new Stack<String>();
	 ArrayList<JLabel> labels = new ArrayList<JLabel>();
	 
	public JFrame mainFrame = new JFrame();
	public JPanel mainPanel = new JPanel();
	//public JLabel Label1 = new JLabel();

	private String TITLE = "Hangman";
	private String currentPuzzle;
	private int HEIGHT = 800;
	private int WIDTH = 1000;

	public static void main(String[] args) {
		Hangman a = new Hangman();
		a.addPuzzles();
		a.createUI();
		a.currentPuzzle = a.hangmanStack.pop();
		a.playPuzzle();
	}

	private void playPuzzle() {
	
		for (char s : currentPuzzle.toCharArray()) {
			JLabel label2 = new JLabel();
			label2.setText("_");
			labels.add(label2);
			mainPanel.add(label2);
		}
		
	}

	public void createUI() {

		mainFrame.add(mainPanel);

		mainFrame.setTitle(TITLE);
		mainFrame.setSize(WIDTH, HEIGHT);

	//	mainPanel.add(Label1);

		mainFrame.addKeyListener(this);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
for (int i = 0; i < currentPuzzle.length(); i++) {
	
}
	if (a==e.getKeyChar()) {
		
	}
	
	
}

		

	

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	public void addPuzzles() {
		hangmanStack.push("Correct");
		hangmanStack.push("Armitron");

	}

	public void stopshowingPuzzle() {

	}

}