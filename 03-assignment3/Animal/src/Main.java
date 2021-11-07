public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Animal Implementation!");
        Mammal cat = new Mammal(4, "Fishes");
        cat.eat();
        cat.travel("North");
        System.out.println(cat.getNoOfLegs());
        System.out.println(cat.getFavFood());
    }
}
