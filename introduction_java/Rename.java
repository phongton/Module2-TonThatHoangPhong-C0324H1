
package introduction_java;
import java.util.Scanner;
public class Rename {

    private static final String[] ones = {
             "","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    private static final String[] teens = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
             " "," ","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int number) {
        if (number < 0 || number > 999) {
            return "Number out of range";
        }

        if (number < 10) {
            return ones[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + ones[number % 10] : "");
        } else {
            return ones[number / 100] + " hundred" + (number % 100 != 0 ? " and " + convert(number % 100) : "");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 999: ");
        int number = scanner.nextInt();
        System.out.println("Number in words: " + convert(number));
    }
}
