package AccessModifierStatic;

public class Student2 {
    private String name = "john";
    private String classes = "CO3";
    public Student2(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
class Test{
    public static void main(String[] args) {

            Student2 test = new Student2();
            test.setName("phong");
            test.setClasses("C03");
            System.out.println(test.getClasses()+test.getName());
        }

    }

