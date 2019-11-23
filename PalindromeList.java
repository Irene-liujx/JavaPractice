//链表的回文结构
public class PalindromeList {

    public static int getLength(Node head){
        int count = 0;
        Node cur = head;
        while(cur != null){
            cur = cur.next;
            count++;
        }
        return count;
    }

    public static Node getMiddle(Node head){
        int length = getLength(head);
        int half = length / 2;
        Node cur = head;
        for(int i = 0;i < half;i++){
            cur = cur.next;
        }
        return cur;
    }

    public static Node reverseList(Node head){
        Node cur = head;
        Node nHead = null;
        while(cur != null){
            Node next = cur.next;
            cur.next = nHead;
            nHead = cur;
            cur = next;
        }
        return nHead;
    }

    public static boolean checkPalindrome(Node head){
        Node middle = getMiddle(head);
        Node rHead = reverseList(middle);
        Node c1 = head;
        Node c2 = rHead;
        while(c1 != null && c2 != null){
            if(c1.val != c2.val){
                return false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node n6 = new Node(5);
        Node n5 = new Node(3,n6);
        Node n4 = new Node(2,n5);
        Node n3 = new Node(2,n4);
        Node n2 = new Node(3,n3);
        Node n1 = new Node(5,n2);


        Node m4 = new Node(4);
        Node m3 = new Node(2,m4);
        Node m2 = new Node(3,m3);
        Node m1 = new Node(1,m2);

        boolean c1 = checkPalindrome(n1);
        boolean c2 = checkPalindrome(m1);
        System.out.println(c1);
        System.out.println(c2);
    }

}
