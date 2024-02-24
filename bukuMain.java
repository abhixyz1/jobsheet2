public class bukuMain {
    public static void main(String[] args) {
        buku buku1 = new buku();
        
        buku1.nama = "Pemrograman Java";
        buku1.pengarang = "Abhinaya";
        buku1.penerbit = "Abhi Media";
        buku1.hargaSatuan = 100000;
        buku1.jumlah = 10;

        int total = buku1.hitungHargaTotal();
        int diskon = buku1.hitungDiskon(total);
        int bayar = buku1.hitungHargaBayar(total, diskon);

        System.out.println("===========================");
        System.out.println("Nama buku \t= "+buku1.nama);
        System.out.println("Pengarang \t= "+buku1.pengarang);
        System.out.println("Total harga \t= "+total);
        System.out.println("Diskon \t\t= "+diskon);
        System.out.println("===========================");
        System.out.println("Harga bayar \t= "+bayar);
        System.out.println("===========================");
    }
}
