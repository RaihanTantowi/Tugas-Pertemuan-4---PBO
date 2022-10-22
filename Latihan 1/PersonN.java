public class PersonN{
    public static void main(String[] args){
    // Membuat object
    Person Anton = new Person();
    Person Riko = new Person();
    /* memanggil atribut dan memberi nilai */
    Anton.Nama = "Anton";
    Anton.JenisKelamin = "Laki - Laki";
    Anton.Umur = 21;
    Riko.Nama = "Riko";
    Riko.JenisKelamin = "Laki - Laki";
    Riko.Umur = 19;
    System.out.println("Nama: " + Anton.Nama);
    System.out.println("Jenis Kelamin: " + Anton.JenisKelamin);
    System.out.println("Umur: " + Anton.Umur);
    System.out.println("======================================");
    System.out.println("Nama: " + Riko.Nama);
    System.out.println("Jenis Kelamin: " + Riko.JenisKelamin);
    System.out.println("Umur: " + Riko.Umur);
    }
    }
   