public class Buyer extends Person {

	protected Buyer(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	public void showMenu() {
		theProductMenu.showMenu();
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
