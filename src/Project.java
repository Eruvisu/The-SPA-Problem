
public class Project {

    private int projectNumber;
    private int lecturer;
    private int student;

    public Project() {
        this.lecturer = 0;
        this.student = 0;
    }

    public void setProjectNumber(int x) {
        this.projectNumber = x;
    }

    public void setLecturer(int x) {
        this.lecturer = x;
    }

    public void setStudent(int x) {
        this.student = x;
    }

    public int getProjectNumber() {
        return projectNumber;
    }

    public int getLecturer() {
        return lecturer;
    }

    public int getStudent() {
        return student;
    }
}
