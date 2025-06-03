public class Robot {
    private String name;
    private int positionX;
    private int positionY;
    public final static int NORTH = 1, EAST = 2, SOUTH = 3, WEST = 4;
    private int facing;

    public Robot(String n) {
        this.name=n;
        this.positionX=0;
        this.positionY=0;
        this.facing=NORTH;
    }

    public Robot(String name, int positionX, int positionY, int facing) {
        this.name = name;
        if(positionX<0){
            this.positionX=0;
        }
        else {
            this.positionX = positionX;
        }
        if(positionY<0){
            this.positionY=0;
        }
        else {
            this.positionY = positionY;
        }
        if(facing<1||facing>4){
            this.facing=NORTH;
        }
        else {
            this.facing = facing;
        }
    }

    public String getName() {
        return name;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getFacing() {
        return facing;
    }
    public String getFacingName() {
       switch (facing){
           case 1:
               return "NORTH";
           case 2:
               return "EAST";
           case 3:
               return "SOUTH";
           case 4:
               return "WEST";
       }
        return null;
    }


    @Override
    public String toString() {
        return '"'+name+','+" ("+positionX+','+positionY+"), "+getFacingName()+'"';
    }
    public void move(){
        switch (this.facing){
            case 1:
                this.positionY++;
                break;
            case 2:
              this.positionX++;
              break;
            case 3:
             if(positionY>=1){
                 this.positionY--;
             }
             break;
            case 4:
                if (positionX>=1){
                    this.positionX--;
                }
                break;
        }
    }
    public void turnLeft(){
        switch (facing){
            case 1:
                facing=4;
                break;
            case 2, 3, 4:
                facing--;
                break;

        }

    }
}
