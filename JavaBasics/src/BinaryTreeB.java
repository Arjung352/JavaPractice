public class BinaryTreeB {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left  = null;
            this.right = null;
        }
    }
        static class BinaryTree {
            static int idx = -1;
            public static Node buildTree(int nodes[]) {
                idx++;
                if (nodes[idx] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);
                return newNode;
            }

            // There are 3 recursive treversal techniques in binary tree 
            // PreOrder-> Root,Left,Right
            // InOrder-> Left,Root,Right
            // PostOrder-> Left,Right,Root

            // PreOrder traversal

        }
        // PreOrder -> Root->Left->Right
        public static void preOrder(Node root) {
        // base case when root == null
            if(root==null){
                return;
            }
            System.out.println(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        // InOrder -> Left->Root->Right
        public static void inOrder(Node root) {
        // base case when root == null
            if(root==null){
                return;
            }
            preOrder(root.left);
            System.out.println(root.data+" ");
            preOrder(root.right);
        }
        // PostOrder -> Left->Right->Root
        public static void PostOrder(Node root) {
        // base case when root == null
            if(root==null){
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.println(root.data+" ");
        }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("PreOrder traversal:-");
        preOrder(root);
        System.out.println("InOrder traversal:-");
        inOrder(root);
    }
} 