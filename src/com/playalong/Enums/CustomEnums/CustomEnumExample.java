package com.playalong.Enums.CustomEnums;

public class CustomEnumExample {
    public static void main(String[] args) {
//        TrafficSignal[] signals = TrafficSignal.values();
//
//        for (TrafficSignal signal : signals)
//        {
//            // use getter method to get the value
//            System.out.println("name : " + signal.name() +
//                    " action: " + signal.getAction() + " , ordinal : " + signal.ordinal() );
//        }
//
//        StringBuffer sbf = new StringBuffer("Geeksforgeeks");
//        System.out.println("String buffer = " + sbf);
//
//        // Here it appends the CodePoint as
//        // String to the string buffer
//        sbf.appendCodePoint(65);

//        {
//            int x = 5;
//            {
//                int x = 10;
//                System.out.println(x);
//            }
//        }
        Car c1 = new Car(101, 1);
        Car c2 = new Car(202, 2);
//        swap(c1, c2);
        c1 = c2;
        c1.print();
        c2.print();

    }

    public static void swap(Car c1, Car c2)
    {
//        Car temp = c1;
        c1 = c2;
//        c2 = temp;
    }
}


enum TrafficSignal
{
    // This will call enum constructor with one
    // String argument
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

    // declaring private variable for getting values
    private String action;

    // getter method
    public String getAction()
    {
        return this.action;
    }

    // enum constructor - cannot be public or protected
    private TrafficSignal(String action)
    {
        this.action = action;
    }
}

class Car
{
    int model, no;

    // Constructor
    Car(int model, int no)
    {
        this.model = model;
        this.no = no;
    }

    // Utility method to print Car
    void print()
    {
        System.out.println("no = " + no +
                ", model = " + model);
    }
}