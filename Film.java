public class Film {
    String judul, genre, rate;
    int jumlahTiket, hargaTiket;

    Film(){

    }

    Film(String jd, String gr, String rt, int jt, int ht) {
        judul = jd;
        genre = gr;
        rate = rt;
        jumlahTiket = jt;
        hargaTiket = ht;
    }
    

    void tampilFilm() {
        System.out.println("========================================");
        System.out.println("Judul\t\t\t: " + judul);
        System.out.println("Genre\t\t\t: " + genre);
        System.out.println("Rate\t\t\t: " + rate);
        System.out.println("Jumlah Tiket\t\t: " + jumlahTiket);
        System.out.println("Harga Tiket\t\t: " + hargaTiket);
        System.out.println("========================================");
    }

    void tambahTiket(int n) {
        jumlahTiket += n;
    }

    void kurangiTiket(int n) {
        if (jumlahTiket > 0) 
            jumlahTiket -= n;
    }

    int totalRevenue(int jumlah) {
        return jumlah * hargaTiket;
    }
}
