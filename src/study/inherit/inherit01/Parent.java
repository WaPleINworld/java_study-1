package study.inherit.inherit01;

public class Parent {

	protected int money;
	//public private default
	//public int money;

	public Parent(int money) {
		this.money = money;
		System.out.println("Parent() 생성자");
	}

	public void say() {
		System.out.println("parent saying");
	}
}
