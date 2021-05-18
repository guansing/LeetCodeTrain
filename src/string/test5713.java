package string;

public class test5713 {
    public int[] numDifferentIntegers(String word) {
        int[] newWord = new int[1000];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!Character.isDigit(c)) {
                int curDigit = (c - '0') * 0;
                newWord[i] = curDigit;

            } else {
                int cutInt = c - '0';
                newWord[i] = cutInt;
            }
        }
return newWord;


    }
}
