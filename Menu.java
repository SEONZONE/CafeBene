package CafeBene;
public class Menu {

	// Variable
	private String name; // 메뉴명
	private int price; // 가격

	// Constructor
	public Menu() {

	}

	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printInfo() {
		System.out.print("메뉴=[" + name + "]");
		System.out.println(" 가격=[" + price + "]");
		
	}

}