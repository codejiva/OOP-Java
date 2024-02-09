import java.time.LocalDate;

abstract class Orang {
    String nama;
    LocalDate tanggalLahir;

    public Orang(String nama, LocalDate tanggalLahir) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getGaji() {
        return "Tidak ada gaji.";
    }

    public String toString() {
        return getNama() + "\nTanggal lahir : " + getTanggalLahir();
    }

    abstract public String getAlamat();
    abstract public void setAlamat(String Alamat);
}
