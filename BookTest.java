package BitPractice;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book("嘻游记","fdc",250,"fdc");
		Book book2 = new Book("游记","ljx",520,"ljx");
		book1.AddAuthor("ljx");
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book1.getDiscount(0.5));
		System.out.println(book2.getDiscount(2));
	}
}
