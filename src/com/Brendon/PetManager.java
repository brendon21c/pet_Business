package com.Brendon;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class PetManager {

    public static void main(String[] args) {

        LinkedList days = new LinkedList(); // sets up the days of the week, I use this to help frame the program.
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");



        for (int x = 0; x < days.size(); x++) { // asks for pet information and prints the schedule for each day.

            Pet petsLog = new Pet();
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            petsLog.setDay(days.get(x).toString());

            while (true) {


                while (true) {

                    System.out.println("For " + petsLog.getDay() + ": \n");
                    System.out.println("Enter the name of the pet: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the species of the pet: ");
                    String type = scanner.nextLine();
                    System.out.println("How many visits does the pet need: ");
                    int visit = scanner1.nextInt();
                    System.out.println("Enter the address of the pet: ");
                    String address = scanner.nextLine();

                    petsLog.Customer(name, type, visit, address);

                    System.out.println("Enter another client? ");
                    String answer = scanner.nextLine();

                    if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {

                        continue;

                    } else {

                        break;
                    }

                }

                System.out.println(petsLog.getDay() + ": ");

                petsLog.printCust();
                break;
            }



        }



    }
}
