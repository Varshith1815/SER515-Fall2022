import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Facade {

	private int UserType;

	private int ProductMenu;

	private Product theSelectedProduct;

	private int nProductCategory;

	ClassProductList theProductList;

	NodeVisitor visitor;

	private Person thePerson;

	private UserInfoItem userInfoItem;

	private Login login;

	public void initializeFacade()
	{
		System.out.println("\nInitializing Facade Pattern");
		UserType=login(new Login());
		System.out.println("\nImplementing Bridge Pattern \n");
		System.out.println("Select a Product Menu: \n Enter 1 for Meat Product Menu \n Enter 2 for Produce Product Menu");
		Scanner sc1= new Scanner(System.in);
		ProductMenu= Integer.parseInt(sc1.next());
		List<String> menuList= new ArrayList<>();
		if(UserType==0) {
			if(ProductMenu==1) {
				Person meat = new Buyer(new MeatProductMenu());
				menuList=meat.showMenu();
			}
			else if (ProductMenu==2){
				Person produce = new Buyer(new ProduceProductMenu());
				menuList=produce.showMenu();
			}
			else{
				System.out.println("Select a Valid Product Menu");
				System.exit(-1);
			}
		}
		else {
			System.out.println("seller's Product Information: \n");
			if(ProductMenu==1) {
				Person meat = new Seller(new MeatProductMenu());
				menuList=meat.showMenu();
			}
			else if (ProductMenu==2){
				Person produce = new Seller(new ProduceProductMenu());
				menuList=produce.showMenu();
			}
			else{
				System.out.println("Select a Valid Product Menu");
				System.exit(-1);
			}
		}
		System.out.println("Implementing Iterator Pattern to display the selected menu List \n");
		Iterator itr= menuList.iterator();
		ProductIterator prodItr= new ProductIterator();
		while(itr.hasNext())
		{
			System.out.println(prodItr.Next(itr));
		}
		if (UserType==1) {
			System.out.println("\nImplementing Visitor Pattern to notify Buyers when a product is expired by the seller");
			System.out.println("\nEnter a Product to be Expired from the above menu:");
			Scanner inputItem = new Scanner(System.in);
			String item = inputItem.nextLine();
			remind(item);
			inputItem.close();
		}
		else{
			System.out.println("\nImplementing Visitor Pattern to notify Seller about a bid from the Buyer");
			System.out.println("\nEnter an Item to Bid from the above menu:");
			Scanner inputItem = new Scanner(System.in);
			String item = inputItem.nextLine();
			remindSeller(item);
			inputItem.close();
		}
		sc1.close();
	}

	public int login(Login log) {
		return log.user();
	}

	public void remind(String str) {
		ReminderVisitor rem = new ReminderVisitor();
		ClassProductList prodList= new ClassProductList(str);
		prodList.accept(rem);
	}

	public void remindSeller(String str) {
		ReminderVisitor rem = new ReminderVisitor();
		Trading trade= new Trading(str);
		trade.accept(rem);
	}
	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}


	public void createUser(UserInfoItem userInfoItem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void productOperation() {

	}

}
