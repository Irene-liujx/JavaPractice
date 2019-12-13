package BitPractice;

import java.util.Arrays;

public class MyArrayList {
	private int[] array;
	private int size;
	
	public MyArrayList()
	{
		array = new int[10];
		size = 0;
	}
	
	//头移
	public void pushFront(int element){
		//把原有数据全部后移一格
		for(int i = size; i >= 1;i--){
			array[i] = array[i - 1];
		}
		//把新的元素放到0下标处
		array[0] = element;
		//长度+1
		size++;
	}
	
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
	
	//尾移
	public void pushBack(int element){
		array[size++] = element;
	}
	
	//尾删
	public void popBack(){
		array[size] = array[--size];
	}
	
	//插入
	public void insert(int element,int index) {
		for(int i = array[size - 1];i >= index;i--) {
			array[i + 1] = array[i];
		}
		array[index] = element;
		size++;
	}
	
	public static void main(String[] args){
		MyArrayList list = new MyArrayList();
		list.pushFront(2);
		list.pushFront(4);
		list.pushFront(6);
		System.out.println(list);
		list.pushBack(3);
		list.pushBack(2);
		list.pushBack(1);
		System.out.println(list);
		list.popBack();
		System.out.println(list);
		list.insert(22, 3);
		System.out.println(list);
		
	}
}
