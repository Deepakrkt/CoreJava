package encapsulation.in;

class ShoppingCartEntry{
	public float price;
	public float quantity;
}
class ShoppingCart {
	public ShoppingCartEntry[] item;
}
class Order{
	private ShoppingCart cart;
	private float salesTax;
	
	public Order(ShoppingCart cart, float salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
	}
	// This method know the internal details of ShoppingCartEntry and
	// Shoppingcart classes if there is any change in any of those
	//classes,this method also needs to change.
//	public float orderTotalPrice() {
//		float cartTotalPrice = 0;
//		for(int i = 0; i < cart.item.length; i++) {
//			
//		}
//	}
	
}

public class Coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}



// coupling is a mesaure of how much a class is dependent on other classes.
//There should minimal dependencies between classes.