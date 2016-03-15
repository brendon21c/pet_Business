package com.Brendon;


import java.util.ArrayList;
import java.util.LinkedList;

public class Pet {

    private LinkedList name = new LinkedList();
    private LinkedList animal = new LinkedList();
    private LinkedList address = new LinkedList();
    private String day;
    private LinkedList visit = new LinkedList();

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    /*
    This next block creates lists for the user inputs from the Main class.
     */
    public void Customer(String name, String animal, int visit, String address ) {

        //this.name = new LinkedList();
        //this.animal = new LinkedList();
        //this.address = new LinkedList();
        //this.visit = new LinkedList();
        this.name.add(name);
        this.animal.add(animal);
        this.address.add(address);
        this.visit.add(visit);



        //System.out.println(": " + name + " the " + animal + " " + visit + " time. Address: "
                //+ address);

    }

    public void printCust() { // Displays the information. called from the Main class.

        int visitCount = 0;

        for (int x = 0 ; x < this.name.size(); x++) {

            String petName = this.name.get(x).toString();
            String petType = this.animal.get(x).toString();
            String petAddress = this.address.get(x).toString();
            int visitNum = Integer.parseInt(this.visit.get(x).toString());
            int runningTotal = Integer.parseInt(this.visit.get(x).toString());
            visitCount += runningTotal;

            if (visitNum == 1) {

                System.out.println(petName + " the " + petType + " " + visitNum
                        + " time. Address: " + petAddress + "\n");
            } else if (visitNum > 1 && visitCount < 6) {

                System.out.println(petName + " the " + petType + " " + visitNum
                        + " times. Address: " + petAddress + "\n");

            } else if (visitCount >= 6) {

                System.out.println("You cannot do that many visits in one day.");

            }


        }

    }
}
