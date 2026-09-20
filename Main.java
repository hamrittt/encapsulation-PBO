import buku_a.Buku;
import buku_a.PengelolaBuku;
import peminjaman_b.BukuDigital;
import peminjaman_b.TransaksiPeminjaman;

// MAIN: kelas ini TIDAK berada di package buku_a ataupun peminjaman_b,
// dan TIDAK meng-extend Buku. Jadi dari sini kita mewakili "orang luar" yang paling ketat.
public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Laskar Pelangi", "Andrea Hirata", 2005, "Novel", "R-12", 85000);

        // ================================================================
        // 1) Akses langsung dari Main (package berbeda, bukan subclass)
        // ================================================================
        System.out.println("======== AKSES DARI MAIN (package berbeda, bukan subclass) ========");
        System.out.println("judul (public)        : " + buku.judul);        // LOLOS -> public bisa diakses dari mana saja
        // System.out.println(buku.kategori);   // ERROR -> protected: hanya package sama / subclass
        // System.out.println(buku.kodeRak);    // ERROR -> default: hanya boleh diakses dalam package yang sama (buku_a)
        // System.out.println(buku.hargaBuku);  // ERROR -> private: hanya boleh diakses di dalam class Buku sendiri
        System.out.println();

        // ================================================================
        // 2) Akses dari A2 (PengelolaBuku): satu package DENGAN Buku
        //    -> public, protected, default LOLOS. private tetap ERROR.
        // ================================================================
        PengelolaBuku pengelola = new PengelolaBuku();
        pengelola.aksesBuku(buku);
        System.out.println();

        // ================================================================
        // 3) Akses dari B1 (BukuDigital): package BEDA, tapi SUBCLASS dari Buku
        //    -> public & protected LOLOS (protected ikut diwariskan lintas package).
        //       default & private ERROR (default tidak ikut lintas package,
        //       private memang tidak pernah diwariskan).
        // ================================================================
        BukuDigital bukuDigital = new BukuDigital("Bumi Manusia", "Pramoedya A.T.", 1980, "Sejarah", "R-07", 120000);
        bukuDigital.aksesBukuDigital();
        System.out.println();

        // ================================================================
        // 4) Akses dari B2 (TransaksiPeminjaman): package BEDA, BUKAN subclass,
        //    hanya menerima objek Buku sebagai parameter.
        //    -> HANYA public yang LOLOS. protected/default/private semua ERROR.
        // ================================================================
        TransaksiPeminjaman transaksi = new TransaksiPeminjaman("Nadya", "20-09-2026");
        transaksi.aksesTransaksiPeminjaman(buku);
    }
}
