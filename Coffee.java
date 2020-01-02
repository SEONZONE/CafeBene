package CafeBene;

public class Coffee extends Menu {
	String bean;
	
	public Coffee(String name,int price,String bean)
	{
        super(name,price);
		this.bean = bean;
		
	}
	
	public void printInfo() {
		System.out.print("메뉴=[" + getName() + "]");
		System.out.print(" 가격=[" + getPrice() + "] ");
		System.out.println("원두=[" + bean + "]");
		
	}
	
	
	

}
