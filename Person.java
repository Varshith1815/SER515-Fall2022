import java.util.List;

public abstract class Person {

	protected ProductMenu theProductMenu;

	protected Person(ProductMenu theProductMenu) {
		this.theProductMenu = theProductMenu;
	}


	public void showAddButton() {

	}

	public abstract List<String> showMenu();

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
