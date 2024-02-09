import java.time.LocalDate;

public class Programmer extends Pegawai {
    private String bahasaPemrograman;
    private String platform;

    public Programmer(String nama, LocalDate tanggalLahir, String NIP, String namaKantor, String unitKerja, String bahasaPemrograman, String platform){
        super(nama, tanggalLahir, NIP, namaKantor, unitKerja);
        this.bahasaPemrograman = bahasaPemrograman;
        this.platform = platform;
    }
    public String getBahasaPemrograman() {
        return bahasaPemrograman;
    }
    public void setBahasaPemrograman(String bahasaPemrograman){
        this.bahasaPemrograman = bahasaPemrograman;
    }
    public String getPlatform(){
        return this.platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String toString(){
        return "\n" + super.toString() + "\nBahasa Pemrograman = " + getBahasaPemrograman() + "\nPlatform = " + getPlatform();
    }

}
