import java.lang.Deprecated;

// Part a: Menambahkan modifier akses private untuk atribut
class Person {
    private String nama; // Part a: Atribut nama diberi modifier akses private
    @Deprecated  // Part b: Menambahkan anotasi @Deprecated pada atribut usia
    private int umur;
    
    // Konstruktor untuk menginisialisasi objek Person
    Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    // Method getter untuk atribut nama
    String getNama() {
        return nama;
    }
    
    // Method getter untuk atribut usia
    int getUmur() {
        return umur;
    }
}

// Part c: Mencoba mengakses atribut dari luar kelas Person
class Main {
    public static void main(String[] args) {
        Person orang = new Person("Yola", 20);
        
        // Ini akan menghasilkan error kompilasi karena atribut nama private
        // System.out.println(orang.nama);
        
        // Ini akan bekerja karena kita telah menyediakan method getter untuk atribut nama
        System.out.println(orang.getNama());
        
        // Ini juga akan menghasilkan error kompilasi karena atribut umur ditandai sebagai deprecated
        // System.out.println(orang.umur);
        
        // Ini akan bekerja karena kita telah menyediakan method getter untuk atribut umur
        System.out.println(orang.getUmur());
    }
}