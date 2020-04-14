package oop_test;

import oop.House;
import oop.Wifi;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {




    public static void main(String[] args) {
        House house=new House();
        house.gasOnOrOff();
        house.geAlt();
        house.turnWifiOforTurnOn();
        House.fiveG();
        int num = 3;
        Wifi hous = new House();
        hous.turnWifiOforTurnOn();
        hous.geAlt();
        List list= new ArrayList();


    }
}
