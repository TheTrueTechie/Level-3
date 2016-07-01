
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AddViewHashMap implements ActionListener {
	HashMap<String, Integer> c = new HashMap<String, Integer>();

	public JFrame mainFrame = new JFrame();
	public JPanel mainPanel = new JPanel();
	public JButton Button1 = new JButton();
	public JButton Button2 = new JButton();

	public static void main(String[] args) {
		AddViewHashMap a = new AddViewHashMap();
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

		mainFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (Button1 == e.getSource()) {
		String  a =	JOptionPane.showInputDialog("Add to HashMap");
	int z = 	Integer.parseInt(a);
			c.put(a, z);
		}
		if (Button2 == e.getSource()) {
			
			String h = null;
			for (String s : c.keySet()) {
				h=s;
			}
			int f = 0;
			for (Integer i : c.values()) {
				f=i;
			}
			JOptionPane.showMessageDialog(null, h + " " + f);
		}
	}
}
