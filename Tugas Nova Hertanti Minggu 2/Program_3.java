import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai ujian anda: ");
        int nilai = scanner.nextInt();
        if (nilai >= 80 ) {
            System.out.println("Selamat! Anda lulus dengan nilai baik.");
        } else if (nilai >= 60 && nilai <= 79) {
            System.out.println("Anda lulus.");
        } else {
            System.out.println("Anda tidak lulus.");
        }
        scanner.close();
    }
}


    

