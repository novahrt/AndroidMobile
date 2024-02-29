import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan umur anda: ");
        int umur = scanner.nextInt();
        if (umur < 18 ) {
            System.out.println("Anda belum cukup umur.");
        } else if (umur >= 18 && umur <= 25) {
            System.out.println("Anda pemuda dewasa.");
        } else {
            System.out.println("Anda adalah orang dewasa.");
        }
        scanner.close();
    }
}

