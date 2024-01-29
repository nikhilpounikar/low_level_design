package com.lld.models;
import com.lld.models.ButtonPanel;

public class Car{

    private int currentFloor;
    //private boolean isMovingDown;
    private ButtonPanel buttonPanel;
    private Door door;



    Car(int totalFloor){
        this.buttonPanel = new CarButtonPanel(this,totalFloor);
        this.door = new CarDoor();
        this.currentFloor = 0;
    }


    public void moveUp(int toFloor){
        move(toFloor,false);
    }

    public void moveDown(int toFloor){

        this.move(toFloor,true);
    }


    private void move(int toFloor,boolean isMovingDown){

        while(this.currentFloor != toFloor){

            if(isMovingDown){
                this.currentFloor--;
            }else{
                this.currentFloor++;
            }
        }

    }

    public int getCurrentFloor(){

        return this.currentFloor;
    }

    public ButtonPanel getButtonPanel(){
        return this.buttonPanel;
    }

    public Door getDoor(){

        return this.door;
    }

    public void setCurrentFloor(int currentFloor){

        this.currentFloor = currentFloor;
    }

    public void setButtonPanel(ButtonPanel buttonPanel){
        this.buttonPanel = buttonPanel;
    }

    public void setDoor(Door door){

        this.door = door;
    }

}