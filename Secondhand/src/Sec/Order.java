package Sec;

public class Order {
	
	private String name;
	private String condition;
	private int price;
	private int qty;
	private int sum;
		
	
	public Order(String name, String condition, int price, int qty) {
		super();
		this.name = name;
		this.condition = condition;
		this.price = price;
		this.qty = qty;
		sum=price*qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getSum() {
		return sum;
	}
	void show()
	{
		System.out.println("產品名:"+this.name+"\t新舊程度:"+this.condition+"\t價格:"+price+"\t數量:"+qty+"\t總額:"+sum);
	}
	
}
