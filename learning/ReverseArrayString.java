package learning;

import java.util.Scanner;

public class ReverseArrayString {



    public String[] reverseArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of theArray:");
        int n = sc.nextInt();
        String[] theArray = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++){
            System.out.print("Enter theArray element:");
            theArray[i] = sc.nextLine();
        }
        int j = 0;
        String[] theReverseArray = new String[n];
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