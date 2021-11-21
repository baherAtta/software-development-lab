public class CsFactory extends AbstractFactory{
    @Override
    public Staff getStaff(String staff) {
        if(staff.equalsIgnoreCase("Doctor")) {
            return new Doctor("CS");
        } else if (staff.equalsIgnoreCase("TeachingAssistant")) {
            return new TeachingAssistant("CS");
        } else return null;
    }
    
}
