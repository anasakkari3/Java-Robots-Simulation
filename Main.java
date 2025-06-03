import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MoreSpecialRobot m1=new MoreSpecialRobot("to0l");
        m1.move();
        m1.move();
        m1.move();
        m1.move();
        m1.move();
        m1.move();
        System.out.println(m1);//to0l, (0,6), NORTH, Battery: 94%
        System.out.println(m1.getBattery());//94
    }
}