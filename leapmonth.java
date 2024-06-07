/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class leapmonth {
    public boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0);
        isLeapMonth = isLeapMonth || (year % 400 == 0);
        return isLeapMonth;
    }

    public static void main(String[] args) {
        leapmonth leapMonthDetector = new leapmonth();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Leap Month Detective!");
        System.out.println("Can you determine if a given month is a leap month in Codeopolis?");
        System.out.println("Let's find out!\n");

        while (true) {
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            System.out.print("Enter a month (1-12): ");
            int month = scanner.nextInt();

            boolean isLeap = leapMonthDetector.isLeapMonth(year, month);
            String leapStatus = isLeap ? "is" : "is not";
            System.out.println("The month " + month + " in year " + year + " " + leapStatus + " a leap month.\n");

            System.out.print("Do you want to play again? (yes/no): ");20
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing Leap Month Detective! Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}

