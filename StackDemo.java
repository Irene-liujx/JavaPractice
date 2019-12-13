package B12_08;

import java.util.Arrays;


public class StackDemo {
    //顺序表实现
    private int[] array;
    private int size;
    public StackDemo(int n){
        array = new int[n];
        size = 0;
    }

    public void push(int value){
        //检查容量
        if(size == array.length){
            //扩容
            array = Arrays.copyOf(array,2*size);
        }
        //尾插
        array[size++] = value;
    }

    public void pop(){
        if(size > 0){
            --size;
        }
    }

    public int peek(){

        return array[size - 1];
    }

    public int size(){
       return size;
    }

    public boolean empty(){
        return size == 0;
    }

    public static void main(String[] args) {
        StackDemo st = new StackDemo(2);
        System.out.println(st.size());
        System.out.println(st.empty());

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.size());
        System.out.println(st.empty());
        System.out.println(st.peek());

        System.out.println("遍历:");
        while(!st.empty()){
            System.out.println(st.peek() + " ");
            st.pop();
        }
        System.out.println();
        System.out.println(st.size());
        System.out.println(st.empty());
    }
}
