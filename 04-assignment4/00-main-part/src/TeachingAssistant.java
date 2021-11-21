public class TeachingAssistant implements Staff {
    private String name;
    private float salary;
    private short yearOfWork;


    public TeachingAssistant() {
    }

    public TeachingAssistant(String name, float salary, short yearOfWork) {
        this.name = name;
        this.salary = salary;
        this.yearOfWork = yearOfWork;
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
        return "{" +
            " name='" + getName() + "'" +
            ", salary='" + getSalary() + "'" +
            ", yearOfWork='" + getYearsOfWork() + "'" +
            "}";
    }


}
