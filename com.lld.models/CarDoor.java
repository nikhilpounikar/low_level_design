package com.lld.models;

public class CarDoor implements Door{

    private boolean isOpened;

    CarDoor(){
        this.isOpened = false;
    }

    @Override
    public void open() {
        System.out.println("Opening car door");
    }

    @Override
    public void close() {
        System.out.println("Closing car door");
    }
}
