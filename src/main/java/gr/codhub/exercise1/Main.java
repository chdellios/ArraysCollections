package gr.codhub.exercise1;

import java.util.ArrayList;
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

        System.out.println("-----------------");
        //Eliminating the duplicates of a list
        DuplicateList dl = new DuplicateList();
        dl.listEliminator();

        System.out.println("-----------------");
        //Sorting a number in Ascending order
        NumberAsc na = new NumberAsc(4214);
        na.printList();


        System.out.println("-----------------");
        //Implementation of a stack with java code
        Stack stack = new Stack();

        stack.push('a');       //inserting "a" in stack
        stack.push('v');       //inserting "v" in stack
        System.out.println("Stack with elements");
        System.out.println(stack.list);
        System.out.println("Executing pop");
        stack.pop();        //removing "v" from list

        stack.push('c');        // Inserting "c" in the stack

        stack.peek(); //printing the top element of the stack
        System.out.println("-----------------");

        //Reversing a string
        System.out.println("String that is going to get reversed");
        String str = "Codehub";
        ReverseString rstr = new ReverseString();
        str = rstr.reverse(str);        // string is immutable

        System.out.println("Reversed string");
        System.out.println(str);
        System.out.println("-----------------");


        //checking if a string is symmetrical
        System.out.println("Checking if a string is palindrome");
        SymmetricString symstr = new SymmetricString();
        String word = "abdaba";
        ArrayList<String> p = new ArrayList<>();
        //Adding String to list char by char
        symstr.addingChars(p, word);
        System.out.println("String " + p);
        if (symstr.isPalindrome(p)) {
            System.out.println("IS not  palindrome!");
        } else {
            System.out.println("is not palindrome!");
        }
        System.out.println();

        System.out.println("-----------------");
        System.out.println("Adding very large numbers");
        AddFunctionality ad = new AddFunctionality();

        System.out.println(ad.addBig(43423423d, 23423432d));
    }


}


