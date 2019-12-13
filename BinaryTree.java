package B12_12_DS;

class Node{
    char value;
    Node left;
    Node right;
    public Node(char value){
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree {

    int size = 0;
    int leafSize = 0;

    //前序遍历
    public void preOrder(Node root){
        //终止条件：空树
        if(root == null){
            return;
        }else{
            //递推：打印根的值
            System.out.print(root.value);
            //左子树
            preOrder(root.left);
           //右子树
            preOrder(root.right);
        }
    }

    //中序遍历
    public void inOrder(Node root){
        if(root != null){
            //访问左子树
            inOrder(root.left);
            //根
            System.out.print(root.value);
            //访问右子树
            inOrder(root.right);
        }
    }

    //后序遍历
    public void postOrder(Node root){
        if(root != null){
            //访问左子树
            inOrder(root.left);
            //访问右子树
            inOrder(root.right);
            //根
            System.out.print(root.value);
        }
    }

    //计算树的节点数
    public void getSize1(Node root){
        if(root != null){
            size++;
            getSize1(root.left);
            getSize1(root.right);
        }
    }

    public int getSize2(Node root){
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }else{
            //整棵树的节点:当前节点 + 左右子树节点的个数
            return getSize2(root.left) + getSize2(root.right) +1;
        }

    }

    //子问题--获得叶子节点
    public void getLeafSize1(Node root){
        if(root == null){
            return ;
        }else if(root.left == null && root.right == null){
            leafSize++;
            return;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    //求叶子节点个数
    //整棵树的叶子节点:左右子树叶子节点的个数
    public int getLeafSize2(Node root){
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    //求第K层的节点数
    public int getKSize(Node root,int k){
        if(root == null){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        return getKSize(root.left,k - 1) + getKSize(root.right,k - 1);
    }

    //构造树
    public Node buildTree(){
        Node root = new Node('A');
        Node node1 = new Node('B');
        Node node2 = new Node('C');
        Node node3 = new Node('D');
        Node node4 = new Node('E');
        Node node5 = new Node('F');
        Node node6 = new Node('G');
        Node node7 = new Node('H');
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.right = node7;
       return root;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.getSize1(tree.buildTree());
        System.out.println(tree.size);
        Node root = tree.buildTree();
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();;
        tree.postOrder(root);
        System.out.println();
        tree.getSize2(root);
        System.out.println(tree.size);
        tree.getLeafSize1(root);
        System.out.println(tree.leafSize);
        System.out.println(tree.getLeafSize2(root));
        System.out.println(  tree.getKSize(root,4));
        System.out.println( tree.getKSize(root,3));
        System.out.println(tree.getKSize(root,2));
        System.out.println(tree.getKSize(root,1));
    }
}
