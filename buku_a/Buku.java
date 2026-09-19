package buku_a;
// SOURCE CODE A1
public class Buku {
    // PUBLIC
    public String judul, penulis;
    public int tahunTerbit;
    // PROTECTED
    protected String kategori;
    // DEFAULT
    String kodeRak;
    // PRIVATE
    private double hargaBuku;

    public Buku(String judul, String penulis, int tahunTerbit, String kategori, String kodeRak, double hargaBuku){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
        this.kodeRak = kodeRak;
        this.hargaBuku = hargaBuku;
    }

    public void showInfo(){
        System.out.println("======== INFORMASI BUKU (A1) ========");
        System.out.println("judul : " + judul);
        System.out.println("penulis : " + penulis);
        System.out.println("tahun terbit : " + tahunTerbit);
        System.out.println("kategori buku : " + kategori);
        System.out.println("kode rak buku : " + kodeRak);
        System.out.println("harga buku : " + hargaBuku);
    }
}