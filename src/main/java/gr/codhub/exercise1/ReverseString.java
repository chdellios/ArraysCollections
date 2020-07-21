package gr.codhub.exercise1;

public class ReverseString {


    public static String reverse(String str) {
        Stack stack = new Stack();
        if (str == null || str.equals(""))
            return str;


        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
            stack.push(ch[i]);

        int k = 0;

        while (stack.list.size() != 0) {

            ch[k++] = stack.pop();
        }


        return String.copyValueOf(ch);
    }
}
