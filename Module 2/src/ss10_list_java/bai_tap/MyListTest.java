package ss10_list_java.bai_tap;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        Student a = new Student(001,"Hoàng");
        Student b = new Student(002,"Đông");
        Student c = new Student(003,"Khoa");
        Student d = new Student(004,"Linh");
        Student e = new Student(005,"Lộc");
        MyList<Student> student = new MyList<>();


        student.add(a);
        student.add(b);
        student.add(c);
        student.add(d);
        student.add(e);

        System.out.println(student.getSize());
        System.out.println(student.get(2).getId());
        System.out.println(student.get(2).getName());
        System.out.println(student.indextOf(d));
        System.out.println(student.indextOf(e));
        System.out.println(student.contain(d));
        System.out.println(student.contain(e));



    }
}
