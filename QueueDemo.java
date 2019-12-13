package B12_08;

class Node {
    int value;
    Node next;

}

public class QueueDemo {

    Node front;
    Node rear;
    int size;
    public QueueDemo(){
        //空队列
        front = rear = null;
        size = 0;
    }

    public void offer(int value){
        Node node = new Node();
        node.value = value;
        node.next = null;
        //空队列
        if(front == null){
            front = rear = node;
        }
        //尾插
        else {
            rear.next = node;
            rear = rear.next;
        }
        size++;
    }

    public void poll(){
       if(front == null){
           return;
       }
       front = front.next;
       //处理最后一个结点
        if(front == null){
            rear = null;
        }
        size--;
    }

    public int peek(){
        if(front == null){
            return -1;
        }
        return front.value;
    }

    public  int rear(){
        if(front == null){
            return -1;
        }
        return rear.value;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();
        System.out.println(q.isEmpty());
        System.out.println(q.size());

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q.isEmpty());
        System.out.println(q.size());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }
        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }

}
