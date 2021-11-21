public class Main {
    public static void main(String[] args) throws Exception {
        TeachingAssistant ta = new TeachingAssistant("Youssef Eid", 3559.64f, (short) 2);
        System.out.println(ta.toString());

        Doctor prof = new Doctor("Ahmed Helmy", 7389.12f, (short) 9, "CS");
        System.out.println(prof.toString());

        AbstractFactory factory = FactoryProducer.getStaff("CS");
        Staff csTeachingAssistant = factory.getStaff("TeachingAssistant");
        System.out.println(csTeachingAssistant.toString());

        factory = FactoryProducer.getStaff("IS");
        Staff isDoctor = factory.getStaff("Doctor");
        System.out.println(isDoctor.toString());

        factory = FactoryProducer.getStaff("IT");
        Staff itDoctor = factory.getStaff("Doctor");
        System.out.println(itDoctor.toString());


    }
}
