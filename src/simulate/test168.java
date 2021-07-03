package simulate;

public class test168 {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while (columnNumber > 0) {
            int last = columnNumber % 26;
            if (last == 0) {
                last = 26;
                columnNumber = columnNumber - 26;
            }
            res = (char)(last+64) + res;
            columnNumber = columnNumber / 26;
        }
        return res;
    }

    public static void main(String[] args) {
        test168 a = new test168();
        String w = a.convertToTitle(701);
        System.out.println(w);

    }
}
