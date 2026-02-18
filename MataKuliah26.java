public class MataKuliah26 {

     String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor Default
    public MataKuliah26() {
        kodeMK = "Belum diisi";
        nama = "Belum diisi";
        sks = 0;
        jumlahJam = 0;
    }

    // Konstruktor Berparameter
    public MataKuliah26(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method menampilkan informasi
    void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("---------------------------------");
    }

    // Method mengubah SKS
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    // Method menambah jam
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambah menjadi " + jumlahJam);
    }

    // Method mengurangi jam
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi menjadi " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan. Jam tidak mencukupi.");
        }
    }
}


