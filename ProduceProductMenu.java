import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProduceProductMenu implements ProductMenu {

	public void showMenu() {
		String input="ProductInfo.txt";
		List<String> meatProd= new ArrayList<>();
		try {
			File inputFile = new File(input);
			Scanner s = new Scanner(inputFile);
			while(s.hasNextLine()) {
				String prod = s.nextLine();
				if (prod.contains("Produce")) {
					meatProd.add(prod);
				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		for(String str: meatProd)
		{
			System.out.println(str);
		}
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
