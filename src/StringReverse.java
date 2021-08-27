/////////////////////////////////////////////////////////////////////////////
 //  6. Reverse String using stack
////////////////////////////////////////////////////////////////////////////
import java.util.*;
public class StringReverse {

    // Scanner class for input
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter a String to reverse: ");
        String str1=sc.next();

        System.out.println(reverseWithStack(str1));


    }

    private static String reverseWithStack(String str1) {

        //create new stack of character
        Stack<Character> stk= new Stack<Character>();

         String reverse="";

        //adding each character of string in stack
        for(int i=0;i<str1.length();i++) {
            stk.push(str1.charAt(i));
        }

        //poping element out will occur in LIFO, which means lastly added element will pop first

        while(!stk.isEmpty()){
            reverse +=stk.pop();
        }

        return reverse;
    }


}
