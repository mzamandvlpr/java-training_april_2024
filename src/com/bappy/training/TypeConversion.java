package com.bappy.training;

public class TypeConversion {
    public static void main(String[] args) {

    /*Conversion happen when
      1. type compatible
            2. destination type> source type*/

        //widening -implicit type
        //narrowing- explicit
        // narrowing must need to do the casting.
        byte a = 20;
        double b = a;
        System.out.println(b);
    }

}
