package LinkedListAll.Problems;
public class Reverse_LL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
        static class ReverseNode{
                Node head;
                Node tail;
            public Node reverse(){
                Node currNode = head;
                Node prevNode = null;

                while(currNode != null){
                    Node nextNode = currNode.next;
                    currNode.next = prevNode;
                    prevNode = currNode;
                    currNode = nextNode;
                }
                head = prevNode;
                return head;
            }
            public void insertFirst(int data){
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            }
            public void display(){
                Node currNode = head;
                while(currNode != null){
                    System.out.print(currNode.data + " -> ");
                    currNode = currNode.next;
                }
                System.out.println("Null");
            }
        }
    public static void main(String[] args) {
        ReverseNode list = new ReverseNode();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.display();
        list.reverse();
        list.display();
    }

}
