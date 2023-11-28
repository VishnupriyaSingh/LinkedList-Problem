public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Search for 30: " + list.search(30));

        System.out.println("Search for 100: " + list.search(100));
    }
}