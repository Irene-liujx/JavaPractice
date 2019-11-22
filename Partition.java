//以给定值x为基准将链表分割成两部分，所有小于x的结点排在x的结点之前,所有大于x的结点排在x的结点之后
public class Partition {

    public static Node partition(Node head,int x) {
        Node cur = head;
        Node sHead = null;
        Node bHead = null;
        Node sLast = null;
        Node bLast = null;

        while (cur != null) {
            if (cur.val < x) {
                if (sHead == null) {
                    sHead = cur;
                } else {
                    sLast.next = cur;
                }
                sLast = cur;
            } else {
                if (bHead == null) {
                    bHead = cur;
                } else {
                    bLast.next = cur;
                }
                bLast = cur;
            }
            cur = cur.next;
        }

        if (sHead == null) {
            return bHead;
        }

        if (bHead == null) {
            return sHead;
        }

        sLast.next = bHead;
        bLast.next = null;
        return sHead;
    }

    public static void main(String[] args) {
        Node n6 = new Node(2);
        Node n5 = new Node(4, n6);
        Node n4 = new Node(1, n5);
        Node n3 = new Node(7, n4);
        Node n2 = new Node(3, n3);
        Node n1 = new Node(6, n2);
        //6  3  7  1  4  2

        Node head = partition(n1, 5);
        printList(head);
    }

        public static void printList(Node head) {
            for (Node cur = head; cur != null; cur = cur.next) {
                System.out.println(cur);
            }
        }
}
