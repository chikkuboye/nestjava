package com.nest.Billing;

import java.util.ArrayList;
import java.util.Scanner;


public class Hotel {
    public static void main(String[] args) {
        Fooditems fooditems = new Fooditems(10, 12, 8, 15);
        Fooditems TakeAway = new Fooditems(10, 12, 15, 14);
        ArrayList<String> buyed = new ArrayList<>();
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> pro = new ArrayList<>();
        int choice;
        int choice1;
        // int p;
        int total = 0;
        items.add("1: tea");
        items.add("2: coffee");
        items.add("3: idli");
        items.add("4: dosa");
        System.out.println("1 : dinning");
        System.out.println("2 : takeaway");

        System.out.println(items);
        while(true)
        {
            Scanner obj = new Scanner(System.in);
            choice = obj.nextInt();
            choice1 = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Dinning");
                    switch (choice1) {
                        case 1:
                            // Scanner pur = new Scanner(System.in);
                            int buy = obj.nextInt();

                            int p = buy * fooditems.getTea();
                            total = total + p;
                            pro.add(total);
                            buyed.add("tea");
                            System.out.println("item purchased" + buyed);
                            System.out.println("item total price" + pro);
                            break;
                        case 2:

                            buy = obj.nextInt();
                            p = buy * fooditems.getCoffee();
                            total = total + p;
                            pro.add(p);
                            buyed.add("coffee");
                            System.out.println("item purchased" + buyed);
                            System.out.println("item total price" + pro);
                            break;
                        case 3:

                            buy = obj.nextInt();
                            p = buy * fooditems.getDosa();
                            total = total + p;
                            pro.add(p);
                            buyed.add("dosa");
                            System.out.println("item purchased" + buyed);
                            System.out.println("item total price" + pro);
                            break;
                        case 4:
                            buy = obj.nextInt();
                            p = buy * fooditems.getIdli();
                            total = total + p;
                            pro.add(p);
                            buyed.add("idli");
                            System.out.println("item purchased" + buyed);
                            System.out.println("item total price" + pro);
                            break;


                    }
                case 2:
                    System.out.println("Takeaway");
                    switch (choice1) {
                        case 1:
                            // Scanner pur = new Scanner(System.in);
                            int buy = obj.nextInt();

                            int p = buy * TakeAway.getTea();
                            total = total + p;
                            pro.add(p);
                            buyed.add("tea");
                            System.out.println("item purchased" + buyed);
                            System.out.println("item total price" + pro);
                            break;
                        case 2:

                            buy = obj.nextInt();
                            p = buy * TakeAway.getCoffee();
                            total = total + p;
                            pro.add(p);
                            buyed.add("coffee");
                            System.out.println("item purchased" + buyed);
                            System.out.println("item total price" + pro);
                            break;
                        case 3:

                            buy = obj.nextInt();
                            p = buy * TakeAway.getDosa();
                            total = total + p;
                            pro.add(p);
                            buyed.add("dosa");
                            System.out.println("item purchased" + buyed);
                            System.out.println("item total price" + pro);
                            break;
                        case 4:
                            // Scanner pur = new Scanner(System.in);
                            buy = obj.nextInt();
                            p = buy * TakeAway.getIdli();
                            total = total + p;
                            pro.add(p);
                            buyed.add("idle");
                            System.out.println("item purchased" + buyed);
                            System.out.println("item total price" + pro);
                            break;
                    }

            }
        }



    }
}

