package offer;

public class offer05 {
    public String replaceSpace(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                stringBuffer.append('%');
                stringBuffer.append('2');
                stringBuffer.append('0');
            } else {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }
}
