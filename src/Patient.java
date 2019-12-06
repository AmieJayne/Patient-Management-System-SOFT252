public class Patient extends User {

    private char gender;                //M = Male, F = Female
    private int age;

    public Patient(String userID, String name, String address, char gender, int age) {
        super(userID, name, address);
        this.gender = gender;
        this.age = age;
    }

}
