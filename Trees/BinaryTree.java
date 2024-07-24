public class BinaryTree{
    public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left();
        Node right();
        public Node(int val)
        {
            this.value=val;

        }
        
    }
private Node root;
//insert elements
public void populate(Scanner scanner){
    System.out.println("Enter the root Node:");
    int value=scanner.nextInt();
    root=new Node(value);
    populate(scanner,root);

}
private void populate(Scanner scanner,Node node){
    
}
}