package learning;

import java.util.Scanner;

public class CheckIfPalindrome {
    String theReverseWord = "";
    public void checkIfPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the word you want to check: ");
        String theWord = sc.nextLine();

        for (int i = theWord.length()-1; i >= 0; i--){
            theReverseWord = theReverseWord + theWord.charAt(i);
        }

        System.out.println("The reverse of your word is: " + theReverseWord);
        if (theWord.equals(theReverseWord)){
            System.out.println("Got a lucky palindrome over here!");
        }else
            System.out.println("It seems your word is not a palindrome!");



    }


}
