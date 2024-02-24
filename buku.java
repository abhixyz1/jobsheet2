public class buku {

    String nama, pengarang, penerbit;
    int hargaSatuan, jumlah;

    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    int hitungDiskon(int hitungHargaTotal) {
        if (hitungHargaTotal > 100000) {
            return hitungHargaTotal * 10 / 100;
        } else if (hitungHargaTotal >= 50000 && hitungHargaTotal <= 100000) {
            return hitungHargaTotal * 5 / 100;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int hitungHargaTotal, int hitungDiskon) {
        return hitungHargaTotal - hitungDiskon;
    }
}
