package Minggu2;

public class Buku17 {
    String judul, pengarang;
    int halaman, stok, harga, total, diskon, bayar;

    public Buku17() {

    }

    public Buku17 (String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Jumlah halaman: "+halaman);
        System.out.println("Sisa stok :"+stok);
        System.out.println("Harga: Rp "+harga);
    }

    void terjual(int jml) {
        if (stok>0) {
            stok-=jml;
        }
    }

    void restock(int jml) {
        stok+=jml;
    }

    void gantiHarga(int hrg) {
        harga=hrg;
    }

    int hitungHargaTotal(int jml) {
        total=harga*jml;
        System.out.println(total);
        return total;
    }

    int hitungDiskon() {
        if (total>150000) {
            diskon=12;
        } else if (total>=75000 && total<=150000) {
            diskon=5;
        } else {
            diskon=0;
        }
        System.out.println(diskon);
        return diskon;
    }

    int hitungHargaBayar() {
        bayar=total-(total*diskon/100);
        System.out.println(bayar);
        return bayar;
    }
}
