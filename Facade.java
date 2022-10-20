import java.util.Scanner;

public class Facade {

	private int UserType;

	private int ProductMenu;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	private UserInfoItem userInfoItem;

	private Login login;

	public void initializeFacade()
	{
		System.out.println("Initializing Facade Pattern \n");
		UserType=login(new Login());
		System.out.println("Implementing Bridge and Factory Pattern \n");
		System.out.println("Select a Product Menu: \n 1.Meat Product Menu 2.Produce Product Menu");
		Scanner sc1= new Scanner(System.in);
		ProductMenu= Integer.parseInt(sc1.next());
		if(UserType==0) {
			if(ProductMenu==1) {
				Person meat = new Buyer(new MeatProductMenu());
				meat.showMenu();
			}
			else if (ProductMenu==2){
				Person produce = new Buyer(new ProduceProductMenu());
				produce.showMenu();
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
				meat.showMenu();
			}
			else if (ProductMenu==2){
				Person produce = new Seller(new ProduceProductMenu());
				produce.showMenu();
			}
			else{
				System.out.println("Select a Valid Product Menu");
				System.exit(-1);
			}
		}
	}

	public int login(Login log) {
		return log.user();
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

	public void remind() {

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
