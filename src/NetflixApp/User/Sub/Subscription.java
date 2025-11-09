package NetflixApp.User.Sub;

import java.util.Date;

public class Subscription {
    private final Date subscribed;
    private Date canceled;
    private String cancelReason;
    private Plan currentPlan; 

    public Subscription(Date subscribed, Plan currentPlan, Date canceled, String cancelReason) {
        this.subscribed = subscribed;
        this.canceled = canceled;
        this.currentPlan = currentPlan;
        this.cancelReason = cancelReason;
    }
    public Date getCanceled() {
        return canceled;
    }

    public void setCanceled(Date canceled) {
        this.canceled = canceled;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Plan getCurrentPlan() {
        return currentPlan;
    }

    public void setCurrentPlan(Plan currentPlan) {
        this.currentPlan = currentPlan;
    }

    @Override
    public String toString() {
        return "Subscribed: \n" + "current Plan: " + currentPlan+ subscribed + ", canceled: " + canceled + ", cancelReason: " + cancelReason;
    }
}
