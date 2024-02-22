package Minggu2;

public class BukuMain17 {
    public static void main(String[] args) {
        Buku17 bk1 = new Buku17();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon();
        bk1.hitungHargaBayar();
        bk1.tampilInformasi();

        Buku17 bk2 = new Buku17("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.tampilInformasi();
        bk2.terjual(11);
        bk2.hitungHargaTotal(11);
        bk2.hitungDiskon();
        bk2.hitungHargaBayar();

        Buku17 bk3 = new Buku17("Nama Mahasiswa", "Michelle", 10, 2, 2000);
        bk3.tampilInformasi();
        bk3.terjual(1);
        bk3.hitungHargaTotal(1);
        bk3.hitungDiskon();
        bk3.hitungHargaBayar();
    }
}
