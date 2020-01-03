package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer integer = 54; //new Integer(54)
        Double doubleValue = 12.25; //new Double(12.25)

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(i); //Integer.valueOf(i)
        }

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56;  //Integer.valueOf(56);
        int myInt = myIntValue;  //myIntValue.intValue()

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl); //myDoubleValues.add(Double.valueOf(dbl))
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i); //myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
