import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int c;
        do {
            System.out.println("1. Convert from degree F to degree C");
            System.out.println("2. Show your BMI");
            System.out.println("3. quit");
            Scanner sc1 = new Scanner(System.in);
            switch (c = sc1.nextInt()) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    float f = sc.nextFloat();
                    System.out.println("C:" + ((f - 32) / 18000));
                    break;

                case 2:
                    System.out.print("Enter your height: ");
                    Scanner sc2 = new Scanner(System.in);
                    float h = sc2.nextFloat();
                    System.out.println();
                    System.out.print("Enter your weight: ");
                    Scanner sc3 = new Scanner(System.in);
                    float w = sc3.nextFloat();
                    float bmi = w / (h * h);
                    if (bmi < 18.5) {
                        System.out.println("You are so thin");
                    } else if (bmi >= 18.5 && bmi < 25) {
                        System.out.println("You are fit");
                    } else if (bmi >= 25 && bmi < 30) {
                        System.out.println("You are fat");
                    } else if (bmi >= 30) {
                        System.out.println("You are too fat");

                    }
                    break;
                default:
                    System.out.println("enter valid choice!");
            }
        } while (c != 3);
    }
}
