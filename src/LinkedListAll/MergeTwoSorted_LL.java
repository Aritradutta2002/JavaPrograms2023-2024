package LinkedListAll.Problems;

public class MergeTwoSorted_LL {
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

    static class MergeLinkedList {
        Node head;
        Node tail;

        public Node mergeTwoLists(Node list1, Node list2) {
            Node dummy = new Node(0);
            Node current = dummy;
            while (list1 != null && list2 != null) {
                if (list1.data < list2.data) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
            if (list1 != null) {
                current.next = list1;
            } else {
                current.next = list2;
            }
            return dummy.next;
        }

        public void insertFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void display() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("Null");
        }

        public int size() {
            int size = 0;
            Node curr = head;
            while (curr != null) {
                size += 1;
                curr = curr.next;
            }
            return size;
        }
    }

    public static void main(String[] args) {
        MergeLinkedList list1 = new MergeLinkedList();
        MergeLinkedList list2 = new MergeLinkedList();
        list1.insertFirst(80);
        list1.insertFirst(60);
        list1.insertFirst(50);
        list1.insertFirst(20);
        System.out.print("List 1: ");
        list1.display();

        list2.insertFirst(90);
        list2.insertFirst(75);
        list2.insertFirst(70);
        list2.insertFirst(60);
        list2.insertFirst(30);
        System.out.print("List 2: ");
        list2.display();

        MergeLinkedList mergedList = new MergeLinkedList();
        mergedList.head = mergedList.mergeTwoLists(list1.head, list2.head);
        System.out.print("Merged List: ");
        mergedList.display();
    }
}
