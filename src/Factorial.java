//////////////////////////////////////////////////////////////////////
////   4. Factorial Calculator
/////////////////////////////////////////////////////////////////////

import java.util.*;
public class Factorial {

    // Scanner class for input
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter a number: ");
        int val=sc.nextInt();

        // printing the permutation
        System.out.print(calculateFactorial(val));

    }

    //recursive method to find fatorial
    private static long calculateFactorial(int val) {
        //when value reaches 0, return 1
        if (val==0) return 1;

        //call the same method with val-1
        else{

            //printing the value in each step
            System.out.print(val);
            System.out.print( (val!=1 )? " *":" =" );

            return val* calculateFactorial(val-1);

        }
    }


}
