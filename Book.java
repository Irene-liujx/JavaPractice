package BitPractice;

public class Book {
	
	//����
	private String name;
	private String author;
	private double price;
	private String publisher;
	
	//���췽��
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
	
	//��ͨ����
	void AddAuthor(String author) {
		this.author = this.author + " " + author;
	}
	double getDiscount(double discount) {
		return this.price*discount;
	}
	
	//��дһ������
	@Override 
	public String toString() {
		return String.format("<<%s>> by %s", name,author);
	}

}
