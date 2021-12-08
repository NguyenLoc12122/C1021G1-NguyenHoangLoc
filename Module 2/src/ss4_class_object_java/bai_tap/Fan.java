package ss4_class_object_java.bai_tap;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed;
    private boolean on = false ;
    private double  radius = 5 ;
    private String color = "blue";

    public int getSlow(){
        return this.slow;
    }
    public int getMEDIUM(){
        return this.medium;
    }
    public int getFAST(){
        return this.fast;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
        this.speed = this.slow ;
    }
    public Fan(int speed , boolean on ,double radius , String color){
        this.speed = this.slow ;
        this.on = on ;
        this.radius = radius ;
        this.color = color;

    }
    public String toString(){
        if (this.on == true){
            return "Tốc Độ :" + this.speed + " - " + " color :" + this.color + " - " + " radius : " + this.radius + "fan is on" ;
        }
        return "fan is off" ;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3 ,false , 5, "blue");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(3 ,true , 5, "blue");
        System.out.println(fan2.toString());
    }
}

