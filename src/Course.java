import java.util.ArrayList;
import java.util.List;

public class Course {
    public String title;
    public String crn;
    private int cap;

    List<Section> stringList = new ArrayList<>();


    public Course(String title, String crn, int cap) {
        this.title = title;
        this.crn = crn;
        this.cap = cap;
    }

    // Getter 和 Setter 方法
    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = title;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public  int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", crn: " + crn + ", cap: " +  cap);
    }
}
