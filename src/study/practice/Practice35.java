package study.practice;
import java.util.HashMap;
//Base코드
public class Practice35 {

	public static void main(String[] args) {

		//주문을 위한 메뉴 선정
		 HashMap<String, Integer> menuMap = new HashMap<>();
	        menuMap.put("짜장", 4900);
	        menuMap.put("짬뽕", 5900);
	        menuMap.put("탕수육", 13900);

		//메뉴를 조합하여 주문을 생성
		Order order = new Order(123, menuMap);

		//주문 결과 출력
		System.out.printf("[주문번호 %d]주문 합계: %d원\n",order.orderNum, order.totalPrice());
	}




}
class Order {

	//필드(인스턴스 필드)
	int orderNum;
	HashMap<String,Integer> menus;

	//생성자
	public Order(int i, HashMap<String, Integer> menus) {
		orderNum = i;
		this.menus = menus;
	}


	//메소드(인스턴스 메소드)
	public int totalPrice() {
		int total = 0;
		
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		for (int price : menus.values()) {
            total += price;
        }
		
		return total;
	}
}




class Menu {

	//필드
	String name;
	int price;

	//생성자
	public Menu(String str, int i) {
		name = str;
		price = i;
	}


}
