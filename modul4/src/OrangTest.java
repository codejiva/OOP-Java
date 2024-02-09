import java.time.LocalDate;

public class OrangTest {
    public static void main(String[] args){
        //MEMBUAT OBJEK PEGAWAI
        Pegawai leia = new Pegawai("Princess Leia", LocalDate.of(2000, 8, 20), "123456", "Rebel Alliance", "IT");
        leia.setAlamat("Alderaan");
        //MEMBUAT OBJEK DOSEN
        Pegawai luke = new Pegawai("Luke Skywalker", LocalDate.of(2000, 8, 20), "123457", "Rebel Alliance", "IT");
        luke.setAlamat("Tatooine");
        luke.setNIDN("354274885");
        luke.setKelompokKeahlian("The Force"); // Set nilai kelompokKeahlian
        //MEMBUAT OBJEK PROGRAMMER
        Programmer anakin = new Programmer("Anakin Skywalker", LocalDate.of(1980, 5, 15), "349746013", "Galactic Empire", "Jedi", "Java", "Web");
        anakin.setAlamat("Coruscant");


        System.out.println("\n==== Daftar Pegawai (1) ====");
        //Cara 1 - Menampilkan beberapa detail
        System.out.println("Nama = " + leia.getNama() + "\nTanggal Lahir = " + leia.getTanggalLahir() + "\nNIP = " + leia.getNIP() +
                "\nKantor = " + leia.getNamaKantor() + "\nUnit Kerja = " + leia.getUnitKerja() + "\nAlamat = " + leia.getAlamat());

        //Cara 2 - Memanggil toString
        System.out.println("\n==== Daftar Pegawai (2) ====");
        System.out.println(leia);


        System.out.println("\n==== Daftar Dosen (1) ====");
        //Cara 1 - Menampilkan beberapa detail
        System.out.println("\nNama = " + luke.getNama() + "\nTanggal Lahir = " + luke.getTanggalLahir() + "\nNIP = " + luke.getNIP() + "\nKantor = " + luke.getNamaKantor() +
                "\nUnit Kerja = " + luke.getUnitKerja() + "\nAlamat = " + luke.getAlamat() + "\nKeahlian = " + luke.getKelompokKeahlian() + "\nNIDN = " + luke.getNIDN());

        //Cara 2 - Memanggil toString
        System.out.println("\n==== Daftar Dosen (2) ====");
        System.out.println(luke);


        System.out.println("\n==== Programmer 1 ====");
        //Cara 1 - Menampilkan beberapa detail
        System.out.println("Nama = " + anakin.getNama() + "\nTanggal Lahir = " + anakin.getTanggalLahir() + "\nNIP = " + anakin.getNIP() + "\nUnit Kerja = " + anakin.getUnitKerja() +
                "\nKantor = " + anakin.getNamaKantor() + "\nBahasa Pemrograman = " + anakin.getBahasaPemrograman() + "\nPlatform = " + anakin.getPlatform() + "\nAlamat = " + anakin.getAlamat());
        //Cara 2 - Memanggil toString
        System.out.println("\n==== Programmer 2 ====");
        System.out.println(anakin);
    }

}
