package BitPractice;

public class BikeDemo {
	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println("刚初始化");
		System.out.println(bike.getColor());
		System.out.println(bike.getSpeed());
		
		bike.setColor("粉色");
		System.out.println("涂完漆后");
		System.out.println(bike.getColor());
		
		System.out.println("下坡 : ");
		for(int i = 0;i < 20;i++) {
			bike.SpeedUp();
			System.out.println(bike.getSpeed());
		}
		
		System.out.println("上坡 : ");
		for(int i = 0;i < 20;i++) {
			bike.SpeedDown();
			System.out.println(bike.getSpeed());
		}
	}
}