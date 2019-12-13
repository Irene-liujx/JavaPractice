package BitPractice;

public class MyLinkedList {
	
	public static void printLinkedList(Node head) {
			Node cur = head;
			while(cur != null) {
				System.out.println(cur.val);
				cur = cur.next;
			}
	}

	//����ͷ��
	public static Node pushFront(Node head,int val) {
		Node node = new Node(val);
		node.next = head;
		return node;
	}
	
	//����ͷɾ
	public static Node popFront(Node head) {
		if(head == null) {
			throw new RuntimeException("������");
		}
		return head.next;
	}
	
	//β��
	public static Node popBack(Node head,int val) {
		Node node = new Node(val);
		if(head == null) {
			//������û�н��
			return node;
		}else {
			//������������һ�����
			Node cur = head;
			while(cur.next != null) {
				cur = cur.next;
			}
			
			cur.next = node;
			return head;
		}
	}
	
	//βɾ
	public static Node pushBack(Node head) {
		if(head == null) {
			//������û�н��
			throw new RuntimeException("������");
		}
		if(head.next == null) {
			//������ֻ��һ�����
			return null;
		}else {
			//��������һ�����Ͻڵ�
			Node cur = head;
			while(cur.next.next != null) {
				cur = cur.next;
			}
			cur.next = null;
			return head;
		}
	}
	
	//���������
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
