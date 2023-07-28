package learning;

public class Dog  extends  Canine{

    public Dog(String picture, String food, double hunger, int boundaries, int location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Dog makes noise.");
    }


}
