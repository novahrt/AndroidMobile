public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int searchNumber = 30;

        int result = linearSearch(numbers, searchNumber);

        if (result == -1) {
            System.out.println("Angka " + searchNumber + " tidak ditemukan dalam array.");
        } else {
            System.out.println("Angka " + searchNumber + " ditemukan pada indeks " + result + ".");
        }
    }

    public static int linearSearch(int[] array, int searchNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                return i;
            }
        }
        return -1;
    }
}
