public class MataKuliahMain26 {
     public static void main(String[] args) {

        // Objek 1 - menggunakan konstruktor default
        MataKuliah26 mk1 = new MataKuliah26();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        // Objek 2 - menggunakan konstruktor berparameter
        MataKuliah26 mk2 = new MataKuliah26("TI202", "Basis Data", 3, 6);

        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(10); 
        mk2.tampilInformasi();
    }

}
