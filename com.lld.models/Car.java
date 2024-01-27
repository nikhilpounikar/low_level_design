

public class Car{

    private int currentFloor;
    //private boolean isMovingDown;
    private ButtonPanel buttonPanel;
    private Door door;


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

    public Door

}