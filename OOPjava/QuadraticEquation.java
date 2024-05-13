package OOPjava;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b ,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }
    public  double getDiscriminant(){

        double delta = (getB() * 2) - (4 * getA() * getC());
        return delta;
    }
    public double getRoot1(){
        double r1= (-getB()+Math.sqrt((Math.pow(getB(),2)-(4*getA()*getC()))))/2*getA();
        return r1;
    }
    public double getRoot2(){
        double r2=(-getB()-Math.sqrt(Math.pow(getB(),2)-(4*getA()*getC())))/2*getA();
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        double a = scanner.nextDouble();
        System.out.println("nhap b");
        double b = scanner.nextDouble();
        System.out.println("nhap c");
        double c = scanner.nextDouble();
        QuadraticEquation quad = new QuadraticEquation(a,b,c);
        if (quad.getDiscriminant()>0){
            System.out.println("the equation has two root : "+ quad.getRoot1()+" và "+ quad.getRoot2());
        }else if (quad.getDiscriminant()==0){
            System.out.println("the equation has one root : "+ quad.getRoot1());
        }else {
            System.out.println(" the equation has no real root");
        }
    }



}
