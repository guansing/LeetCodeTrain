package greedy;

public class test12 {
    // 贪心存零钱方法
//    public String intToRoman(int num) {
//        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = 0; i < symbols.length; i++) {
//            while (num >= value[i]) {
//                stringBuffer.append(symbols[i]);
//                num = num - value[i];
//            }
//            if (num == 0) {
//                break;
//            }
//        }
//        return stringBuffer.toString();
//    }

    // 暴力解法,硬编码
    public String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(thousands[num / 1000]);
        stringBuffer.append(hundreds[(num % 1000) / 100]);
        stringBuffer.append(tens[(num % 100) / 10]);
        stringBuffer.append(ones[num % 10]);

        return stringBuffer.toString();
    }
}
