package BitPractice;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>(100);
		//Î²²å
		list.add("Hello");
		list.add("ljx");
		System.out.println(list);
		String s0 = list.get(0);
		System.out.println(s0);
		//Í·²å
		list.add(0,"ljx");
		System.out.println(list);
		//Ìæ»»
		list.set(2,"fdc");
		System.out.println(list);
	}

}
