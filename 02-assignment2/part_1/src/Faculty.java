public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String officeHours, String rank) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    

    public String getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + "\t\t Class: " + this.getClass().getName());
    }
}
