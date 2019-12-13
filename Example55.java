class car{
// 数据成员(也可称为成员属性)
public String Name;
public char Color;
protected int Style;
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
public class Example55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //创建car类的两个对象car1和car2
		car car1 = new car();
		car car2 = new car();
		//对象的数据成员的使用
		car1.Name = "car1";
		car1.Color = 'R';
		car1.Style = 1;
		car2.Name = "car2";
		car2.Color = 'B';
		car2.Style = 2;
		//对象的成员方法的调用
		System.out.println("Color of car1: "+car1.getColor());
		System.out.println("Style of car2: "+car2.getStyle());
	}
}
