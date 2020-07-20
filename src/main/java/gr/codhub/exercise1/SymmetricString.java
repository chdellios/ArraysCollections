package gr.codhub.exercise1;

public class SymmetricString {
    static boolean isSymmetric(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0;
        int j = str.length() - 1;

        // While there are characters toc compare

        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
}
