/*3. Duke përdorur rekursionin implementoni një metodë që gjen të
gjitha anagramat e një stringu të dhënë str.*/

import java.util.ArrayList;

public class Anagram_ush3 {
    public static void generateAnagrams(String str, String result, ArrayList<String> anagrams) {
        if (str.isEmpty()) {
            if (!anagrams.contains(result)) {
                anagrams.add(result);
                System.out.println(result);
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generateAnagrams(remaining, result + ch, anagrams);
        }
    }

    public static void main(String[] args) {
        String input = "ana";
        ArrayList<String> anagrams = new ArrayList<>();
        generateAnagrams(input, "", anagrams);
    }
}

