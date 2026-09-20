package peminjaman_b;
import buku_a.Buku;
//SOURCE CODE B2

public class TransaksiPeminjaman {
    private String namaPeminjamBuku;
    private String tanggalPinjaman;

    public TransaksiPeminjaman(String namaPeminjamBuku, String tanggalPinjaman){
        this.namaPeminjamBuku = namaPeminjamBuku;
        this.tanggalPinjaman = tanggalPinjaman;
    }

    public void aksesTransaksiPeminjaman(Buku buku){
        System.out.println("======== AKSES KE TRANSAKSI PEMINJAMAN (B2) ========");
        System.out.println("Nama Peminjam : " + namaPeminjamBuku);
        System.out.println("Tanggal Pinjaman : " + tanggalPinjaman);
        //LOLOS (TIDAK ERROR)
        System.out.println("judul : " + buku.judul);
        System.out.println("penulis : " + buku.penulis);
        System.out.println("tahun terbit : " + buku.tahunTerbit);
        //TIDAK LOLOS (ERROR)
        // System.out.println("kategori buku : " + kategori);
        // System.out.println("kode rak buku : " + kodeRak);
        // System.out.println("harga buku : " + hargaBuku);
    }
}