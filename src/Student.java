import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {


    }

    private int studentId = 0;
    private String firstName = null;
    private String lastName = null;
    private String eMail = null;
    private int age = 0;
    private ArrayList<Integer> grades = new ArrayList<>();

    // Constructor

    public void Student(int studentId, String firstName, String lastName, String eMail, int age, ArrayList<Integer> grades) {
        setStudentId(studentId);
        setFirstName(firstName);
        setLastName(lastName);
        setEMail(eMail);
        setAge(age);
        setGrades(grades);
    }


    // Getters

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // Sets
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEMail(String eMail) {
        this.eMail = eMail;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
