public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public void visitProduct(ClassProductList product) {
		System.out.println("\nExpired Product: " + product.str);
		System.out.println("\nBuyers got Notified that " +product.str+" Has been Sold out");
	}

	public void visitTrading(Trading trading) {
        System.out.println("\nItem Bidded: " +trading.str);
		System.out.println("\nSeller Notified about the Bid for: " +trading.str);
	}

	public void visitFacade(Facade facade) {

	}

}
