package simulate;

import java.util.Stack;

public class test7 {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tmp = x % 10;
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }

            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }

            res = res * 10 + tmp;

            x = x / 10;
        }
        return res;
    }
}
