
package NetflixApp.Show;

 public class MaturityRating implements java.io.Serializable{

    private final String ratingReason;

    public MaturityRating(String ratingReason) {
        this.ratingReason = ratingReason;
    }

    public String getRatingReason() {
        return ratingReason;
    }

    @Override
    public String toString() {
        return "\n ratingReason: " + ratingReason;
    }

    }


