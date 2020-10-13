package com.playalong.HashmapImplementation;

import java.util.Objects;

public class HashMap<K,V> {

    private static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private int initialCapacity;
    private float loadFactor;
    private int size;
    private Node[] nodes;

    /***************  Constructors   *******************/
    public HashMap() {
        this.initialCapacity = DEFAULT_INITIAL_CAPACITY;
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        this.nodes = new Node[this.initialCapacity];
        this.size = 0;
    }

    public HashMap(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        this.nodes = new Node[this.initialCapacity];
        this.size = 0;
    }

    public HashMap(int initialCapacity, float loadFactor) {
        this.initialCapacity = initialCapacity;
        this.loadFactor = loadFactor;
        this.nodes = new Node[this.initialCapacity];
        this.size = 0;
    }

    /***************************************************/


    /**
     * put -- Add a key value pair in the map
     * @param key
     * @param value
     */
    public void put(K key, V value)
    {
        int hashIndex = getHashIndex(key);
        Node<K,V> node = this.nodes[hashIndex];

        if (node == null) {
            this.nodes[hashIndex] = new Node(key, value);
            this.size++;
            return;
        }

        Node prev = node;
        while (node != null) {
            if (node.key.equals(key)) {
                node.setValue(value);
                return;
            }
            prev = node;
            node = node.next;
        }
        prev.next = new Node(key, value);
        this.size++;

        if (this.getCurrentLoadFactor() > DEFAULT_LOAD_FACTOR) {
            rehash();
        }
        return;
    }

    /**
     * get -- Get value for key
     * @param key
     * @return
     */
    public V get(K key)
    {
        int hashIndex = getHashIndex(key);

        Node<K,V> node = this.nodes[hashIndex];
        if (this.nodes[hashIndex] == null){
            return null;
        }

        while (node != null) {
            if (node.key.equals(key)) {
                return node.getValue();
            }
            node = node.next;
        }
        return null;
    }

    /**
     * remove -- remove a key
     * @param key
     */
    public void remove(K key)
    {
        int hashIndex = getHashIndex(key);

        Node<K,V> node = this.nodes[hashIndex];
        if (node == null)
            return;

        Node prev = node;
        while (node != null) {
            if (node.key.equals(key)) {
                prev.next = node.next;
                node.next = null;
                this.size--;
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    /**
     *
     * @param key
     * @return
     */
    private int hash(K key)
    {
        return Objects.hashCode(key);
    }

    /**
     *
     * @param key
     * @return
     */
    private int getHashIndex(K key)
    {
        return hash(key) & (this.nodes.length-1);
    }

    /**
     *
     * @return
     */
    public int size()
    {
        return size;
    }

    /**
     * rehash when loadFactor is breached
     */
    public void rehash()
    {
        Node[] tmp = this.nodes;

        int newSize = this.nodes.length * 2;
        this.nodes = new Node[newSize];
        this.size = 0;

        for (Node node: tmp) {
            while (node != null) {
                this.put((K)node.getKey(), (V)node.getValue());
                node = node.next;
            }
        }
    }

    /**
     *
     * @return
     */
    private float getCurrentLoadFactor()
    {
        return  (float) (this.size / this.nodes.length);
    }

    @Override
    public String toString() {
        String result = "";
        for(Node node: this.nodes) {
            while (node != null) {
                result += node.getKey().toString() + " : " + node.getValue().toString() + "\n";
                node = node.next;
            }
        }
        return result;
    }

}
