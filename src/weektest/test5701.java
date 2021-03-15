package weektest;

public class test5701 {
    public boolean areAlmostEqual(String s1, String s2) {

        if (s1.equals(s2)) {
            return true;
        } else {
            int indexOne = 0;
            int indexTwo = s1.length()-1;

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    indexOne = i;
                    break;
                }
            }

            for (int j = s1.length()-1; j > indexOne;j--) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    indexTwo = j;
                    break;
                }
            }

            if (s1.charAt(indexOne) != s2.charAt(indexTwo)) {
                return false;
            } else {
                for (int i = indexOne+1; i < indexTwo; i++) {
                    if (s1.charAt(i) != s2.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}
