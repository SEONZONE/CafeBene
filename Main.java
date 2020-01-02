package CafeBene;
import java.util.ArrayList;
import CafeBene.Order;


public class Main  {

	public static void main(String[] args) {

		// Menu
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		menuList.add(new Coffee("아메리카노", 3000, "에티오피아 예가체프"));
		menuList.add(new Coffee("카푸치노", 3500, "케냐 오클랜드"));
		menuList.add(new Ade("레몬에이드", 4000, "레몬,시럽"));
		
		for(int i=0; i <menuList.size(); i ++) {
			menuList.get(i).printInfo();
		}
		
   
		Order order1 = new Order(menuList);
		order1.printOrderMenuListTotalSizePrice();
	}

}
