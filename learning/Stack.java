package learning;

import java.util.Random;
import java.util.Scanner;

public class Stack {

    private int[] arr;
    private int size = 10;
    private int lastElementPos;
    private int nextElementPos = 0;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

public Stack(){
        arr = new int[size];
}

public int get(){
    int temp = arr[lastElementPos];
    if (nextElementPos == 0){
        System.out.println("There is nothing in the stack!");
    }else {
        System.out.println("Removed the last element of the stack!(" + temp + " at pos " + lastElementPos + ")");
        arr[lastElementPos] = 0;
     if(lastElementPos > 0) {
         lastElementPos--;
         nextElementPos--;
     }else{
         nextElementPos--;
     }
    }
    return temp;
}
public void add (int num) {
    if (nextElementPos == size){
        System.out.println("Sorry, the stack is full!");
        System.out.println("Would you like a bigger stack?");
        System.out.println("You get only one single chance to press YES. Any other input will result in eternal damnation!");
        Scanner sc = new Scanner(System.in);
        String trashVar = sc.nextLine();
        if (trashVar.toUpperCase().equals("YES")){
            System.out.println("Bad option. I don't want it, but ok. Would you want to set the size of the new stack?");
            System.out.println("You get only one single chance to press YES. Any other input will result in eternal damnation!");
            trashVar = sc.nextLine();
            int anotherTrashVar;
            if (trashVar.toUpperCase().equals("YES")){
                System.out.println("Bad option. I don't want it, but ok.Enter the size of your new Stack!");
                System.out.println("You get only one single chance to enter a value bigger than " + (int)(size+1) + " and smaller than 100. Be reasonable!");
                anotherTrashVar = sc.nextInt();
                if(anotherTrashVar >99 || anotherTrashVar <6 ){
                    System.out.println("Really?! Ok! BYE!");
                }
                else {
                    System.out.println("Ok. You decided that the size of the new stack will be " + anotherTrashVar + "!");
                    size = anotherTrashVar;
                }
            }else{
                Random r = new Random();
                anotherTrashVar = r.nextInt(100+ 1 - size) + size;
                System.out.println("Ok. The AI decided that the new stack size will be " + anotherTrashVar + "!");
                size = anotherTrashVar;
                System.out.println("Have a nice day!");
            }
            int[] temparr = arr;
            arr = new int[size];
          for(int i = 0; i <arr.length; i++){
              if(i<temparr.length){
              arr[i] = temparr[i];
              } else if (i == temparr.length) {
                  arr[i] = num;
                  lastElementPos++;
                  nextElementPos++;
              }else{
                  arr[i] = 0;
              }
          }
          displayStack();
        }else{
            System.out.println("Ok. Bye");
        }

    }else{
        if (nextElementPos == 0) {
            arr[nextElementPos] = num;
            System.out.println("Added " + num + " at position " + nextElementPos + "!");
            nextElementPos = 1;
            lastElementPos = 0;
        }else {
            arr[nextElementPos] = num;
            System.out.println("Added " + num + " at position " + nextElementPos + "!");
            nextElementPos++;
            lastElementPos++;
        }
    }
}

public void displayStack(){
        for (int j = 0; j< arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
