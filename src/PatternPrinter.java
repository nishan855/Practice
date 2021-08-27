////////////////////////////////////
//     2. Pattern Printing
///////////////////////////////////
public class PatternPrinter {

    //number of rows hardcoded to 5
    private static final int ROWS= 5;


    public static void main(String[] args){
        //calling print method to print
        printPatterns(ROWS);


    }

    //method for printing patterns
    public static void printPatterns(int rows){

        //loops to decide number of rows
        for(int i=0;i<rows;i++){

            // loop for number of * to print in each row
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //line gap after each row
            System.out.println();
        }

    }
}
