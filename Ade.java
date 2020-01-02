package CafeBene;



public class Ade extends Menu {
	String material;
	
	public Ade(String name,int price,String material) {
		super(name,price);
		this.material = material;
	}
	
	public void printInfo() {
		System.out.print("메뉴=[" + getName() + "]");
		System.out.print(" 가격=[" + getPrice() + "] ");
		System.out.println("재료=[" + material + "]");
		
	}

}
