public class ClassProductList {

	String str;
	private ReminderVisitor reminderVisitor;

	Product product;

	private ProductIterator productIterator;

	public ClassProductList(String str) {
		this.str=str;
	}

	public void accept(NodeVisitor visitor) {
		visitor.visitProduct(this);
	}


}
