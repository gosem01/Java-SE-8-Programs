package my.testing;
import my.domain.Order;
import my.utils.MyDate;

public class TestOrders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDate date1 = new MyDate(1,20,2008);
		Order anvil = new Order(date1, 2000.00, "Wile E Coyote", "Anvil", 10);

		MyDate date2 = new MyDate(4,10,2008);
		Order balloons = new Order(date2, 1000.00, "Bugs Bunny", "Balloon", 125);

		System.out.println(anvil);
		System.out.println(balloons);

		System.out.println("The tax Rate is currently: " + Order.taxRate);
		Order.computeTaxOnAmount(3000.00);
		anvil.computeTax();
		balloons.computeTax();

		Order.setTaxRate(0.06);
		System.out.println("The tax Rate is currently: " + Order.taxRate);
		Order.computeTaxOnAmount(3000.00);
		anvil.computeTax();
		balloons.computeTax();
		

		//testing the this constructor code
		MyDate date3 = new MyDate(5, 20, 2008);
		Order anotherAnvil = new Order(date3, 200, "Road Runner");
		System.out.println(anotherAnvil);
	}

}
