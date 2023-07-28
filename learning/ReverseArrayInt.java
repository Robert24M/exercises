package learning;

import java.util.Scanner;

public class ReverseArrayInt {



    public int[] reverseArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of theArray:");
        int n = sc.nextInt();
        int[] theArray = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter theArray element:");
            theArray[i] = sc.nextInt();
        }
        int j = 0;
        int[] theReverseArray = new int[n];
        for (int i = n-1; i >=0; i--){
            theReverseArray[j] = theArray[i];
            j++;
        }
        System.out.println("So, theArray is:");
        for (int i = 0; i < n; i++) {
            if (i== n-1){
                System.out.println(theArray[i] + ".");
            }else
                System.out.print(theArray[i] + ", ");
        }
        System.out.println("Now let the magic begin! theReverseArray is:");

        for (int i = 0; i < n; i++) {
            if (i== n-1){
                System.out.println(theReverseArray[i] + ".");
            }else
                System.out.print(theReverseArray[i] + ", ");
        }
        return theReverseArray;
    }
}
