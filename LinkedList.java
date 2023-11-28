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

    public void popLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void insertAfterValue(int afterValue, int newValue) {
        Node current = head;
        while (current != null && current.data != afterValue) {
            current = current.next;
        }

        if (current != null) {
            Node newNode = new Node(newValue);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteByValue(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
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