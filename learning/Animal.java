package learning;

public class Animal {
    private String picture;
    private String food;
    private double hunger;
    private int boundaries;
    private int location;
    public Animal(String picture, String food, double hunger, int boundaries, int location) {
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
        this.boundaries = boundaries;
        this.location = location;
    }


    public void makeNoise(){
        System.out.println("Animal makes noise.");
    }
    public void eat(){
        System.out.println("Animal eats.");
    }
    public void sleep(){
        System.out.println("Animal sleeps.");
    }
    public void roam(){
        System.out.println("Animal roams.");
    }





}
