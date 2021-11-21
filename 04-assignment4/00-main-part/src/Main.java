public class Main {
    public static void main(String[] args) throws Exception {
        TeachingAssistant ta = new TeachingAssistant("Youssef Eid", 3559.64f, (short) 2);
        System.out.println(ta.toString());

        Doctor prof = new Doctor("Ahmed Helmy", 7389.12f, (short) 9, "CS");
        System.out.println(prof.toString());

        Staff member = MemberFactory.getStaffMember("TeachingAssistant");
        System.out.println(member.toString());          // Notice the output doesn't have Department, which is a charachtaristic of Doctor

        Staff member2 = MemberFactory.getStaffMember("doctor");
        System.out.println(member2.toString());          // Notice the output have Department, which is a charachtaristic of Doctor

    }
}
