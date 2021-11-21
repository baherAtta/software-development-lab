public class MemberFactory {
    public static Staff getStaffMember(String desiredObject) {
        if(desiredObject.equalsIgnoreCase("TeachingAssistant"))
            return new TeachingAssistant();
        else if(desiredObject.equalsIgnoreCase("Doctor")) 
            return new Doctor();
        else return null;
    }   
}
