package com.playalong.CollectionFramework;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ListIteratorTest {
    /**
     * [0, 1, 1]
     * [0, 0, 0, 2, 2, 2]
     *
     * [0, 2, 2]
     * [0, 0, 2]
     *
     * count = 0
     * 0 -> 1, 1 -> 2
     * 0 -> 3, 2 -> 3
     *
     * count = 1
     * 1 -> 2
     * 1 -> 3
     *
     * count = 1
     * 0 -> 0
     * 0 -> 3
     *
     * count = 3
     * map empty
     *
     *
     *
     * [0, 1, 1]
     * [0, 0, 0, 2, 2, 2]
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> al = new ArrayList();
        for (int i = 0; i < 10; i++)
            al.add(i);

        System.out.println(al);

        // at beginning ltr(cursor) will point to
        // index just before the first element in al
        ListIterator ltr = al.listIterator();

        // checking the next element availabilty
        while (ltr.hasPrevious())
        {
            //  moving cursor to next element
            int i = (Integer)ltr.previous();

            // getting even elements one by one
            System.out.print(i + " ");

            // Changing even numbers to odd and
            // adding modified number again in
            // iterator
//            if (i%2==0)
//            {
//                i++;  // Change to odd
//                ltr.set(i);  // set method to change value
//                ltr.add(i);  // to add, note that this would not reflect in the current loop
//            }
        }
        System.out.println();
        System.out.println(al);
        for (int i: al) {
            System.out.println(i);
            if (i == 2) {
                //throws ConcurrentModificationException as update to list is not allowed in forEach
                //al.add(12);
            }
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer i1 = 1;
        list.remove(i1); //E remove(Object o)
        list.remove(1); //E remove(int index)
        Collections.synchronizedList(al);
        System.out.println("==================");
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        Iterator<Integer> itr = list1.iterator();
//        list1.add(3);
        while (itr.hasNext()) {
            int i = itr.next();
            System.out.println(i);
            if (i == 2) {
                itr.remove();
            }
        }
        HashMap

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        queue.offer(3, 2, TimeUnit.SECONDS);
        System.out.println(queue);

        LinkedBlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>(2);
        queue1.add(2);
        queue1.add(1);
        System.out.println(queue1);
        queue1.add(2);
    }
}

class AbstractListTest extends AbstractList {

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
