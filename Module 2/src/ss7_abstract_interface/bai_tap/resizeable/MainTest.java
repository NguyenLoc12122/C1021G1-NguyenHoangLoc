package ss7_abstract_interface.bai_tap.resizeable;

public class MainTest {
    public static void main(String[] args) {
        double percent = Math.random() * 100;
        Shape[]arrays = new Shape[3];
        arrays[0] = new Circle(3.5,"red",true);
        arrays[1] = new Rectangle(2.5,3.6,"yellow",true);
        arrays[2] = new Squares(4.3,"blue",true);
        System.out.println("Trước khi tăng kích thước là : ");
        for (Shape shape : arrays){
            System.out.println(shape);
        }
        System.out.println("Sau khi tăng kích thước là :");
        for (Shape shape : arrays) {
            shape.resize(percent);
            System.out.println(shape);
        }

    }
}
