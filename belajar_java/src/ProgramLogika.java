public class ProgramLogika {
    public static void main(String[] args) {

        // Mendefinisikan dua variabel bilangan bulat
        int bilangan1 = 30;
        int bilangan2 = 25;

        // Melakukan operasi lebih besar
        boolean lebihBesar = bilangan1 > bilangan2;
        System.out.println("Apakah bilangan1 lebih besar dari bilangan2?" + lebihBesar);
        
        // Melakukan operasi sama
        boolean samaDengan = bilangan1 == bilangan2;
        System.out.println("Apakah bilangan1 sama dengan bilangan2?" + samaDengan);

        // Melakukan operasi lebih kecil
        boolean lebihKecil = bilangan1 < bilangan2;
        System.out.println("Apakah bilangan1 lebih kecil dari bilangan2?" + lebihKecil);

        // Menggunakan struktur kontrol if-else
        if (lebihBesar) {
            System.out.println("Bilangan 1 lebih besar dari Bilangan 2.");
        } else if (samaDengan) {
            System.out.println("Bilangan 1 tidak sama dengan Bilangan 2");
        } else {
            System.out.println("Bilangan 1 tidak lebih kecil dari Bilangan 2.");
        }
    }
}
