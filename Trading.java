public class Trading {

	String str;
	private Product product;

	private OfferingList offeringList;

	public Trading(String str) {
		this.str=str;
	}

	public void accept(NodeVisitor visitor) {
		visitor.visitTrading(this);
	}

}
