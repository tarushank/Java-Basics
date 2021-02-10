/*
 * @Author: Tarushank
 * @Purpose: Showing the implementation of a method.
 */
package Basics.Methods;

public class Method {

    //You can name the method-name anything you want.
    public void methodImplementation() {
        System.out.println("Printing the statement from method.");
    }

    //Static implementation without having to create an instance of the class.
    public static void staticMethodImplementation() {
        System.out.println("Printing the statement from static-method.");
    }

    public static void main(String[] args) {
        //Calling the method after creating an instance of the class.
        Method method = new Method();
        method.methodImplementation();

        //Calling the method without creating an instance.
        //Static method.
        staticMethodImplementation();
    }
}
