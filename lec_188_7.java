import java.text.Format;

public class lec_188_7 {
    public static void main(String[] args) {
        Movie mv1 = new Movie("살인의추억", "봉준호", "송강호", 2007, 5);
        System.out.println(mv1.toString());
    }

}

class Movie {
    String name;
    String director;
    String actor;
    int l_year;
    int score;

    public Movie(String name, String director, String actor, int l_year, int score) {
        this.name = name;
        this.actor = actor;
        this.l_year = l_year;
        this.score = score;
        this.director = director;
    }

    public String toString() {
        return String.format("영화 제목 : %s\n영화 감독 : %s\n주연배우 : %s\n개봉 연도 : %d\n평점 : %d", this.name, this.director,
                this.actor, this.l_year, this.score);
    }
}//
