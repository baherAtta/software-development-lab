public class Staff extends Employee{
    private String title;
    
	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + "\t\t Class: " + this.getClass().getName());
    }
}
