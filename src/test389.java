import java.util.HashMap;

public class test389 {
    public char findTheDifference(String s, String t) {
        // 通过查数的方式
//        int[] tCount = new int[26];
//        for (int i = 0; i < t.length(); i++) {
//            char c = t.charAt(i);
//            tCount[c - 'a']++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            tCount[c - 'a']--;
//        }
//        for (int i = 0; i < 26; i++) {
//            if (tCount[i] == 1) return (char)(i+'a');
//        }
//        return 0;

        // 通过求和的方式
        // 分别对s与t的ascii求值，他们之间的差值所对应的就是是char的ascii值
        int as = 0;
        int at = 0;

        for (int i = 0; i < s.length();i++) {
            as+=s.charAt(i);
        }

        for (int i = 0; i < t.length();i++) {
            at+=t.charAt(i);
        }

        return (char) (at-as);



// 下面的错误
//        int sizeS = s.length();
//        int sizeT = t.length();
//        int[] table = new int[26];
//        for (int i = 0;i < sizeS;i++) {
//            char sChar = s.charAt(i);
//            table[sChar - 'a']++;
//        }
//
//        int j;
//        char tChar = ' ';
//
//        for (j = 0;j < sizeT;j++) {
//            tChar = t.charAt(j);
//            table[tChar - 'a']++;
//
//            if (table[tChar - 'a'] < 0) {
//                break;
//            }
//        }
//        return tChar;




    }
}
