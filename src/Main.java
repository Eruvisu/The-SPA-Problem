/**
 * To my Future Self!!!
This is your first Java program with classes.You've tried to solve 
The Student-Project Allocation Problem (SPA).
 */

public class Main {

    
    public static void main(String[] args) {
        int[] sol1, sol2;
        Matching match = new Matching();
        match.setSolution1();
        match.setSolution2();
        sol1 = match.getSolution1();
        sol2=match.getSolution2();
        for (int element : sol1) {
            System.out.println("Studentul "+element+"a primit proiectul "+sol1[element]);
        }
        for(int element:sol2){
            System.out.println("Studentul "+element+"a primit proiectul "+sol2[element]);
        }

    }
    /**Override for the toString() method
    //Now it prints a string
    */
@Override
    public String toString() {
        return "Studentul";
    }
}
