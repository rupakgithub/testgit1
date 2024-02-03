package org.example.api;

public class Constrctorexample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(7);

    }
}

class Vehicle{
    private int num;
    Vehicle(int num){
        this.num = num;
    }
}
