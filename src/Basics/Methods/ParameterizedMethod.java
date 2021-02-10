/*
 * @Author: Tarushank
 * @Purpose: Showing the implementation of parameterized method.
 */

package Basics.Methods;

public class ParameterizedMethod {

    //Method with parameters to perform certain action.
    //Eg: Printing the number.
    public static void print(int number) {
        System.out.println("Number: " +number);
    }

    public static void main(String[] args) {
        //Calling the method.
        print(12);
        //You can call the methods any number of times.
        print(22);
    }
}
