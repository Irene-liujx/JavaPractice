class car{
// ���ݳ�Ա(Ҳ�ɳ�Ϊ��Ա����)
public String Name;
public char Color;
protected int Style;
//��Ա����
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
        //����car�����������car1��car2
		car car1 = new car();
		car car2 = new car();
		//��������ݳ�Ա��ʹ��
		car1.Name = "car1";
		car1.Color = 'R';
		car1.Style = 1;
		car2.Name = "car2";
		car2.Color = 'B';
		car2.Style = 2;
		//����ĳ�Ա�����ĵ���
		System.out.println("Color of car1: "+car1.getColor());
		System.out.println("Style of car2: "+car2.getStyle());
	}
}
