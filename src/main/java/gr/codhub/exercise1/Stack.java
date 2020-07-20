package gr.codhub.exercise1;


import java.util.ArrayList;

public class Stack {
    ArrayList<Character> list;

    public Stack() {

        list = new ArrayList<>();
    }

    public void push(Character st) {
        list.add(st);

    }

    public char pop() {
        if (list.size() == 0)
            throw new IllegalStateException("Stack is empty");
        char c = list.remove(list.size() - 1);


        return c;
    }

    public void peek() {
        System.out.println(list.get(list.size() - 1));

    }

}