package weektest;

public class test5772 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int a = 0;
        int b = 0;
        int c = 0;

        // 将第一个字符串转化为数字
        for (int i = 0; i < firstWord.length(); i++) {
            a = 10 * a + (firstWord.charAt(i) - 'a');
        }

        for (int i = 0; i < secondWord.length(); i++) {
            b = 10 * b + (secondWord.charAt(i) - 'a');
        }

        for (int i = 0; i < targetWord.length(); i++) {
            c = 10 * c + (targetWord.charAt(i) - 'a');
        }

        if (c == a + b) {
            return true;
        } else {
            return false;
        }
    }
}
