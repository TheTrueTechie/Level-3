import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hangman implements KeyListener {
	Stack<String> hangmanStack = new Stack<String>();

	public JFrame mainFrame = new JFrame();
	public JPanel mainPanel = new JPanel();
	public JLabel Label1 = new JLabel();

	private String TITLE = "Hangman";
	private String currentPuzzle;
	private int HEIGHT = 400;
	private int WIDTH = 200;

	public static void main(String[] args) {
		Hangman a = new Hangman();
		a.addPuzzles();
		a.createUI();

	}

	public void createUI() {

		mainFrame.add(mainPanel);

		mainFrame.setTitle(TITLE);
		mainFrame.setSize(WIDTH, HEIGHT);

		mainPanel.add(Label1);

		mainFrame.addKeyListener(this);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.keyTyped(null);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		String a = ""; 
		currentPuzzle = hangmanStack.pop();
		for (int i = 0; i < currentPuzzle.length(); i++) {
			a += "-";
			System.out.println(i);
			
		}
		Label1.setText(a);

		

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