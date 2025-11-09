/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetflixApp.Show.Movies;


import NetflixApp.Show.Genres;
import NetflixApp.Show.MaturityLevel;
import NetflixApp.Show.Show;
import java.util.Date;
import java.util.List;

public class Movie extends Show implements java.io.Serializable {
        int duration; //duration in min
    
        public Movie(String title, Date release_date, String quality, List<Genres> genre, String language, int num_views, double average_rating, List<MaturityLevel> maturity_level, int duration){
            super(title,release_date,quality,genre,language,num_views,average_rating,maturity_level);
            this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "\nType :Movie\t"+ super.toString() + "\tduration=" + duration + '\n';
    }
}

