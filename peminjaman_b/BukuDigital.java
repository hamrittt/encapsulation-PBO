package peminjaman_b;
import buku_a.Buku;
//SOURCE CODE B1
public class BukuDigital extends Buku {
    // memanggil konstruktor superclass (A1)
    public BukuDigital(String judul, String penulis, int tahunTerbit, String kategori, String kodeRak, double hargaBuku){
        super(judul, penulis, tahunTerbit, kategori, kodeRak, hargaBuku);
    }
    public void aksesBukuDigital(){
        System.out.println("======== AKSES KE BUKU DIGITAL (B1) ========");
        //LOLOS (TIDAK ERROR)
        System.out.println("judul : " + judul);
        System.out.println("penulis : " + penulis);
        System.out.println("tahun terbit : " + tahunTerbit);
        System.out.println("kategori buku : " + kategori);
        //TIDAK LOLOS(ERROR)
        // System.out.println("kode rak buku : " + kodeRak);
        // System.out.println("harga buku : " + hargaBuku);
    }
}