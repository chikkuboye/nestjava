package com.nest.calculator;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int x,y,z;
        int choose;
        while(true)
        {
            Scanner num = new Scanner(System.in);
            x = num.nextInt();
            y = num.nextInt();
            choose = num.nextInt();
            switch (choose)
            {
                case 1:
                    z = x + y;
                    System.out.println(z);
                    break;
                case 2:
                    z = x - y;
                    System.out.println(z);
                    break;
                case 3:
                    z = x * y;
                    System.out.println(z);
                    break;
                case 4:
                    System.exit(0);


            }
        }
    }
}
