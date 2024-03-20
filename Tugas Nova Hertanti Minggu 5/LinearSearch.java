public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 7, 13, 17, 19, 21, 27, 39, 55, 61};
        int x = 21;
        int index = search(arr, x);

        if (index == -1) {
            System.out.println("Elemen tidak ditemukan");
        } else {
            System.out.println("Elemen ditemukan pada indeks ke-" + index);
        }
    }

    public static int search(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}