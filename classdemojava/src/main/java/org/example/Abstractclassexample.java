package org.example;

public class Abstractclassexample {
    public static void main(String[] args) {
        Volvox obj = new Volvox();
        obj.speed();
        obj.modelNumber();
        obj.properties();
    }
}


abstract class Vehicle{
    void speed(){
        System.out.println("maximum speed is: 120km/hr");
    }

    abstract void modelNumber();
}


class Volvo extends Vehicle{

    String vehicleName = "VolvoBus";

    @Override
    void modelNumber() {
        String modelNum = "34"+vehicleName;
        System.out.println(modelNum);
    }
}


class Volvox extends Volvo{
    void properties(){
        System.out.println(super.vehicleName);
    }
}

class Honda extends Vehicle{

    String vehicleName = "HondaHighness";

    @Override
    void modelNumber() {
        String modelNum = "67"+vehicleName;
        System.out.println(modelNum);
    }
}
