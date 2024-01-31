package org.example;

import org.example.controllers.Myutilities;

public class Main {

    public static void main(String[] args) {
        Myutilities myutilities1 = new Myutilities();
        Myutilities myutilities2 = new Myutilities();
//        myutilities1.a += 1;
//        System.out.println(myutilities1.a);
//
//
//
//        myutilities2.a += 3;
//        System.out.println(myutilities2.a);

        myutilities1.b += 10;

        System.out.println(myutilities1.b);



        myutilities2.b += 20;
        System.out.println(myutilities2.b);
    }
}