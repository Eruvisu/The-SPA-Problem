
public class Problem {

    static int numberOfStudents = 7;
    static int numberOfLecturers = 3;
    static int numberOfProjects = 8;
    static int S1[] = {1, 7};
    static int S2[] = {1, 2, 3, 4, 5, 6};
    static int S3[] = {2, 1, 4};
    static int S4[] = {2};
    static int S5[] = {1, 2, 3, 4};
    static int S6[] = {2, 3, 4, 5, 6};
    static int S7[] = {5, 3, 8};
    static int L1[] = {7, 4, 1, 3, 2, 5, 6};
    static int L2[] = {3, 2, 6, 7, 5};
    static int L3[] = {1, 7};
    static int L1O[] = {1, 2, 3};
    static int L2O[] = {4, 5, 6};
    static int L3O[] = {7, 8};
    static int[][] S;
    static int[][] L;
    static int[][] LP;

    public Problem() {
        int[][] S = {S1, S2, S3, S4, S5, S6, S7};
        int[][] L = {L1, L2, L3};
        int[][] LP = {L1O, L2O, L3O};
    }
}
