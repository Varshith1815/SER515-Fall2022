import java.util.List;

public class Seller extends Person {

	protected Seller(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	public List<String> showMenu() {
		return theProductMenu.showMenu();
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
