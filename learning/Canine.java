package learning;

public class Canine extends Animal{


    public Canine(String picture, String food, double hunger, int boundaries, int location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    public void makeNoise(){
        System.out.println("Canine makes noise.");
    }
    public void eat(){
        System.out.println("Canine eats.");
    }

    public void roam() {
        System.out.println("Canine roams.");
    }



}
