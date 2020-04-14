package oop_test;

import oop.Dad;

public class AbstractionTest {





    public static void main(String[] args) {
        Dad dad=new Dad();
        dad.sleeping();
        dad.talking();
        System.out.println( dad.toString());
        Dad.run();
    }
}
