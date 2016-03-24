/**A superclass for Lecturer and Student
 * 
 * @author Eruvisu
 */
public abstract class Person {

    private String name, email, phoneNumber;
    private int preferences[];

    public abstract boolean isFree();

    public void setName(String name) {
        this.name = name;
    }

    public String setName() {
        return this.name;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    public String setMail() {
        return this.email;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public String setPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPreferences(int[] pref) {
        preferences = pref;
    }

    public int[] getPreferences() {
        return preferences;
    }
}
