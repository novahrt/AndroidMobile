class Node { //Kelas Node merepresentasikan simpul (node) dalam linked list.
    public int data; // Data yang disimpan dalam simpul
    public Node next; // Referensi ke simpul selanjutnya dalam linked list

    // Konstruktor untuk kelas Node, yang menerima sebuah data integer sebagai parameter.
    public Node(int data) {
        this.data = data;
        this.next = null; //tidak ada simpul selanjutnya
    }
}

class LinkedList {
    // Node head dari linked list.
    public Node head;

    // Konstruktor untuk kelas LinkedList, yang menginisialisasi Node head menjadi null.
    public LinkedList() {
        this.head = null;
    }

    // Method addElement() menambahkan sebuah elemen baru ke akhir dari daftar.
    public void addElement(int data) {

        // Jika daftar kosong, Node baru menjadi Node head.
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            // Melintasi daftar hingga akhir.
            while (current.next != null) {
                current = current.next;
            }
            // Menambahkan Node baru di akhir daftar.
            current.next = new Node(data);
        }
    }

    // Method deleteElement() menghapus elemen pertama dari sebuah data yang diinginkan dari daftar.
    public void deleteElement(int data) {

        // Jika daftar kosong, tidak ada yang perlu dihapus.
        if (head == null) {
            return;
        }
        if (head.data == data) {
            // Jika Node head berisi data yang akan dihapus, update Node head.
            head = head.next;
            return;
        }
        Node current = head;
        // Melintasi daftar hingga data yang akan dihapus ditemukan.
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                // Jika data ditemukan, hapus Node yang sesuai.
                return;
            }
            current = current.next;
        }
    }

    // Method printList() mencetak state saat ini dari daftar.
    public void printList() {
        Node current = head;
        // Melintasi daftar dan mencetak data dari setiap Node.
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method main() memperlihatkan penggunaan kelas LinkedList.
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Menambahkan elemen ke daftar.
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.printList(); // Output: 1 -> 2 -> 3 -> 4 -> null

        // Menghapus elemen dari daftar
        list.deleteElement(2);
        list.printList(); // Output: 1 -> 3 -> 4 -> null

        // Menghapus elemen lain dari daftar.
        list.deleteElement(1);
        list.printList(); // Output: 3 -> 4 -> null

        // Menghapus elemen terakhir dari daftar.
        list.deleteElement(4);
        list.printList(); // Output: 3 -> null
    }
}