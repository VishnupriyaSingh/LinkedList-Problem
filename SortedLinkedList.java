public class SortedLinkedList {
    Node head;

    class Node {
        Comparable data;
        Node next;

        Node(Comparable data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Comparable data) {
        Node newNode = new Node(data);

        if (head == null || head.data.compareTo(data) >= 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data.compareTo(data) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}