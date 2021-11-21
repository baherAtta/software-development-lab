public class FactoryProducer {
    public static AbstractFactory getStaff(String department) {
        if(department.equalsIgnoreCase("IS")) return new IsFactory();
        else if (department.equalsIgnoreCase("CS")) return new CsFactory();
        else if (department.equalsIgnoreCase("IT")) return new ItFactory();
        else return null;

    }
}
