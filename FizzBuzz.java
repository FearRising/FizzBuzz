@@ -0,0 +1,85 @@
import java.util.Scanner;
/**
 * Created by Simon on 8/9/2015. What a waste of time that was...
 */
/*
public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++){
            boolean fizzOrBuzz = false;
            if (i % 3 == 0){
                System.out.println("Fizz");
                fizzOrBuzz = true;
            }
            if (i % 5 == 0){
                System.out.println("Buzz");
                fizzOrBuzz = true;
            }
            if (fizzOrBuzz){
                System.out.println();
            }else{
                System.out.println(String.valueOf(i));
            }
        }

    }

}
*/ //One version of "FizzBuzz"

// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //

//Other version that uses %15
public class FizzBuzz{
    public static void main(String[] args) {

        System.out.println("Enter a number to count to and play FizzBuzz"); // Welcome screen!

        Scanner input = new Scanner(System.in);
        int userValue = Integer.parseInt(input.nextLine());

        //This is short for:
        //String userInput = input.nextLine();
        //int userValue = Integer.parseInt(userInput)

        for (int i = 0; i <= userValue; i++){
            if (i % 15 == 0){
                System.out.println(i + " FizzBuzz!");
            }else if(i % 3 == 0){
                System.out.println(i + " Fizz");
            }else if(i % 5 == 0){
                System.out.println(i + " Buzz");
            } else{
                System.out.println(String.valueOf(i));
            }
        }
    }
}
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //

/* Example of output
0 FizzBuzz!
1
2
3 Fizz
4
5 Buzz
6 Fizz
7
8
9 Fizz
10 Buzz
11
12 Fizz
13
14
15 FizzBuzz!
16
17
18 Fizz
19
20 Buzz
 */

