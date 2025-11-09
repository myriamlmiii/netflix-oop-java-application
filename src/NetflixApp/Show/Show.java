package NetflixApp.Show;


import java.util.List;
import java.util.Date;

public class Show {
    private String title;                  
    private Date release_date;      
    private String quality;                      
    private List<Genres> genres;                 
    private String language;                        
    private int num_views;                        
    private String synopsis;                     
    private double average_rating;               
    private List<MaturityLevel> maturity_levels;

    public Show(String title, Date release_date, String quality, List<Genres> genre, String language, int num_views, double average_rating, List<MaturityLevel> maturity_level){
        this.title = title;
        this.release_date = release_date;
        this.quality = quality;
        this.genres = (List<Genres>) genre;
        this.language = language;
        this.num_views = num_views;
        this.average_rating = average_rating;
        this.maturity_levels = (List<MaturityLevel>) maturity_level;
    }                     
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNum_views() {
        return num_views;
    }

    public void setNum_views(int num_views) {
        this.num_views = num_views;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }

    public List<MaturityLevel> getMaturity_levels() {
        return maturity_levels;
    }

    public void setMaturity_levels(List<MaturityLevel> maturity_levels) {
        this.maturity_levels = maturity_levels;
    }
    
     @Override
    public String toString() {
        return "title: "+title+ "\trelease_date: "+release_date.getTime()+ "\tquality: "+quality+ "\tgenres: "+genres+ "\tlanguage: "+language;
    }
 }