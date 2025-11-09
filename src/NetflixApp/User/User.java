package NetflixApp.User;

import NetflixApp.PaymentMethod.paymentMethod;
import NetflixApp.Requests.Request;
import NetflixApp.User.Profile.profil;

public class User {
    private String phone;
    private profil profiles;
    private Request requests;
    private paymentMethod paymentMethod;

    public User(String phone, profil profiles, Request requests, paymentMethod paymentMethod) {
        this.phone = phone;
        this.profiles = profiles;
        this.requests = requests;
        this.paymentMethod = paymentMethod;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public profil getProfiles() {
        return profiles;
    }

    public void setProfiles(profil profiles) {
        this.profiles = profiles;
    }

    public Request getRequests() {
        return requests;
    }

    public void setRequests(Request requests) {
        this.requests = requests;
    }

    public paymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(paymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "\nphone: " + phone +"\nprofiles: " + profiles.toString() +"\nrequests=" + requests.toString() +"\n paymentMethod=" + paymentMethod.toString();
    }
}
