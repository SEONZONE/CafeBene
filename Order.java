package CafeBene;

import java.util.ArrayList;

import CafeBene.Menu;

public class Order extends Menu  {
	int orderNum;
	int total;
	
	
	ArrayList<Menu> menuList = new ArrayList<Menu>();
	public Order(ArrayList<Menu> menuList) {
		this.menuList = menuList;

	}
	
	

	
	public void printOrderMenuListTotalSizePrice() {
		
		int total = 0;
		for(int i=0; i<menuList.size(); i++) {
			Menu menu = menuList.get(i);
			total = menu.getPrice() + total;

		}
		System.out.print("주문건수=[" + menuList.size() + "]");
		System.out.print(" 총 합계=[" + total + "] ");	
	}
	
	

}
