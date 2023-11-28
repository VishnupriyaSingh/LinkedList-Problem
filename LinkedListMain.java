public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);
        list.printList();

        list.insertAfterValue(30, 40);

        list.printList();
    }
}