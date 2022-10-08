package com.company;
// Create a  class
public class Constructor3 {
        int x;  // Create a class attribute

        // Create a class constructor for the class
//        Note that the constructor name must match the class name, and it cannot have a return type (like void).
        public Constructor3() {
            x = 5;  // Set the initial value for the class attribute x
        }

        public static void main(String[] args) {
            Constructor3 myObj = new Constructor3(); // Create an object of class (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x
        }
    }


