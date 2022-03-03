package oop;



public  class House implements Wifi,Gas{

    String typeOfModem ="xfinitsdhvbshdvcj";


    @Override
    public void gasOnOrOff() {
        if(gasOn){
            System.out.println("House gas is on");
        }
        else {
            System.out.println("Gas is turn off");
        }
    }
    @Override
    public void turnWifiOforTurnOn() {
        if(wifiTurnOn){
            System.out.println("Wifi is on");
        }
        else {
            System.out.println("Wifi is off");
        }
    }
    public static void fiveG() { //it should have a body because it is static
        System.out.println("This is static method in House");
    }
    @Override
    public void geAlt() {
        System.out.println("This is getAlt from house");
    }

    @Override
    public void print() {
        System.out.println(typeOfModem);
    }

    public static void main(String[] args) {
        Wifi wifi= new House();

        wifi.print();
    }







}
