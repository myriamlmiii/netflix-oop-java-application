/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetflixApp.Show;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class ShowCollection {
    private List<Show> shows;

    public ShowCollection() {
        shows = new ArrayList<>();
    }

    public void add(Show show) {
        shows.add(show);
    }

    public boolean remove(Show show) {
        return shows.remove(show);
    }

    public List<Show> searchByTitle(String title) {
        return shows.stream().filter(show -> show.getTitle().equalsIgnoreCase(title)).collect(Collectors.toList());
    }

    public void modify(Show oldShow, Show newShow) {
        int index = shows.indexOf(oldShow);
        if (index != -1) {
            shows.set(index, newShow);
        }
    }

    public void sortShowsByTitle() {
        shows.sort(Comparator.comparing(Show::getTitle));
    }

    @Override
    public String toString() {
        return shows.stream()
                .map(Show::toString)
                .collect(Collectors.joining("\n"));
    }
    
}
