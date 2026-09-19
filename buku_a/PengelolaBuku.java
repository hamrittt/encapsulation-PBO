package buku_a;
// SOURCE CODE A2
public class PengelolaBuku {
    public void aksesBuku(Buku buku){
        System.out.println("======== AKSES KE BUKU (A2) ========");
        // LOLOS (TIDAK ERROR)
        System.out.println("judul : " + buku.judul);
        System.out.println("penulis : " + buku.penulis);
        System.out.println("tahun terbit : " + buku.tahunTerbit);
        System.out.println("kategori buku : " + buku.kategori);
        System.out.println("kode rak buku : " + buku.kodeRak);
        // TIDAK LOLOS (ERROR)
        // System.out.println("harga buku : " + buku.hargaBuku);
    }
}