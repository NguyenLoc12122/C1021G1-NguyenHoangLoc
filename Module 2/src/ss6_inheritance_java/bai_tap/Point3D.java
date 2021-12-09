package ss6_inheritance_java.bai_tap;

public class Point3D extends Point2D{
    private int z;
    public Point3D(){
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public void getXyz(int x, int y, int z) {
        System.out.print("Array of"+"["+x+"]"+"["+y+"]"+"["+z+"]");
    }



    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ",y" + super.getY() +
                ",z=" + z +
                '}';
    }
}
