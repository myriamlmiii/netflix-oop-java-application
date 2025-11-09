package NetflixApp.Show;


public class Genres implements java.io.Serializable{
    private String genre;
    
    public Genres(String genres){
        this.genre = genres;
    }

    public void getGenres(String genre){
        this.genre = genre;
    }

    public String setGenres(){
        return genre;
    }

    @Override
    public String toString(){
        return "Genre: " + genre; 
    }

}
