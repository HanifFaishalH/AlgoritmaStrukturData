package jobsheet10DLL.Tugas.No_2;

public class film {
    int idFilm;
    String judulFilm;
    Double ratingFilm;

    public film(){
        
    }

    public film(int id, String judul, Double rating) {
        id = idFilm;
        judul = judulFilm;
        rating = ratingFilm;
    }

    public void printFilm() {
        System.out.println("ID : "+idFilm);
        System.out.println("Judul Film : "+judulFilm);
        System.out.println("Rating : "+ratingFilm);
    }
}
