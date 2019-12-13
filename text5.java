package Practice;

import java.util.Scanner;

//import javax.swing.*;

public class text5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄúµÄ³É¼¨: ");
		 int N = sc.nextInt();
		str = (N > 90?"A":(N > 60?"B":"C"));
		System.out.println(str);
	}

}
