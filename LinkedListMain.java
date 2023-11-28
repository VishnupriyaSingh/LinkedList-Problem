public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(56);
        list.append(70);

        list.insertAfter(56, 30);

        list.printList(); 
    }
}