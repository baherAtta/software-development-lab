public class TeachingAssistant implements Staff {
    private String name;
    private float salary;
    private short yearOfWork;
    private String department;



    public TeachingAssistant() {
    }

    public TeachingAssistant(String department) {
        this.department = department;
    }

    public TeachingAssistant(String name, float salary, short yearOfWork) {
        this.name = name;
        this.salary = salary;
        this.yearOfWork = yearOfWork;
    }

    
    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setYearOfWork(short year) {
        this.yearOfWork = year;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public short getYearsOfWork() {
        return this.yearOfWork;
    }


    @Override
    public String toString() {
        return "{ Teaching Assistant: " +
            " name='" + getName() + "'" +
            ", salary='" + getSalary() + "'" +
            ", yearOfWork='" + getYearsOfWork() + "'" +
            ", department='" + getDepartment() + "'" +
            "}";
    }



}
