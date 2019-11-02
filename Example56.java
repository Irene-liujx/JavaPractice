package Practice;

class CAR{
	//数据成员
	public String Name;
	public char Color;
	protected int Style;
	public CAR(String Name1,char Color1,int Style1) {
		//若在car前加上返回类型（包括void）就会出错，因为构造方法不能有返回类型
		Name = Name1;
		Color = Color1;
		Style = Style1;
	}
	//成员方法
	public String getName() {
		return Name;
	}
	public char getColor() {
		return Color;
	}
	public int getStyle() {
		return Style;
	}
}
public class Example56 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
       //创建car类的两个对象car1和car2
	CAR car1 = new CAR("car1",'R',1);
		CAR car2 = new CAR("car2",'B',2);
		//对象的数据成员的使用
		car1.Name = "car1";
		car1.Color = 'R';
		car1.Style = 1;
		car2.Name = "car2";
		car2.Color = 'B';
		car2.Style = 2;
		//对象的成员方法的调用
		System.out.println("Style of car1: "+car1.getStyle());
		System.out.println("Color of car2: "+car2.getColor());
	}
}

