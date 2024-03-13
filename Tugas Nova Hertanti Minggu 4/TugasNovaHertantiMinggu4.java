import java.lang.Deprecated;

// Part a: Menambahkan modifier akses private untuk atribut
class Person {
    private String name; // Part a: Atribut nama diberi modifier akses private
    @Deprecated  // Part b: Menambahkan anotasi @Deprecated pada atribut usia
    private int age;
    
    // Konstruktor untuk menginisialisasi objek Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method getter untuk atribut nama
    String getName() {
        return name;
    }
    
    // Method getter untuk atribut usia
    int getAge() {
        return age;
    }
}

// Part c: Mencoba mengakses atribut dari luar kelas Person
class Main {
    public static void main(String[] args) {
        Person orang = new Person("Yola", 20);
        
        // Ini akan menghasilkan error kompilasi karena atribut nama private
        // System.out.println(orang.nama);
        
        // Ini akan bekerja karena kita telah menyediakan method getter untuk atribut nama
        System.out.println(orang.getName());
        
        // Ini juga akan menghasilkan error kompilasi karena atribut umur ditandai sebagai deprecated
        // System.out.println(orang.umur);
        
        // Ini akan bekerja karena kita telah menyediakan method getter untuk atribut umur
        System.out.println(orang.getAge());
    }
}