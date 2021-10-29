public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person("personX");
        System.out.println(person.toString()+'\n');

        Student student = new Student("studentX", "Freshman");
        System.out.println(student.toString() + '\n');

        MyDate date = new MyDate(2013, 7, 11);

        Employee employee = new Employee("employeeX", 2000, "19 New Cairo, 7th district", date);
        System.out.println(employee.toString() + '\n');

        Staff staff = new Staff("staffX", "Secretary");
        System.out.println(staff.toString() + '\n');

        Faculty faculty = new Faculty("facultyX", "8 AM - 2 PM", "Teaching Assistant");
        System.out.println(faculty.toString() + '\n');

    }
}
