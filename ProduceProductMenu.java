import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	public List<String> showMenu() {
		System.out.println("\nImplementing Factory Pattern to return the desired menu Items\n");
		String input="ProductInfo.txt";
		List<String> produceProd= new ArrayList<>();
		try {
			File inputFile = new File(input);
			Scanner s = new Scanner(inputFile);
			while(s.hasNextLine()) {
				String prod = s.nextLine();
				if (prod.contains("Produce")) {
					produceProd.add(prod);
				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		return produceProd;
	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
