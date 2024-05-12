package ArrayMethod;

import java.util.Scanner;

public class ChangeCelius {
    static ChangeCelius changeCelius = new ChangeCelius();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double fah;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1.Fah to celsius");
            System.out.println("2.Celsius to Fah ");
            System.out.println("0.Exit");
            System.out.println("Enter your choice :  ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter fah : ");
                    fah = scanner.nextDouble();
                    System.out.println("Celsius is : " + changeCelius.FahToCelsius(fah));
                    break;
                case 2:
                    System.out.println("enter celsius : ");
                    celsius = scanner.nextDouble();
                    System.out.println("Fah is : " + changeCelius.CelToFah(celsius));
                    break;
                case 0:
                    System.exit(0);


            }
        } while (true);

    }

    public double FahToCelsius(double fah) {
        return (5.0 / 9) * (fah - 32);

    }

    public double CelToFah(double cel) {
        return (9.0 / 5) * cel + 32;

    }

}
