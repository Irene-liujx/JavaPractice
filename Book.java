package BitPractice;

public class Book {
	
	//属性
	private String name;
	private String author;
	private double price;
	private String publisher;
	
	//构造方法
	Book(String name,String author,double price,String publisher){
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		
	}
	
	 //getter
	String getName() {
		return name;
	}
	String getAuthor() {
		return author;
	}
	double getPrice() {
		return price;
	}
	String getPublisher() {
		return publisher;
	}
	
	//setter
	void setName(String name) {
		this.name = name;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	
	//普通方法
	void AddAuthor(String author) {
		this.author = this.author + " " + author;
	}
	double getDiscount(double discount) {
		return this.price*discount;
	}
	
	//覆写一个方法
	@Override 
	public String toString() {
		return String.format("<<%s>> by %s", name,author);
	}

}
