import java.util.List;

public interface ProductMenu {

	Person person = null;

	public abstract List<String> showMenu();

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();

}
