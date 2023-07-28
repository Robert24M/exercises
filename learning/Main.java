package learning;

public class Main {
    public static void main(String[] args) {




    

        Stack test = new Stack(5);
    for (int i = 0; i < 6; i++){
        test.add(i+5);
    }
        for (int i = 0; i < 6; i++){
            test.get();
        }
        for (int i = 0; i < 10; i++){
            test.add(i+5);
        }
        test.displayStack();
    }


}