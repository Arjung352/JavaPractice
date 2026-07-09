import java.util.LinkedList;
import java.util.Queue;

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
            inOrder(root.left);
            System.out.println(root.data+" ");
            inOrder(root.right);
        }
        // PostOrder -> Left->Right->Root
        public static void PostOrder(Node root) {
        // base case when root == null
            if(root==null){
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.println(root.data+" ");
        }

        // Level order traversal -> Level by level traversal

        public static void levelOrder(Node root) {
            if(root==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        // hight of the binary tree
        public static int height(Node root) {
            if(root==null){
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }

        // total number of nodes in the binary tree
        public static int countNodes(Node root) {
            if(root==null){
                return 0;
            }
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            return leftCount+rightCount+1;
        }

        // Max level sum of the binary tree
        public static int maxLevelSum(Node root) {
        // so what we can do is use LevelOrder traversal and count the maximum if each level and based on that can return the level
        if(root==null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        int maxSum=Integer.MIN_VALUE;
        int level = 1;
        int ans = 1;
        q.add(root);
        q.add(null);
        int currSum=0;
        while(!q.isEmpty()){
            Node currNode = q.remove();
            // here we'll firstly check if the root is null of not
            if(currNode==null){
                // if root is null then we'll check if the queue is empty of not
                if (currSum > maxSum) {
                    maxSum = currSum;
                    ans = level;
                }
                currSum = 0;
                if(q.isEmpty()){
                    break;
                }
                else{
                    level++;
                    q.add(null);
                }
            }
            else{
                currSum+=currNode.data;
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
        return ans;
    }

    // sum of all the nodes in the binary tree
    public static int sumOfNodes(Node root) {
        if(root==null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }

    // diameter of the binary tree
    public static int diameter(Node root) {
        if(root==null){
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDiameter = leftHeight+rightHeight+1;
        return Math.max(selfDiameter,Math.max(leftDiameter,rightDiameter));
    }
    
    //another approach to find the diameter of the binary tree in O(n) time complexity
    static class TreeInfo{
        int diameter;
        int height;
        TreeInfo(int diameter,int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.height,right.height)+1;
        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height+right.height+1;
        int myDiameter = Math.max(diam3,Math.max(diam1,diam2));
        TreeInfo myInfo = new TreeInfo(myDiameter,myHeight);
        return myInfo;
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
        System.out.println("PostOrder traversal:-");
        PostOrder(root);
        System.out.println("LevelOrder traversal:-");
        levelOrder(root);
        System.out.println("Height of the tree:-");
        System.out.println(height(root));
        System.out.println("Total number of nodes in the tree:-");
        System.out.println(countNodes(root));
        System.out.println("Max level sum:-");
        System.out.println(maxLevelSum(root));
        System.out.println("Sum of all nodes in the tree:-");
        System.out.println(sumOfNodes(root));
        System.out.println("Diameter of the tree:-");
        System.out.println(diameter(root));
        System.out.println("Diameter of the tree (optimized):-");
        System.out.println(diameter2(root).diameter);
        System.out.println(diameter2(root).height);
    }
} 