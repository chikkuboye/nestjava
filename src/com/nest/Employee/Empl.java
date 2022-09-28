package com.nest.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Empl {
    public static void main(String[] args) {
        int choice;
        String empName;
        ArrayList<String> empList = new ArrayList<>();
        while(true)
        {
            Scanner obj = new Scanner(System.in);


            System.out.println("enter the employee");
            System.out.println("view the employee");
            System.out.println("exit");
            choice = obj.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Add the employee");
                    empName = obj.next();
                    empList.add(empName);
                    break;
                case 2:
                    if(empList.size()==0)
                    {
                        System.out.println("No employee added");
                    }
                    else
                    {
                        System.out.println(empList);
                    }
                    // System.out.println(empList);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
