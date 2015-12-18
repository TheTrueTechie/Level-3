import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SantaList {
	JFrame mainFrame = new JFrame(); 
	
	
	
	String mansionLink = "http://o.homedsgn.com/wp-content/uploads/2014/05/Modern-Mansion-on-Sunset-Plaza-Drive-06.jpg";
	String lamborghiniLink = "http://zombdrive.com/images/lamborghini-6.jpg";
	String dogLink = "http://www.hdwallpaper.nu/wp-content/uploads/2015/03/Long-Haired-Golden-Retriever.jpg"; 
	ArrayList<JLabel>gifts = new ArrayList<JLabel>();
	
	public static void main(String[] args) {
			
	}
	
	public void run() {
gifts.add(loadImageFromTheInternet(mansionLink));
gifts.add(loadImageFromTheInternet(lamborghiniLink));	
gifts.add(loadImageFromTheInternet(dogLink));	
	}
	
	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}