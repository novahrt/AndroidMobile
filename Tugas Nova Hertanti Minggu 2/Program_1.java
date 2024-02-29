import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Angka yang dimasukkan adalah positif.");
        } else if (number < 0) {
            System.out.println("Angka yang dimasukkan adalah negatif.");
        } else {
            System.out.println("Angka yang dimasukkan adalah nol.");
        }
        scanner.close();
    }
}