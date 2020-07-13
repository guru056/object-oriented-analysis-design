package com.playalong.ExpiryMapV2;


import java.util.HashMap;
import java.util.Set;

public class ExpiryMap<K,V> extends HashMap {

    private static final long DEFAULT_TTL = 30; //sec
    private long ttl;

    /***************  Constructors   *******************/

    public ExpiryMap(long ttl)
    {
        this.ttl = ttl;
    }

    public ExpiryMap()
    {
        this.ttl = DEFAULT_TTL;
    }

    /***************************************************/

    public V put(Object key, Object value)
    {
        Node<V> node = (Node<V>)super.get(key);

        if (node == null) {
            Node newNode = new Node(value, System.currentTimeMillis());
            super.put(key, newNode);
            return null;
        }

        V oldValue = node.getValue();
        node.setTimestamp(System.currentTimeMillis());
        node.setValue((V) value);

        super.put(key, node);
        return oldValue;
    }

    public V get(Object key)
    {
        Node<V> node = (Node<V>) super.get(key);
        if (node == null)
            return null;

        long currentMillis = System.currentTimeMillis();
        long timestamp = node.getTimestamp();
        if ((currentMillis - timestamp)/1000 > this.ttl) {
            this.remove(key);
            return null;
        }
        return node.getValue();
    }

    @Override
    public String toString() {
        String result = "";
        Set<K> keySet = super.keySet();
        for(K key: keySet) {
            result += (key + " : " + this.get(key)) + "\n";
        }
        return result;
    }
}
