package ss6_inheritance_java.bai_tap;

public class Point2D {
    private int x;
    private int y;
    public Point2D(){
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void getXy(){
        System.out.print("Array of"+"["+x+"]"+"["+y+"]");
    }
    public void setXy(int x,int y) {
        System.out.println("Array of" + "[" + x + "]" + "[" + y + "]");

    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
