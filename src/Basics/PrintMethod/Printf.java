/*
 * @Author: Tarushank
 * @Purpose: Showing implementation of print()
 *           Showing implementation of println()
 *           Showing implementation of printf()
 */
package Basics.PrintMethod;

import java.util.Calendar;

public class Printf {

    public static void main(String[] args) {
        //Using print() method.
        //Prints the output with the cursor on the same line.
        System.out.print("TESTING - print():Prints statement, but with cursor on the same line.");

        //Using println() method.
        //Prints the output with the cursor on the next line.
        System.out.println("TESTING - println():Prints the output with the cursor on the next line.");

        //Using printf() method.
        //Used for Formatting.
        //Showing different variants of the printf() method.
        System.out.printf("%d",20);
        System.out.println();
        System.out.printf("%f",20.2);
        System.out.println();
        System.out.printf("%C", 'W');
        System.out.println();
        System.out.printf("%S", "hello");

        Calendar cal = Calendar.getInstance();
        System.out.printf("%tB", cal);


    }
}
