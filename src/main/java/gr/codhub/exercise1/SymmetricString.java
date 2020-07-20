package gr.codhub.exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class SymmetricString {

    static void addingChars(ArrayList<String> str, String symstring) {
        for (int i = 0; i < symstring.length(); i++) {
            str.add(symstring.charAt(i) + "");
        }

    }

    public static boolean isPalindrome(ArrayList<String> symstring) {
        ArrayList<String> word = new ArrayList<String>();
        word.addAll(symstring);
        Collections.reverse(symstring);
        for (int i = 0; i < symstring.size(); i++) {
            if (!(word.get(i).equals(symstring.get(i)))) {
                return false;
            }
        }
        return true;

    }
}
