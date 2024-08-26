import java.util.ArrayList;
import java.util.List;

//-----ORDER MANAGER-----
public class OrderManager {  
	private static final OrderManager instance = new OrderManager();
	private OrderManager(){
		this.orders = new ArrayList<>();
		}
	public static OrderManager getInstance(){
      return instance;
   } 
    private final List<Order> orders;
    Shop shop = new Shop();
    int orderCounter = Shop.orderCounter;
 
    // Add order to list
    public void addOrder(Order order) {
        this.orders.add(order);
        orderCounter++;
    }
    // Deleting order from list
    public void deleteOrder(Order order) {
        this.orders.remove(order);
        orderCounter--;
    }
    // Displaying all orders
    public void displayAllOrders() {
        System.out.println("All Orders:");
        for (Order order : orders) {
            order.displayOrder();
            System.out.println(); // Dodaje odstęp między zamówieniami
        }
    }
}