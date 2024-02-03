package org.example;

public interface Interfaceexample {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.deliverystatus();
    }
}

interface Food{
    void ingridients();
}

interface Sugar{
    void sugarContent();
}

class CakeDelivery{
    void deliverystatus(){
        System.out.println("Delivered");
    }
}

class Cake extends CakeDelivery implements Food,Sugar{

    @Override
    public void ingridients() {
        System.out.println("fruits");
    }

    @Override
    public void sugarContent() {
        System.out.println("1 mg");
    }
}
