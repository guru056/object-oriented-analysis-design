package com.playalong.HashmapImplementation;

class Node<K,V> {

    K key;
    V value;
    Node next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}
