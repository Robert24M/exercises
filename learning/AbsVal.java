package learning;

import java.util.Scanner;

public class AbsVal {

    private float num;
    private float absVal;

    public float absoluteValue(){
        getNum();
        if( num < 0){
            absVal = num- num -num;
        }else{
            absVal = num;
        }

        System.out.println("The absolute value of "+ num + " is " + absVal + "! ");
        return absVal;
    }



    private float getNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num:");
        num = sc.nextFloat();
        sc.nextLine();
        return num;
    }


}
