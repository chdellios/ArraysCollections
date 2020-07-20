package gr.codhub.exercise1;

import java.util.ArrayList;
import java.util.Collections;


public class NumberAsc {
    ArrayList<Integer> list;

    public NumberAsc(int n) {
        list = new ArrayList<>();
        passNumber(n);
    }

    private void passNumber(int n) {
        for (int i = n; i > 0; i /= 10) {

            list.add(i % 10);
        }

    }

    public void printList() {
        Collections.sort(list);
        System.out.println(list);
    }

}

