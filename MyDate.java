package BitPractice;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	private final int[] Day_Of_Month = {
		31, 28, 31, 30, 31, 30,
		31, 31, 30, 31, 30, 31
	};
	
	private boolean isLeapYear(int year) {
		if(year % 400 == 0) {
			return true;
		}
		if(year % 4 == 0 && year % 100 != 0) {
			return true;
		}
		return false;
	}
	
	private int getDayOfMonth(int year,int month) {
		if(month != 2) {
			return Day_Of_Month[month - 1];
		}
		if(isLeapYear(year)) {
			return 29;
		}else {
			return 28;
		}
	}
	
	public MyDate(int year,int month,int day) {
		if(year < 1970 || year >2030) {
			System.out.println("不合法的年份输入");
			return;
		}
		if(month < 0 || month > 12) {
			System.out.println("不合法的月份输入");
			return;
		}
		if(day < 0 || day > getDayOfMonth(year,month)) {
			System.out.println("不合法的天数输入");
			return;
		}
	
	this.year = year;
	this.month = month;
	this.day = day;
}

	@Override
	public String toString() {
		return String.format("%04d-%02d-%02d", year, month, day);
	}
	
	//在当前对象上添加多少天
	public void add(int days) {
		if(days < 0) {
			System.out.println("请使用sub");
			return;
		}
		day += days;
		while(day > getDayOfMonth(year,month)) {
			day -= getDayOfMonth(year,month);
			month += 1;
			if(month > 12) {
				year += 1;
				month = 1;
			}
		}
	}
	
	//在当前对象上退后多少天
	public void sub(int days) {
		day -= days;
		while(day <= 0) {
			month -= 1;
			if(month == 0) {
				year -= 1;
				month = 12;
			}
			day += getDayOfMonth(year,month);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new MyDate(2019,11,10);
		System.out.println(date);
		date.add(89);
		System.out.println(date);
		date.sub(96);
		System.out.println(date);
	}

}
