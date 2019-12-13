//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
public class DeleteDuplication {

    public static Node deleteDuplication(Node pHead) {
        if (pHead == null) {
            return pHead;
        }
        Node prev = new Node(5);
        Node fake = prev;
        prev.next = pHead;
        Node cur = pHead;
        Node next = pHead.next;

        while (next != null) {
            if (cur.val != next.val) {
                prev = prev.next;
                cur = cur.next;
                next = next.next;
            } else {
                while (next != null && cur.val == next.val) {
                    next = next.next;
                }
                // next 可能是 null

                // 删除 [cur, next)
                prev.next = next;

                cur = next;
                if (next != null) {
                    next = next.next;
                }
            }
        }
        return fake.next;
    }

    public static void main(String[] args) {
        Node n7 = new Node(5);
        Node n6 = new Node(5,n7);
        Node n5 = new Node(4,n6);
        Node n4 = new Node(3,n5);
        Node n3 = new Node(2,n4);
        Node n2 = new Node(1,n3);
        Node n1 = new Node(1,n2);
        //1 1 2 3 4 5 5

        Node m5 = new Node(8);
        Node m4 = new Node(6,m5);
        Node m3 = new Node(6,m4);
        Node m2 = new Node(5,m3);
        Node m1 = new Node(2,m2);
        //2 5 6 6 8

        Node nHead = deleteDuplication(n1);
        Node mHead = deleteDuplication(m1);

        printList(nHead);
        printList(mHead);
    }

    public static void printList(Node head){
        for(Node cur = head; cur != null;cur = cur.next){
            System.out.println(cur);
        }
    }
}
