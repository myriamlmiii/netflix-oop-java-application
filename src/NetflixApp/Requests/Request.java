
package NetflixApp.Requests;
import java.util.Date;

public class Request {
     private String requester;
    private Date dateRequested;
    private String Suggestion;

    public Request(String requester, Date dateRequested, String titleSuggestion) {
        this.requester = requester;
        this.dateRequested = dateRequested;
        this.Suggestion = titleSuggestion;
    }
    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public Date getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(Date dateRequested) {
        this.dateRequested = dateRequested;
    }

    public String getSuggestion() {
        return Suggestion;
    }

    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    @Override
    public String toString() {
        return "\nrequester: " + requester + ", dateRequested: " + dateRequested +", titleSuggestion: " + Suggestion + '\n';
    }
} 