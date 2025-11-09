package NetflixApp.PaymentMethod;
import java.util.Date;

public class paymentMethod {
    private String holderName;
    private Date expiration;
    private String type;
    private int number;

    public paymentMethod(String holderName, Date expiration, String type,int number){
        this.holderName = holderName;
        this.expiration = expiration;
        this.type = type;
        this.number = number;
    }
    
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "\nPayment Mtethode:\n holderName: " + holderName + ", expiration: " + expiration + ", type: " + type + ", number=" + number +"\n";
    }
}