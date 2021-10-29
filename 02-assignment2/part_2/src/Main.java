public class Main {
    public static void main(String[] args) throws Exception {
        Subject math = new Subject("MA101", "Math 101", 3);
        Subject cs = new Subject("CS101", "Computer Science 101", 3);
        Subject it = new Subject("IT 101", "Information Technology 101", 2);
        Subject algos = new Subject("AL101", "Algorithms 101", 2);
        Subject[] subjects = {math,cs,it,algos};
        Address address = new Address(21, "Minia", "Egypt");

        Student std = new Student("Youssef Abu Elmagd", 1416199, 3.42f, subjects, address);
        System.out.println("ID: " + std.getStudentID());
        System.out.println("Name: " + std.getStudentName());
        System.out.println("GPA: " + std.getStudentGPA());
        System.out.println(std.toString());
    }
}
