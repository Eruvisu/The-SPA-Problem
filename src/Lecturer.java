
public class Lecturer extends Person {

    private int numberOfProjects;
    private int numberOfProjectsTaken;

    public Lecturer() {
        numberOfProjectsTaken = 0;
    }

    @Override
    public boolean isFree() {
        if (this.numberOfProjects > this.numberOfProjectsTaken) {
            return true;
        } else {
            return false;
        }
    }

    public void setNumberOfProjects(int x) {
        this.numberOfProjects = x;
    }

    public void setNumberOfProjectsTaken(int x) {
        this.numberOfProjectsTaken += x;
    }
}
