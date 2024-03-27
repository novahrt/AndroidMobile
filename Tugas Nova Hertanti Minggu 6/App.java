class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addElement(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void deleteElement(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.printList(); // Output: 1 -> 2 -> 3 -> 4 -> null

        list.deleteElement(2);
        list.printList(); // Output: 1 -> 3 -> 4 -> null

        list.deleteElement(1);
        list.printList(); // Output: 3 -> 4 -> null

        list.deleteElement(4);
        list.printList(); // Output: 3 -> null
    }
}