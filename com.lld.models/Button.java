package com.lld.models;
public class Button {

    int floorNumber;
    Car car;

    Button(Car car,int floor){
        this.floorNumber = floor;
        this.car = car;
    }

    public void pressButton(){
        //
        System.out.println("Dispatching the Car");
    }

}
