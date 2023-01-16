package jianzhi2;

import java.util.HashMap;

class LRUCache {
    HashMap<Integer, Node> map;
    int cap;
    DoubleLinkedList cache;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        cap = capacity;
        cache = new DoubleLinkedList();
    }

    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }
        int value = map.get(key).val;
        put(key, value);
        return value;
    }

    public void put(int key, int value) {
        Node newNode = new Node(key, value);
        if(map.containsKey(key)) {
            // 这里是删除之前已经存在在map中的Node，所以是通过map.get()方法取找原来的节点
            cache.delete(map.get(key));
            cache.addFirst(newNode);
            map.put(key, newNode);
        } else {
            if(cap == map.size()) {
                int k = cache.deleteLast();
                map.remove(k);
            }
            cache.addFirst(newNode);
            map.put(key, newNode);
        }
    }
}

class DoubleLinkedList {
    Node head;
    Node tail;
    public DoubleLinkedList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.nxt = tail;
        tail.pre = head;
    }
    public void addFirst(Node node) {
        node.nxt = head.nxt;
        node.pre = head;
        head.nxt.pre = node;
        head.nxt = node;
    }
    public int delete(Node n) {
        int index = n.key;
        n.nxt.pre = n.pre;
        n.pre.nxt = n.nxt;
        return index;
    }
    public int deleteLast() {
        if(head.nxt == tail) {
            return -1;
        }
        return delete(tail.pre);
    }
}

class Node {
    public int key;
    public int val;
    public Node pre;
    public Node nxt;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */