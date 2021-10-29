import java.util.Arrays;

public class Student {
    private String studentName;
    private int studentID;
    private float studentGPA;
    Subject[] subjects;
    Address address;

    public Student() {
        this.studentName = "Unidentified";
        this.studentID = 0;
        this.studentGPA = 1.0f;
    }
    public Student(String studentName) {
        this.studentName = studentName;
        this.studentID = 0;
        this.studentGPA = 1.0f;
    }
    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGPA = 1.0f;
    }
    public Student(String studentName, int studentID, float studentGPA, Subject[] subjects) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
        this.subjects = subjects;
    }
    

    public Student(String studentName, int studentID, float studentGPA, Subject[] subjects, Address address) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
        this.subjects = subjects;
        this.address = address;
    }


    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public float getStudentGPA() {
        return this.studentGPA;
    }

    public void setStudentGPA(float studentGPA) {
        this.studentGPA = studentGPA;
    }

    public Subject[] getSubjects() {
        return this.subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }




    @Override
    public String toString() {
        return "{" +
            " studentName='" + getStudentName() + "'" +
            ",\n studentID='" + getStudentID() + "'" +
            ",\n studentGPA='" + getStudentGPA() + "'" +
            ",\n subjects='" + Arrays.toString(getSubjects()) + "'" +
            ",\n address='" + getAddress() + "'" +
            "}";
    }



}
