package BitPractice;

public class MyTime{
	private int hour;
	private int minute;
	private int second;
	public MyTime(int hour,int minute,int second){
		if(hour < 0 || hour > 23){
			System.out.println("超范围的小时");
		    return;
		}
		if(minute < 0 || minute > 59){
			System.out.println("超范围的分钟");
			return;
		}
		if(second < 0 || second >59){
			System.out.println("超范围的秒数");
			return;
		}
		 
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public void add(int seconds){
		if (seconds < 0) {
			System.out.println("请使用 sub");
			return;
		}
		
		second += seconds;
		while(second > 59){
			second -= 60;
			minute += 1;
			if(minute > 59){
				minute -= 60;
				hour += 1;
			}
		}
	}
	public void sub(int seconds){
		second -= seconds;
		while(second < 0){
			minute -= 1;
			second += 60;
			if(minute < 0){
				minute += 60;
				hour -= 1;
			}
		}
	}
	public static void main(String[] args) {
		MyTime time = new MyTime(18, 15, 10);
		System.out.println(time);
		time.add(50);		
		System.out.println(time);
		time.sub(70);		
		System.out.println(time);
	}
}

