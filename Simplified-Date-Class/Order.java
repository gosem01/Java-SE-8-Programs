public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	static double taxRate;

	static {
		taxRate = 0.05;
	}
	
	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}

	public Order (MyDate d, double amt, String c) {
		this(d, amt, c, "Anvil", 1);
	}
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}

	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}

	public static void computeTaxOnAmount(double someAmount) {
		System.out.println("The tax for " + someAmount + " is: " + someAmount * Order.taxRate);
	}

	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}
}