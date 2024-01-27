package com.lld.models;

public class CarButtonPanel extends ButtonPanel{

    CarButtonPanel(Car car,int floorCount){

        super(car);

        for(int floor =0; floor<floorCount; floor++){
            super.buttonList.add(new Button(car,floor));
        }
    }
}
