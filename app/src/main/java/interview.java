//string/array, manipulation, tree, hashmap

class Node{
    int data;
    Node left;
    Node right;
}

class BST{
    public Node createNewNode(int k){
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }
    public Node insert(Node node, int val){
        if(node == null){
            return createNewNode(val);
        }

        return node;
    }
}

public class interview{
  public static void main(String[] args){
      BST a = new BST();
      Node root = null;
      //8, 3, 6, 10, 4, 7,1,14,13
      root = a.insert(root, 9);
  }

}