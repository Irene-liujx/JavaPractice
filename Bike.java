package BitPractice;
//�����޶���---���þ���
public class Bike{
	//����
		private String color;      //��ɫ
	    private	int speed;        //��ǰ�ٶ�
		private int max_speed;    //����ٶ�
		
		//���췽��
		Bike(){
			color = "black";
			speed = 0;
			max_speed = 200;
		}

		Bike(String color){
			color = color;
			speed = 0;
			max_speed = 200;
		}
		
   // ����
   //setter
		void setColor(String c) {
			this.color = c;
		//	System.out.println("��ɫΪ "+ color);
		}
		
	    void SpeedUp() {
			speed += 10;
			if(speed > max_speed) {
				speed = max_speed;
		    }
		}
	    
		void SpeedDown() {
			speed -= 10;
			if(speed < 0) {
				speed = 0;
			}
		}
		
		//getter
		String getColor() {
			return color;
		}
		int getSpeed() {
			return speed;
		}
}


