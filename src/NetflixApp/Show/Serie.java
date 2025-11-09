/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetflixApp.Show;

//Serie class inheriting from the class Show

import java.util.Date;
import java.util.List;

    public class Serie extends Show{
        int seasons;
        int numEpisode;
   
        public Serie(String title, int seasons, int numEpisode, Date release_date, String quality, List<Genres> genre, String language, int num_views, double average_rating, List<MaturityLevel> maturity_level){
            super(title, release_date, quality, genre, language, num_views, average_rating, maturity_level);
            this.seasons = seasons ;
            this.numEpisode = numEpisode;
        }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getNumEpisode() {
        return numEpisode;
    }

    public void setNumEpisode(int numEpisode) {
        this.numEpisode = numEpisode;
    }
    @Override
    public String toString(){
        return "Type: series\t" + super.toString() + "\tSeasons: " + seasons + "\tepisodes: " + numEpisode;
    }
    }
   