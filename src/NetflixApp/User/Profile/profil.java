package NetflixApp.User.Profile;

import NetflixApp.Show.Show;
import java.util.List;

public class profil {
    
    private String name;
    private int maturityLevelRestriction;
    private String email;       
    private boolean toNotify;;         
    private boolean playback;       
    private boolean subtitles;      
    private List<Show> favorites;   
    private List<Show> blocked;     
    private language ProfileLanguage;

    public profil(String name, int maturityLevelRestriction, String email, language ProfileLanguage) {
        this.name = name;
        this.maturityLevelRestriction = maturityLevelRestriction;
        this.email = email;
        this.ProfileLanguage = ProfileLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaturityLevelRestriction() {
        return maturityLevelRestriction;
    }

    public void setMaturityLevelRestriction(int maturityLevelRestriction) {
        this.maturityLevelRestriction = maturityLevelRestriction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isToNotify() {
        return toNotify;
    }

    public void setToNotify(boolean toNotify) {
        this.toNotify = toNotify;
    }

    public language getProfileLanguage() {
        return ProfileLanguage;
    }

    public void setLanguage(language language) {
        this.ProfileLanguage = language;
    }

    public boolean getPlayback() {
        return playback;
    }

    public void setPlayback(boolean playback) {
        this.playback = playback;
    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }

    public List<Show> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Show> favorites) {
        this.favorites = favorites;
    }

    public List<Show> getBlocked() {
        return blocked;
    }

    public void setBlocked(List<Show> blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "\nname: " + name + ", maturityLevelRestriction: " + maturityLevelRestriction + ", email: " + email + ", to notif: " + toNotify + ", language: " + ProfileLanguage + ", playback: " + playback + ", subtitles: " + subtitles + ", favorites: " + favorites + ", blocked: " + blocked+ "\n";
    }
}