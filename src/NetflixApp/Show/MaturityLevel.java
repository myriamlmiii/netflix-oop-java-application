package NetflixApp.Show;

public class MaturityLevel implements java.io.Serializable{
    private int min_age;
    private String description;
    
    public MaturityLevel(int min_age,String description){
        this.min_age = min_age;
        this.description = description;
    }
    
    public int getMinAge() {
        return min_age;
    }

    public void setMinAge(int min_age) {
        this.min_age = min_age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "\nmin Age" + min_age + "\tDescription: " + description;
    }
}
