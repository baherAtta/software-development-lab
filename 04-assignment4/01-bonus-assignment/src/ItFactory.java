public class ItFactory extends AbstractFactory{
    @Override
    Staff getStaff(String staff) {
        if(staff.equalsIgnoreCase("Doctor")) {
            return new Doctor("IT");
        } else if (staff.equalsIgnoreCase("TeachingAssistant")) {
            return new TeachingAssistant("IT");
        } else return null;
    }
    
}
