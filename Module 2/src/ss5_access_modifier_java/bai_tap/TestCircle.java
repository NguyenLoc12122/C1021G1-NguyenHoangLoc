package ss5_access_modifier_java.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle scanner = new Circle();
        System.out.println("Bán kính hình tròn là :" + scanner.getRadius());
        System.out.println("Diện tích hình tròn là :" + scanner.getArea());
        System.out.println("Màu của hình tròn là :" + scanner.getColor());
    }
}
