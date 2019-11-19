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
	
	//��������Ƿ���
	//����������ݸ���;return true ��ʾ����,false��ʾ������
	private boolean checkCapacity(int num) {
		return size + num <= array.length;
	}
	
	//����O(n)
	private void ensureCapacity() {
		//���ԭ����length������,���ݵ�һ���������������2��
		int newlength = array.length * 2;
		int[] newArray = new int[newlength];
		for(int i = 0;i < array.length;i++) {
			newArray[i] = array[i];
		}
		this.array = newArray;
		
		//array = Arrays.copyOf(array,array.length * 2);
	}
/*	
	//ͷ��O(n)
	public void pushFront(int element){
		//��ԭ������ȫ������һ��
		for(int i = size; i >= 1;i--){
			array[i] = array[i - 1];
		}
		//���µ�Ԫ�طŵ�0�±괦
		array[0] = element;
		//����+1
		size++;
	}
	
	//ͷɾO(n)
	public void popFront() {
		if(size == 0) {
			System.out.println("�յ�˳���");
			return;
		}
		for(int i = 1;i < size;i++) {
			array[i - 1] = array[i];
		}
		array[--size] = 0;
	}
	
	//β��O(1)
	public void pushBack(int element){
		array[size++] = element;
	}
	
	//βɾO(1)
	public void popBack(){
		if(size == 0) {
			System.out.println("�յ�˳���");
			return;
		}
	   array[--size] = 0;
	}
	
*/	
	//����O(n)
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
	
	//ɾ��O(n)
	public void erase(int index) {
		if(size == 0) {
			System.out.println("�յ�˳���");
			return;
		}
		for(int i = index + 1; i < size;i++) {
			array[i] = array[i - 1];
		}
		array[--size] = 0;
	}
	
	//ͷ��
	public void pushFront(int element) {
		insert(element,0);
	}
	
	//β��
	public void pushBack(int element) {
		insert(element,size);
	}
	
	//ͷɾ
	public void popFront() {
		erase(0);
	}
	
	//βɾ
	public void popBack() {
		erase(size - 1);
	}
	
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
	
	//�����±���Ҿ���ֵ
	public int get(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return array[index];
	}
	
	//�滻���±���������
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
