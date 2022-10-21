import java.util.List;

public class Buyer extends Person {

	protected Buyer(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	public List<String> showMenu() {
		return theProductMenu.showMenu();
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
