package gr.codhub.exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class SymmetricString {

    static void addingChars(ArrayList<String> str, String symString) {
        for (int i = 0; i < symString.length(); i++) {
            str.add(symString.charAt(i) + "");
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
