package BitPractice;
//访问限定符---够用就行
public class Bike{
	//属性
		private String color;      //颜色
	    private	int speed;        //当前速度
		private int max_speed;    //最高速度
		
		//构造方法
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
		
   // 方法
   //setter
		void setColor(String c) {
			this.color = c;
		//	System.out.println("颜色为 "+ color);
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


