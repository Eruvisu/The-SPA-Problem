
public class Student extends Person {

    private int projectNumber;

    public Student() {
        projectNumber = 0;
    }

    @Override
    public boolean isFree() {
        if (this.projectNumber == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void setProjectNumber(int x) {
        this.projectNumber = x;
    }
}
