package BitPractice;

import java.util.Arrays;

public class MyArrayList {
	private int[] array;
	private int size;
	
	public MyArrayList(int capacity)
	{
		array = new int[capacity];
		size = 0;
	}
	
	public MyArrayList() {
		this(10);
	}
	
	//检查容量是否够用
	//待插入的数据个数;return true 表示够用,false表示不够用
	private boolean checkCapacity(int num) {
		return size + num <= array.length;
	}
	
	//扩容O(n)
	private void ensureCapacity() {
		//如果原来的length不够用,扩容的一般策略是容量扩大2倍
		int newlength = array.length * 2;
		int[] newArray = new int[newlength];
		for(int i = 0;i < array.length;i++) {
			newArray[i] = array[i];
		}
		this.array = newArray;
		
		//array = Arrays.copyOf(array,array.length * 2);
	}
/*	
	//头插O(n)
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
	
	//头删O(n)
	public void popFront() {
		if(size == 0) {
			System.out.println("空的顺序表");
			return;
		}
		for(int i = 1;i < size;i++) {
			array[i - 1] = array[i];
		}
		array[--size] = 0;
	}
	
	//尾插O(1)
	public void pushBack(int element){
		array[size++] = element;
	}
	
	//尾删O(1)
	public void popBack(){
		if(size == 0) {
			System.out.println("空的顺序表");
			return;
		}
	   array[--size] = 0;
	}
	
*/	
	//插入O(n)
	public void insert(int element,int index) {
		if(index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if(!checkCapacity(1)) {
			ensureCapacity();
		}
		for(int i = size;i > index;i--) {
			array[i] = array[i - 1];
		}
		array[index] = element;
		size++;
	}
	
	//删除O(n)
	public void erase(int index) {
		if(size == 0) {
			System.out.println("空的顺序表");
			return;
		}
		for(int i = index + 1; i < size;i++) {
			array[i] = array[i - 1];
		}
		array[--size] = 0;
	}
	
	//头插
	public void pushFront(int element) {
		insert(element,0);
	}
	
	//尾插
	public void pushBack(int element) {
		insert(element,size);
	}
	
	//头删
	public void popFront() {
		erase(0);
	}
	
	//尾删
	public void popBack() {
		erase(size - 1);
	}
	
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
	
	//按照下标查找具体值
	public int get(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return array[index];
	}
	
	//替换掉下标所在数据
	public int set(int index,int element) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		int old = array[index];
		array[index] = element;
		return old;
	}
	
	public static void main(String[] args){
		MyArrayList list = new MyArrayList(2);
		
		list.pushFront(2);
		list.pushFront(4);
		list.pushFront(6);
		System.out.println(list.array.length);
		list.pushBack(3);	
		list.pushBack(2);
		System.out.println(list.array.length);
		list.pushBack(1);
		list.popBack();
		System.out.println(list);
		list.insert(22, 3);
		System.out.println(list);
		System.out.println(list.get(1));
		list.set(1, 6);
		System.out.println(list);
		
	}
}
