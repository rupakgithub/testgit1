package org.example;

public class Inheritanceexample {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.printtotallegs();
    }
}

class Animal {
    protected int legs = 4;
}

class Tiger extends Animal{
    String color = "Yellow";
    double height = 4.2;
}


class Rabbit extends Animal{

    int legs = 2;
    String color = "Yellow";
    double height = 4.2;

    void printtotallegs(){
        System.out.println("Default legs: "+legs);
        System.out.println("Legs in parent: "+super.legs);
        System.out.println("Legs in child: "+this.legs);
    }
}

class Elephant extends Animal{
    String color = "Black";
    double height = 10.5;
    boolean trunk = true;
}
