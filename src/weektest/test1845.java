package weektest;

public class test1845 {
    int[] seat = new int[100001];

    public test1845(int n) {
        for (int i = 1; i <= n; i++) {
            seat[i] = 1;
        }
    }

    public int reserve() {
        for (int i = 1; i <= seat.length; i++) {
            if (seat[i] == 1) {
                seat[i] = 0;
                return i;
            }
        }
        return 0;
    }

    public void unreserve(int seatNumber) {
        seat[seatNumber] = 1;
    }
}
