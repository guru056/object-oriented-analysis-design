package com.playalong.CircularArray;

public class CircularArray<T> {
    final int DEFAULT_CAPACITY = 100;

    int capacity;
    int front;
    int rear;
    int size;
    T[] arr;

    public CircularArray() {
        capacity = DEFAULT_CAPACITY;
        front = rear = -1;
        size = 0;
        arr = (T[]) new Object[capacity];
    }

    public CircularArray(int capacity) {
        this.capacity = capacity;
        front = rear = -1;
        size = 0;
        arr = (T[]) new Object[capacity];
    }

    public void addFirst(Object item) {
        if (isFull())
            return;
        if (isEmpty()) {
            front = rear = 0;
            arr[front] = (T) item;
            size++;
            return;
        }
        if (front == 0)
            front = capacity - 1;
        else
            front = front-1;
        arr[front] = (T) item;
        size++;
    }

    public void addLast(Object item) {
        if (isFull())
            return;
        if (isEmpty()) {
            front = rear = 0;
            arr[front] = (T) item;
            size++;
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = (T) item;
        size++;
    }

    public T removeFirst() {
        if (isEmpty())
            return null;
        T item = arr[front];
        if (hasSingleElement()) {
            front = rear = -1;
        } else {
            front = ( front + 1 ) % capacity;
        }
        size--;
        return item;
    }

    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        T item = arr[rear];
        if (hasSingleElement()) {
            front = rear = -1;
        } else if (rear == 0){
            rear = capacity - 1;
        } else {
            rear = rear - 1;
        }
        size--;
        return item;
    }


    @Override
    public String toString() {
        String resultString = "[ " ;
        int pointer = front;
        while (pointer != rear) {
            resultString += arr[pointer].toString() + " ";
            pointer = (pointer + 1) % capacity;
        }
        resultString += " ]";

        return resultString;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean hasSingleElement() {
        return size == 1;
    }
}
