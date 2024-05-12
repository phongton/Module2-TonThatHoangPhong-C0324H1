package ArrayMethod;

import java.util.Scanner;

public class FindStudent {
    public static void main(String[] args) {
        String[] students = {"phong","ha","anh"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter name:");
        String name = scanner.nextLine();
        boolean Exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals( name) ){
                System.out.println("Tên của học sinh có trong danh sách "+name+"is"+i);
                Exist = true;
                break;
            }
            
        }
        if(!Exist){
            System.out.println("không tìm thấy "+ name+" trong danh sach");
        }
    }
}
