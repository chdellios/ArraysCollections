package gr.codhub.exercise1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    ArrayList<Integer> list;
    ArrayList<Integer> list2;


    public PrimeNumbers(int nums) {

        list = new ArrayList<Integer>();
        list2 = new ArrayList<Integer>();
        generateList(nums);
    }

    private void generateList(int nums) {
        IsPrime pr = new IsPrime();
        for (int i = 1; i <= nums; i++) {
            list.add(i);
        }
        System.out.println("List with all numbers up to 10");
        System.out.println(list);
        for (int i = 1; i <= nums; i++) {
            if (pr.isPrime(i)) {
                list2.add(i);
            }

        }
    }

    public void printList() {
        System.out.println("Prime numbers of the list");
        System.out.println(list2);
    }
}

