package BitPractice;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>(100);
		//β��
		list.add("Hello");
		list.add("ljx");
		System.out.println(list);
		String s0 = list.get(0);
		System.out.println(s0);
		//ͷ��
		list.add(0,"ljx");
		System.out.println(list);
		//�滻
		list.set(2,"fdc");
		System.out.println(list);
	}

}
