package Practice;

class CAR{
	//���ݳ�Ա
	public String Name;
	public char Color;
	protected int Style;
	public CAR(String Name1,char Color1,int Style1) {
		//����carǰ���Ϸ������ͣ�����void���ͻ������Ϊ���췽�������з�������
		Name = Name1;
		Color = Color1;
		Style = Style1;
	}
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
public class Example56 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
       //����car�����������car1��car2
	CAR car1 = new CAR("car1",'R',1);
		CAR car2 = new CAR("car2",'B',2);
		//��������ݳ�Ա��ʹ��
		car1.Name = "car1";
		car1.Color = 'R';
		car1.Style = 1;
		car2.Name = "car2";
		car2.Color = 'B';
		car2.Style = 2;
		//����ĳ�Ա�����ĵ���
		System.out.println("Style of car1: "+car1.getStyle());
		System.out.println("Color of car2: "+car2.getColor());
	}
}

