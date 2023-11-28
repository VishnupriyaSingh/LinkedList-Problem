class LinkedList {
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    public void insertAfter(int afterData, int newData) {
        Node current = head;
        while (current != null && current.data != afterData) {
            current = current.next;
        }

        if (current != null) {
            Node newNode = new Node(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}