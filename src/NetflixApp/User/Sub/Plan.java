package NetflixApp.User.Sub;

public class Plan {
    private double cost;
    private int screenNum;
    private int downloadDevices;
    private String quality;

    public Plan(double cost, int screenNum, int downloadDevices, String quality){
        this.cost = cost;
        this.screenNum = screenNum;
        this.downloadDevices = downloadDevices;
        this.quality = quality;
    }
    
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getScreenNum() {
        return screenNum;
    }

    public void setScreenNum(int screenNum) {
        this.screenNum = screenNum;
    }

    public int getDownloadDevices() {
        return downloadDevices;
    }

    public void setDownloadDevices(int downloadDevices) {
        this.downloadDevices = downloadDevices;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Plan: \n" +
                "cost: " + cost +
                ", screenNum: " + screenNum +
                ", downloadDevices: " + downloadDevices +
                ", quality: " + quality +
                "\n";
    }
}
