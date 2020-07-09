package com.playalong.ExpiryMap;

class Node<V> {

    private V value;
    private long timestamp;

    public Node( V value, long timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
