package gr.codhub.exercise1;

import java.util.ArrayList;
import java.util.Collections;


public class NumberAsc {
    ArrayList<Integer> list;

    public NumberAsc(int n) {
        list = new ArrayList<>();
        sortingNumber(n);
    }

    private void sortingNumber(int n) {
        for (int i = n; i > 0; i /= 10) {

            list.add(i % 10);
        }

    }

    public void printList() {
        System.out.println("Number");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Number in Asc order");
        System.out.println(list);
    }

}

