package ss6_inheritance_java.bai_tap;

public class Point {
    private float x;
    private float y;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXy() {
        float[] Arr = {this.x, this.y};
        return Arr;
    }
    public void setXy(float x,float y){
        float[]Arr={this.x,this.y};
        System.out.println(this.x+"."+this.y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
