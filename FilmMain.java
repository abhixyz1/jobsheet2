public class FilmMain {
        public static void main(String[] args) {
            Film film1 = new Film();
            
            film1.judul = "Quantumania Mania";
            film1.genre = "Action Comedy";
            film1.rate = "Remaja";
            film1.jumlahTiket = 3000;
            film1.hargaTiket = 40000;
    
            film1.tambahTiket(1);
            film1.kurangiTiket(3);
            film1.tampilFilm();
    
            int income = film1.totalRevenue(4);
    
            System.out.println("Total jual 4 tiket \t= "+income);
    
            System.out.println("========================================\n");
    
            Film film2 = new Film("Maniaquantum", "Horror", "Dewasa", 2000, 40000);
            film2.tampilFilm();
    
            Film film3 = new Film("Batman", "Action", "Dewasa", 3000, 45000 );
            film3.tampilFilm();
        }
    }
    

