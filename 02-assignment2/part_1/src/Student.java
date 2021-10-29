public class Student extends Person {

    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    protected String status;
    
    Student(String name) {
        super(name);
    }

    Student(String name, String status) {
        super(name);
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + "\t\t Class: " + this.getClass().getName());
    }
    

}
