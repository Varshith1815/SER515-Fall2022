public class Seller extends Person {

	protected Seller(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	public void showMenu() {
		theProductMenu.showMenu();
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
