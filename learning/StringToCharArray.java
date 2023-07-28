package learning;

import java.util.Scanner;

public class StringToCharArray {


    public void turnStringIntoCharArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your string:");
        String theString = sc.nextLine();
        char[] theArray = new char[theString.length()];

        for (int i = 0; i < theString.length(); i++){
            theArray[i] = theString.charAt(i);
        }
        System.out.print("Your array of chars is: ");
        for (char theChar : theArray) {
            System.out.println(theChar);

        }


    }




}
