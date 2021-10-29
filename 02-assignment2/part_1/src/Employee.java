public class Employee extends Person{
    protected double salary;
    protected String office;
    protected MyDate dateHired;
    
    public Employee(String name, double salary, String office, MyDate dateHired) {
        super(name);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }


    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return this.office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public MyDate getDateHired() {
        return this.dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
    

    @Override
    public String toString() {
        return ("Name: " + getName() + "\t\t Class: " + this.getClass().getName());
    }
    
}
