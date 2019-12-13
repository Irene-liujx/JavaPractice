package BitPractice;

public class MyLinkedList {
	
	public static void printLinkedList(Node head) {
			Node cur = head;
			while(cur != null) {
				System.out.println(cur.val);
				cur = cur.next;
			}
	}

	//链表头插
	public static Node pushFront(Node head,int val) {
		Node node = new Node(val);
		node.next = head;
		return node;
	}
	
	//链表头删
	public static Node popFront(Node head) {
		if(head == null) {
			throw new RuntimeException("空链表");
		}
		return head.next;
	}
	
	//尾插
	public static Node popBack(Node head,int val) {
		Node node = new Node(val);
		if(head == null) {
			//链表中没有结点
			return node;
		}else {
			//链表中至少有一个结点
			Node cur = head;
			while(cur.next != null) {
				cur = cur.next;
			}
			
			cur.next = node;
			return head;
		}
	}
	
	//尾删
	public static Node pushBack(Node head) {
		if(head == null) {
			//链表中没有结点
			throw new RuntimeException("空链表");
		}
		if(head.next == null) {
			//链表中只有一个结点
			return null;
		}else {
			//链表中有一个以上节点
			Node cur = head;
			while(cur.next.next != null) {
				cur = cur.next;
			}
			cur.next = null;
			return head;
		}
	}
	
	//链表的逆置
	public static Node reverse(Node head) {
		Node nHead = null;
		Node cur = head;
		while(cur != null) {
			Node next = cur.next;
			cur.next = nHead;
			nHead = cur;
			cur = next;
		}
		return nHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = pushFront(head,1);
		head = pushFront(head,2);
		head = pushFront(head,3);
		head = pushFront(head,4);
		head = pushFront(head,5);
		printLinkedList(head);
		
		head = popFront(head);
		head = popFront(head);
		printLinkedList(head);
		
		head = reverse(head);
		printLinkedList(head);
		}
}
