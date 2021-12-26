package ss18_string_regex.bai_tap;

public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validClass = new String[] {"C1021G","A6789H","P3456I"};
    public static final String[] invalidClass= new String[] {"M0318G","P0323A","C1021G1"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String classname:validClass) {
            boolean isvalid = classExample.validate(classname);
            System.out.println("Class is " + classname+"is valid "+isvalid);
        }
        for (String classname:invalidClass){
            boolean isvalid = classExample.validate(classname);
            System.out.println("Email is"+ classname+"is valid"+ isvalid);
        }
    }
}
