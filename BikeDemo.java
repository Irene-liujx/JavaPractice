package BitPractice;

public class BikeDemo {
	public static void main(String[] args) {
		Bike bike = new Bike();
		System.out.println("�ճ�ʼ��");
		System.out.println(bike.getColor());
		System.out.println(bike.getSpeed());
		
		bike.setColor("��ɫ");
		System.out.println("Ϳ�����");
		System.out.println(bike.getColor());
		
		System.out.println("���� : ");
		for(int i = 0;i < 20;i++) {
			bike.SpeedUp();
			System.out.println(bike.getSpeed());
		}
		
		System.out.println("���� : ");
		for(int i = 0;i < 20;i++) {
			bike.SpeedDown();
			System.out.println(bike.getSpeed());
		}
	}
}