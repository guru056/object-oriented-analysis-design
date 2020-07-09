package com.playalong.ExpiryMap;


import java.util.HashMap;
import java.util.Map;

public class ExpiryMap<K,V> {

    private static final long DEFAULT_TTL = 30; //sec
    private long ttl;
    private int size;
    private Map<K,Node<V>> map;

    /***************  Constructors   *******************/

    public ExpiryMap(long ttl)
    {
        this.map = new HashMap<>();
        this.ttl = ttl;
    }

    public ExpiryMap()
    {
        this.map = new HashMap<>();
        this.ttl = DEFAULT_TTL;
    }

    /***************************************************/

    public void put(K key, V value)
    {
        Node node = this.map.get(key);

        if (node == null) {
            Node newNode = new Node(value, System.currentTimeMillis());
            this.map.put(key, newNode);
            System.out.println("setting key val pair");
            return;
        }

        node.setTimestamp(System.currentTimeMillis());
        node.setValue(value);

        this.map.put(key, node);
        return;
    }

    /*public void put(K key, V value)
    {
        this.put(key,value,this.ttl);
    }*/

    public V get(K key)
    {
        Node<V> node = this.map.get(key);
        if (node == null)
            return null;

        long currentMillis = System.currentTimeMillis();
        long timestamp = node.getTimestamp();
        if ((currentMillis - timestamp)/1000 > this.ttl) {
            this.remove(key);
            System.out.println("returning null");
            return null;
        }
        return node.getValue();
    }

    public void remove(K key)
    {
        this.map.remove(key);
    }

    public int size() {
        return this.map.size();
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Entry<K,Node<V>> e: this.map.entrySet()) {
//            result += (e.getKey() + " : " + e.getValue().getValue()) + "\n";
            result += (e.getKey() + " : " + this.get(e.getKey())) + "\n";
        }
        return result;
    }
}
