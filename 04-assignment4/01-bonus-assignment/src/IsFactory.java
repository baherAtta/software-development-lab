public class IsFactory extends AbstractFactory{
    @Override
    Staff getStaff(String staff) {
        if(staff.equalsIgnoreCase("Doctor")) {
            return new Doctor("IS");
        } else if (staff.equalsIgnoreCase("TeachingAssistant")) {
            return new TeachingAssistant("IS");
        } else return null;
    }
    
}
