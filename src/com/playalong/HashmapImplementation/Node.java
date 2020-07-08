package com.playalong.HashmapImplementation;

import java.util.Objects;

public class Node<K,V> {

    K key;
    V value;
    Node next;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Node node = (Node) o;
//        return key.equals(node.key);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(key);
//    }

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
