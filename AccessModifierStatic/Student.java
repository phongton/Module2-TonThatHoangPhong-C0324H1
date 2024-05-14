package AccessModifierStatic;

public class Student {
    private int rollno;
    private String name;
    private static String college ="BBDIT";
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;

    }
    static void change(){
        college = "CodeGym";
    }
    void show(){
        System.out.println(rollno+" "+college+" "+name);
    }

}
class Show{
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1, "B");
        Student s2 = new Student(2, "c");
        Student s3 = new Student(3, "d");
        s1.show();
        s2.show();
        s3.show();
    }
}
