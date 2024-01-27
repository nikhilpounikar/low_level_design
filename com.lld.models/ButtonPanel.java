package com.lld.models;
import java.util.List;
import java.util.ArrayList;

public class ButtonPanel {

    List<Button> buttonList;
    Car car;

    ButtonPanel(Car car){
        this.car = car;
        this.buttonList = new ArrayList<>();
    }

}
