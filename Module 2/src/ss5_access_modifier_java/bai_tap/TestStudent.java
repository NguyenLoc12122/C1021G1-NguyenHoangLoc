package ss5_access_modifier_java.bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Lộc");
        student1.setClass1("C10");
        System.out.println(student1.getName());
        System.out.println(student1.getClass1());
    }
}
