package hash;

public class test706 {
    boolean[] k = null;
    int[] v = null;

    /** Initialize your data structure here. */
    public test706() {
        k = new boolean[1000001];
        v = new int[1000001];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        k[key] = true;
        v[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return k[key] ? v[key] : -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        k[key] = false;
    }
}
