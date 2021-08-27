//////////////////////////////////////
//     3. Permutation of string
/////////////////////////////////////


import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

////   Duplication is not removed yet///////

public class StringPermutation {
   public static void main(String[] args) {

      // Scanner class for input
      Scanner sc = new Scanner(System.in);

      //system input
      System.out.print("Enter a String to find permutation: ");
      String str1=sc.next();

      System.out.println("Permutations of " + str1+ ": \n" + getPermutation(str1));


   }

   public static ArrayList<String> getPermutation(String str) {

      // arralist to hold permutations
      ArrayList<String> perm =new ArrayList<String>();

      //base condition for recursion
      if (str.length() == 0) {
         perm.add("");
         return perm;
      }

      //  track the first character
      char currChar = str.charAt(0);

      // getting other substrings
      String substr = str.substring(1);

      // recursive call to get permutation of other substring
      ArrayList<String> items = getPermutation(substr);

      // enhanced loop to access each elements of the list
      for (String s : items) {
         // loop again for individual items
         for (int i = 0;i<=s.length();i++){

            // insert the permutation to list
            perm.add(s.substring(0, i) + currChar + s.substring(i));
         }
      }
      return perm;
   }

}
