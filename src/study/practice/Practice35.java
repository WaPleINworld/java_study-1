package study.practice;

//Base코드
public class Practice35 {

	public static void main(String[] args) {

		//주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);

		//메뉴를 조합하여 주문을 생성
		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		Order order = new Order(123, menuArr);

		//주문 결과 출력
		System.out.printf("[주문번호 %d] 주문 합계: %d원\n", order.orderNum, order.totalPrice());
	}




}
class Order {

	//필드(인스턴스 필드)
	int orderNum;
	Menu[] menus;

	//생성자
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}


	//메소드(인스턴스 메소드)
	public int totalPrice() {
		int total = 0;
		
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		for(int i=0; i<menus.length; i++) {
			total += menus[i].price;
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
