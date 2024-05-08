package introduction_java;



import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("nhap can nang cua ban : ");
        weight = scanner.nextDouble();
        System.out.println("nhap chieu cao cua ban : ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Diễn dịch\n");
        if(bmi<18){
            System.out.printf("%-20s%s",bmi,"quá gầy");
        }else if(bmi<25.0) {
            System.out.printf("%-20s%s", bmi, "bin thường");
        }else if(bmi<30.0) {
            System.out.printf("%-20s%s", bmi, "hơi béo");
        }else {
            System.out.printf("%-20s%s", bmi, "béo");
        }


    }



}
