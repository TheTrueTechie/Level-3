import java.util.ArrayList;

public class DuckQuiz {
	public static void main(String[] args) {
		ArrayList <Duck> Ducks = new  ArrayList <Duck>(); 
		Ducks.add(new Duck("Daffy"));
		Ducks.add(new Duck("Waddles"));	
	


Ducks.get(0).feed();
for (Duck duck : Ducks) {
	duck.feed();
	System.out.println("The ducks have been fed. They will now be murdered to become vegerterian chicken.");
}
	}	
}
	

