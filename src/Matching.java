
public class Matching {
    
    private int[] solution1;
    private int[] solution2;
    
    Student[] st;
    Lecturer[] le;
    Project[] pj;
    Problem pb;
    Solver solv;
    
    public Matching() {
        this.st = new Student[pb.numberOfStudents];
        this.le = new Lecturer[pb.numberOfLecturers];
        this.pj = new Project[pb.numberOfProjects];
        this.pb = new Problem();
        this.solv = new Solver();
        for (int i = 0; i < pb.numberOfStudents; i++) {
            st[i].setPreferences(pb.S[i]);
            solution1[i] = 0;
            solution2[i] = 0;
        }
        for (int i = 0; i < pb.numberOfLecturers; i++) {
            le[i].setPreferences(pb.L[i]);
            int length = pb.LP[i].length;
            for (int j = 0; j < length; j++) {
                pj[pb.LP[i][j]].setProjectNumber(pb.LP[i][j]);
                pj[pb.LP[i][j]].setLecturer(i + 1);
            }
        }
    }
    
    public void setSolution1() {
        solution1 = solv.Solver1(st, le, pj);
    }
    
    public void setSolution2() {
        solution2 = solv.Solver2(st, le, pj);
    }
    
    public int[] getSolution1() {
        return solution1;
    }
    
    public int[] getSolution2() {
        return solution2;
    }
}
