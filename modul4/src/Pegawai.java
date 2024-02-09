import java.time.LocalDate;

public class Pegawai extends Orang implements Dosen {
    private String NIP;
    private String namaKantor;
    private String unitKerja;
    private boolean isProgrammer;
    private String alamat;
    String NIDN;
    String KelompokKeahlian;

    public Pegawai(String nama, LocalDate tanggalLahir, String NIP, String namaKantor, String unitKerja) {
        super(nama, tanggalLahir);
        this.NIP = NIP;
        this.namaKantor = namaKantor;
        this.unitKerja = unitKerja;
        if (unitKerja.equalsIgnoreCase("IT")) {
            this.isProgrammer = true;
        } else {
            this.isProgrammer = false;
        }
    }


    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNamaKantor() {
        return namaKantor;
    }

    public void setNamaKantor(String namaKantor) {
        this.namaKantor = namaKantor;
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
        if (unitKerja.equalsIgnoreCase("IT")) {
            this.isProgrammer = true;
        } else {
            this.isProgrammer = false;
        }
    }

    public boolean isProgrammer() {
        return isProgrammer;
    }

    public String getGaji() {
        if (isProgrammer == true) {
            return "Rp10.000.000";
        } else {
            return "Rp7.000.000";
        }
    }

    public String toString() {
        return "\nNama Pegawai = " + super.toString() + "\nNama Kantor = " + this.namaKantor +
                "\nUnit Kerja = " + this.unitKerja + "\nProgrammer = " + this.isProgrammer +
                "\nGaji = " + getGaji() + "\nAlamat = " + this.alamat;
    }

    @Override
    public String getAlamat(){
        return alamat;
    }

    @Override
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    @Override
    public String getNIDN(){
        return NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    @Override
    public String getKelompokKeahlian(){
        return KelompokKeahlian;
    }

    @Override
    public void setKelompokKeahlian(String keahlian){
        this.KelompokKeahlian = KelompokKeahlian;
    }


}
