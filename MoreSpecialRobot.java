public class MoreSpecialRobot extends SpecialRobot{
    private int battery;
    public MoreSpecialRobot(String n) {
        super(n);
        this.battery=100;
    }
    public MoreSpecialRobot(String name, int positionX, int positionY, int facing){
        super(name,positionX,positionY,facing);
        this.battery=97;

    }

    public int getBattery() {
        return battery;
    }
    public void move(){
        if (this.battery>=1){
          super.move();
          this.battery--;
        }
    }

    @Override
    public String toString() {
        return '"'+super.getName()+','+" ("+super.getPositionX()+','+super.getPositionY()+"), "+
                super.getFacingName()+", Battery: "+this.battery+"%\"";
    }
}
