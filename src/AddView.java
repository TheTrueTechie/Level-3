import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AddView implements ActionListener {

	public ArrayList<String> addViewList = new ArrayList<String>();

	public JFrame mainFrame = new JFrame();
	public JPanel mainPanel = new JPanel();
	public JButton Button1 = new JButton();
	public JButton Button2 = new JButton();

	public static void main(String[] args) {

		AddView a = new AddView();
		a.startCode();

	}

	private void startCode() {
		mainFrame.add(mainPanel);
		mainPanel.add(Button1);
		mainPanel.add(Button2);

		Button1.setText("Add");
		Button2.setText("View");

		Button1.addActionListener(this);
		Button2.addActionListener(this);

		mainFrame.setSize(250, 250);
		mainFrame.setTitle("AddView");
		mainFrame.setVisible(true);

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (Button1 == e.getSource()) {
			String storage1 = JOptionPane.showInputDialog("Enter a word");
			addViewList.add(storage1);
		}

		if (Button2 == e.getSource()) {
			String a = "";

			for (String string : addViewList) {	
				a += string + " ßß";

			}

			JOptionPane.showMessageDialog(null, "This is what you typed " + a);

		}
	}

}
