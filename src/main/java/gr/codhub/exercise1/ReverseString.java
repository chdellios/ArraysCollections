package gr.codhub.exercise1;

public class ReverseString {



    public static String reverse(String str)
    {
        Stack stack = new Stack();
        // base case: if string is null or empty
        if (str == null || str.equals(""))
            return str;

        // create an empty stack of characters


        // push every character of the given string into the stack
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
            stack.push(ch[i]);

        // start from index 0
        int k = 0;

        // pop characters from the stack until it is empty
        while (stack.list.size()!=0)
        {
            // assign each popped character back to the character array
            ch[k++] = stack.pop();
        }

        // convert the character array into string and return it
        return String.copyValueOf(ch);
    }
}
