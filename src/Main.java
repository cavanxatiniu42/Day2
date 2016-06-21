import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int c;
        do {
            System.out.println("1. Convert from degree F to degree C");
            System.out.println("2. Show your BMI");
            System.out.println("3. Show your month");
            System.out.println("4. quit");
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
                case 3:
                    System.out.println("Enter your month: ");
                    Scanner sc4 =new Scanner(System.in);
                    int m = sc4.nextInt();
                    switch (m ){
                        case 0:
                            System.out.println("January");
                            break;
                        case 1:
                            System.out.println("February");
                            break;
                        case 2:
                            System.out.println("March");
                            break;
                        case 3:
                            System.out.println("April");
                            break;
                        case 4:
                            System.out.println("May");
                            break;
                        case 5:
                            System.out.println("June");
                            break;
                        case 6:
                            System.out.println("July");
                            break;
                        case 7:
                            System.out.println("August");
                            break;
                        case 8:
                            System.out.println("September");
                            break;
                        case 9:
                            System.out.println("October");
                            break;
                        case 10:
                            System.out.println("November");
                            break;
                        case 11:
                            System.out.println("December");
                            break;
                    }
//                default:
//                    System.out.println("enter valid choice!");
//                    break;
            }
        } while (c != 4);
    }
}
