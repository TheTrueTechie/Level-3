import java.util.ArrayList;

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

}
