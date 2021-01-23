public class Student {
    public static int count = 0;

    public String name;
    public Student() {
        count++;    //在没有歧义时，不需要写全称，Student.count++;
        name = "A"; // 在没有歧义时，不需要写全称，this.name = "A";
    }

    public static void main(String[] args) {
        System.out.println(Student.count);
        Student a = new Student();
        System.out.println(Student.count);
        Student b = new Student();
        System.out.println(Student.count);
        Student c = new Student();
        System.out.println(Student.count);
        Student d = new Student();
        System.out.println(Student.count);
    }
}
