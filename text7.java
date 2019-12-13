package Practice;

import java.util.Scanner;

public class text7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入字符串: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String E1 = "[\u4e00-\u9fa5]";
		String E2 = "[a-zA-Z]";
		String E3 = "[0-9]";
		String E4 = "[ ]";
		int countH = 0;
		int countE = 0;
		int count1 = 0;
		int count = 0;
		char[] arrChar = str.toCharArray();
		String[] arrStr = new String[arrChar.length];
		for(int i = 0;i < arrChar.length;i++) {
			arrStr[i] = String.valueOf(arrChar[i]);
		}
		for(String i : arrStr) {
			if(i.matches(E1)) {
				countH++;
			}
			if(i.matches(E2)) {
				countE++;
			}
			if(i.matches(E3)) {
				count1++;
			}
			if(i.matches(E4)) {
				count++;
			}
		}
		System.out.println("汉字的个数为: "+ countH);
		System.out.println("字母的个数为: "+ countE);
		System.out.println("数字的个数为: "+ count1);
		System.out.println("空格的个数为: "+ count);
	}

}
