import java.util.HashMap;

public class GameOptions {
 static HashMap<String, String> options= new HashMap <String, String>();
	
 public static void main(String[] args) {
	 addOption("Gaben", "Lazy");
	 addOption("DJ", "IRS");
	 addOption("Jack", "Half Life");
	 
	System.out.println(getOption("BadDJ").equals("IRS"));
}
 
 public static void addOption(String key, String value) {
	options.put(key, value);
 }
 
 public static String getOption(String key) {
	 return options.get(key);
 }
}
