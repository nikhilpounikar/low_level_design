package com.lld.models;

public class FloorButtonPanel extends ButtonPanel{


    FloorButtonPanel(Car car,int floorNumber){
        //floor button panel only consist of up and down button;
        super(car);
        super.buttonList.add(new Button(car,floorNumber));

    }

}
