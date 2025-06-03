public class SpecialRobot extends Robot{

    public SpecialRobot(String n) {
        super(n);
    }
    public SpecialRobot( String name, int positionX, int positionY, int facing) {
        super(name,positionX,positionY,facing);
    }
    public void turnRight(){
                turnLeft();
                turnLeft();
                turnLeft();
    }
}
