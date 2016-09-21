import java.util.ArrayList;

public class Trip {
	public ArrayList<Flight> Flights = new ArrayList<Flight>();

	public Flight add(Flight f) {

		Flights.add(f);

		return f;
	}

	public Object getNumberOfFlights() {

		return Flights.size();
	}

	public void clear() {

		Flights.clear();

		return;

	}

	public int getDuration() {

		Time depTime = null;
		Time arrivTime = null;

		int durTime = 0;

		for (Flight flight2 : Flights) {
			depTime = flight2.getDepartureTime();
			arrivTime = flight2.getArrivalTime();

			durTime += depTime.minutesUntil(arrivTime);

		}

		System.out.println(durTime);

		return durTime;
	}

	public Object getShortestLayover() {
		
		Time arrivTime = null;	
		Time depTime = null;
	
		int shortLay = Integer.MAX_VALUE;
		
		for (int i = 0; i < Flights.size() - 1; i++) {
			Flight a1 = Flights.get(i); 
			Time b1 = a1.getArrivalTime(); 
			
			Flight a2 = Flights.get(i+1); 
			Time b2 = a2.getDepartureTime(); 
			
			
			if (shortLay>b1.minutesUntil(b2)) {
				shortLay = b1.minutesUntil(b2);  
			}
		}
		
		
//		for (Flight flight : Flights) {
//			arrivTime = flight.getArrivalTime(); 
//			
//			
//			
//			
//			shortLay = arrivTime.minutesUntil(depTime);
//			
//			depTime = flight.getDepartureTime(); 
//			
//			System.out.println(shortLay);
//			
//		}
		
		
		
		
		

		return shortLay;
	}

}
