package gr.codhub.exercise1;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /**
         * This is the main Class that is testing
         * if each Class(exercises 1,2,3...)
         * is executing correctly
         */

        //Printing the prime numbers of a list
        PrimeNumbers prime = new PrimeNumbers(10);
        prime.printList();

        //Eliminating the duplicates of a list
        DuplicateList dl = new DuplicateList();
        dl.listEliminator();

        //Sorting a number in Ascending order
        NumberAsc na = new NumberAsc(4214);
        na.printList();

        //Implementation of a stack with java code
        Stack stack = new Stack();

        stack.push('a');       //inserting "a" in stack
        stack.push('v');       //inserting "v" in stack

        System.out.println(stack.list);

        stack.pop();        //removing "v" from list

        stack.push('c');        // Inserting "c" in the stack

        stack.peek(); //printing the top element of the stack

        //Reversing a string
        String str = "Codehub";
        ReverseString rstr = new ReverseString();
        str = rstr.reverse(str);        // string is immutable

        System.out.println("Reversed string is: " + str);

        //checking if a string is symmetrical
        SymmetricString symstr = new SymmetricString();

        if (symstr.isSymmetric("abba"))
            System.out.print("Yes");
        else
            System.out.print("No");


    }
}

