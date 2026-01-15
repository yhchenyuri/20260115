package Sec;

public class Test {

	public static void main(String[] args) {
		Order o=new Order("123","brand-new",800,2);
		o.show();
		o.setCondition("vintage");
		o.show();
		
	}

}
