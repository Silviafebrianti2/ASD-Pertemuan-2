public class Dosen26 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor Default
    public Dosen26() {
        idDosen = "Belum diisi";
        nama = "Belum diisi";
        statusAktif = false;
        tahunBergabung = 0;
        bidangKeahlian = "Belum diisi";
    }

    // Konstruktor Berparameter
    public Dosen26(String idDosen, String nama, boolean statusAktif, 
                   int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method menampilkan informasi
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("---------------------------------------");
    }

    // Method mengatur status aktif
    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen berhasil diubah menjadi: " + 
                           (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    // Method menghitung masa kerja
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // Method mengubah bidang keahlian
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi: " + bidangKeahlian);
    }

}
