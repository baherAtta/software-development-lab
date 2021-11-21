public class Doctor implements Staff{
    private String name;
    private float salary;
    private short yearOfWork;
    private String department;


    public Doctor() {
        this.name = "";
        this.salary = 0.0f;
        this.yearOfWork = 0;
        this.department = "";
    }
    
    public Doctor(String department) {
        this.department = department;
    }

    public Doctor(String name, float salary, short yearOfWork, String department) {
        this.name = name;
        this.salary = salary;
        this.yearOfWork = yearOfWork;
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
    
    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
        return "{ Doctor: " +
            " name='" + getName() + "'" +
            ", salary='" + getSalary() + "'" +
            ", yearOfWork='" + getYearsOfWork() + "'" +
            ", department='" + getDepartment() + "'" +
            "}";
    }

}
