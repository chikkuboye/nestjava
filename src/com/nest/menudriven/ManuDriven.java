package com.nest.menudriven;

import com.nest.Billing.Fooditems;

import java.util.Scanner;

public class ManuDriven {
    public static void main(String[] args) {
        int choice;

        while(true)
        {
            System.out.println("select the option");
            System.out.println("1 . add student");
            System.out.println("2. search student");
            System.out.println("3. delete student");
            System.out.println("4.view all student");
            System.out.println("5 .exit");

            Scanner opt = new Scanner(System.in);
            choice = opt.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("add student selected");
                    break;
                case 2:
                    System.out.println("search student selected");
                    break;
                case 3:
                    System.out.println("delete student selected");
                    break;
                case 4:
                    System.out.println("view the students");
                    break;
                case 5:
                    System.exit(0);

            }
        }

    }

}
