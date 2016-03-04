import java.util.ArrayList;
import java.util.Iterator;

public class MasterOrder {
	ArrayList<CookieOrder> Orders = new ArrayList<CookieOrder>();

	public ArrayList<CookieOrder> getOrders() {
		return Orders;
	}

	public void setOrders(ArrayList<CookieOrder> orders) {
		Orders = orders;
	}

	MasterOrder() {
		Orders = new ArrayList();

	}

	public void addOrder(CookieOrder cookieOrder) {
		Orders.add(cookieOrder);

	}

	public int getTotalBoxes() {
		int numOrder = 0;
		for (CookieOrder cookieOrder : Orders) {
			numOrder += cookieOrder.getNumBoxes();
		}
		return numOrder;
	}

public int removeVariety(String string) {
	int RemovedBoxes = 0; 
		Orders.iterator();
		Iterator<CookieOrder> bob = Orders.iterator();
		while (bob.hasNext()) {
			CookieOrder test = bob.next();
			if (test.getVariety().equals(string)) {
				RemovedBoxes += test.numBoxes;
				bob.remove();
			}
			
		}
		return RemovedBoxes; 
	}



}


