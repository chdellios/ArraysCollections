package gr.codhub.exercise1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateList {
    ArrayList<String> list;

    public DuplicateList() {
        list = new ArrayList<>();
    }

    public void listEliminator() {

        list.add("C");
        list.add("D");
        list.add("E");
        list.add("C");
        list.add("B");
        list.add("D");

        System.out.println(list);

        list = (ArrayList<String>) list.stream().distinct().collect(Collectors.toList());

        System.out.println(list);
    }
}