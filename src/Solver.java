/**This class has 2 different methods for solving the SPA problem
 * 
 * @author Eruvisu
 */
public class Solver {

    public int[] matching1 = new int[Problem.numberOfStudents];
    public int[] matching2 = new int[Problem.numberOfStudents];

    public Solver() {
        for (int i = 0; i < Problem.numberOfStudents; i++) {
            matching1[i] = 0;
            matching2[i] = 0;
        }
    }

    
    /**First come, first serve
    the first student that requests a project, gets it.
    this solution disregards the preferences of the lecturer.
    */
    public int[] Solver1(Student stud[], Lecturer[] lect, Project[] proj) {
        int pref[] = stud[0].getPreferences();
        proj[pref[0] - 1].setStudent(1);
        stud[0].setProjectNumber(pref[0] - 1);
        matching1[0] = pref[0];

        for (int i = 1; i < Problem.numberOfStudents; i++) {
            pref = stud[i].getPreferences();
            int length = pref.length;
            for (int j = 0; j < length; j++) {
                if (proj[pref[j] - 1].getStudent() == 0) {
                    proj[pref[j] - 1].setStudent(i + 1);
                    stud[i].setProjectNumber(pref[j]);
                    matching1[i] = pref[j];
                    break;
                }
            }
        }
        return matching1;

    }

    /**First come, first serve
    the first student that requests a project, gets it.
    this solution takes into account the preferences of the lecturer.
    so if a students wants a project that it's already taken, it will be given 
    to him if he is higher in the lecturer's ranking
    */
    public int[] Solver2(Student[] stud, Lecturer[] lect, Project[] proj) {
        int prefs[] = stud[0].getPreferences();
        proj[prefs[0] - 1].setStudent(1);
        stud[0].setProjectNumber(prefs[0] - 1);
        matching2[0] = prefs[0];
        int OK = 1;
        while (OK != 0) {
            OK = 0;
            for (int i = 1; i < Problem.numberOfStudents; i++) {
                prefs = stud[i].getPreferences();
                int length = prefs.length;
                for (int j = 0; j < length; j++) {
                    if (proj[prefs[j] - 1].getStudent() == 0) {
                        proj[prefs[j] - 1].setStudent(i + 1);
                        stud[i].setProjectNumber(prefs[j]);
                        matching2[i] = prefs[j];
                        break;
                    } else if (this.VerifPref(proj[prefs[j] - 1], lect, i)) {
                        int aux = proj[prefs[j] - 1].getStudent();
                        proj[prefs[j] - 1].setStudent(i + 1);
                        stud[i].setProjectNumber(prefs[j]);
                        matching2[i] = prefs[j];
                        stud[aux - 1].setProjectNumber(0);
                        OK = 1;
                        break;
                    }
                }

            }
        }
        return matching2;

    }

    
    /**This method checks to see if a student has a higher ranking than another
    *student
    */
    public boolean VerifPref(Project p, Lecturer[] l, int student1) {
        int student2 = p.getStudent();
        int lecturerName = p.getLecturer();
        int[] prefl = l[lecturerName - 1].getPreferences();
        int pozStud1 = -1;
        int pozStud2 = -1;
        for (int i = 0; i < prefl.length; i++) {
            if (student1 == prefl[i]) {
                pozStud1 = i;
            }
            if (student2 == prefl[i]) {
                pozStud2 = i;
            }
        }
        if (pozStud1 == -1 && (pozStud2 == -1 || pozStud2 >= 0)) {
            return false;
        } else if (pozStud2 == -1 && pozStud1 >= 0) {
            return true;
        } else if ((pozStud1 >= 0 && pozStud2 >= 0) && (pozStud1 < pozStud2)) {
            return true;
        } else {
            return false;
        }
    }

}
