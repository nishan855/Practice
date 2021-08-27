/////////////////////////////////////////////////////////////////////////////////////
//     CountLetters
///////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class CountLetters {

    // Scanner class for input
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){


        System.out.print("Enter a String to count: ");
        String str=sc.next();

        //calling method
        countRecurring(str);

    }

    private static void countRecurring(String str) {

        //track variables
        char currentLetter=str.charAt(0);  //setting to first character
        int currCount=1;  //setting to 1 occurrence


        //looping upto second last element of string
        for(int i=0; i<str.length()-1;i++){

            //if recurring elements are same keep incrementing count
            if(str.charAt(i)==str.charAt(i+1)){
                currCount+=1;
            }

            //print the letter and total count
            else{
                System.out.print(currentLetter);
                System.out.print(currCount);

                //sets letter to next and count to 1
                currentLetter=str.charAt(i+1);
                currCount=1;
            }
        }

        //if the last element is not equal to scoond last element, its not counted. so, we have to consider the last element with out recurring occurance.

        if (str.charAt(str.length()-1) != str.charAt(str.length()-2)){
            System.out.print(str.charAt(str.length()-1)+"1");
        }
    }
}
