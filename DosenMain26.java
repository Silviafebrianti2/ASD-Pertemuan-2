public class DosenMain26 {
    public static void main(String[] args) {

        // Objek 1 - Konstruktor Default
        Dosen26 dsn1 = new Dosen26();
        dsn1.idDosen = "D001";
        dsn1.nama = "Dr. Andi Pratama";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Algoritma";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Kecerdasan Buatan");
        dsn1.tampilInformasi();


        // Objek 2 - Konstruktor Berparameter
        Dosen26 dsn2 = new Dosen26("D002", "Prof. Siti Rahma", true, 2010, "Basis Data");

        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.ubahKeahlian("Data Science");
        dsn2.tampilInformasi();
    }
}


