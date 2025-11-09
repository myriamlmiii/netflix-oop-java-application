
package NetflixApp.Show;
import java.util.Date;
        
public class Viewing implements java.io.Serializable{
    private Date date;
    private Show show;
    private double rate;

    public Viewing(Date date, Show show, double rate){
        this.date = date;
        this.show = show;
        this.rate = rate;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return  "ViewingDate: " + date + "\n Show: " + show + "\n Rate: " + rate + "\n";
    }
}