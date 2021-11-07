public class Mammal implements Animal {
    private int noOfLegs;
    private String favFood;


    public Mammal(int noOfLegs, String favFood) {
        this.noOfLegs = noOfLegs;
        this.favFood = favFood;
    }


    @Override
    public void eat() {
        System.out.println("eating..."); 
    }

    @Override
    public void travel(String dir) {
        System.out.println("Travelling to " + dir);
    }
    public int getNoOfLegs() {
        return this.noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getFavFood() {
        return this.favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
    
}