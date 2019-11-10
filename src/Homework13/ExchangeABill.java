package Homework13;

import java.util.Scanner;

public class ExchangeABill {
    public void exchangeABill(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of money:");

        String amount = scanner.next();
            int result = Integer.parseInt(amount);
        if (result>=1000) {
            while (result >= 1000) {
                result = result - 1000;
                System.out.println(1000);
            }
        }


        if (result>=500) {
                while (result >= 500) {
                    result = result - 500;
                    System.out.println(500);
                }
            }


            if (result>=200) {
                while (result >=200) {
                    result = result - 200;
                    System.out.println(200);
                }
            }
            if (result>=100) {
                while (result >= 100) {
                    result = result - 100;
                    System.out.println(100);
                }
            }
            if (result>=50) {
                while (result >= 50) {
                    result = result - 50;
                    System.out.println(50);
                }
            }
            if (result>=20) {
                while (result >= 20) {
                    result = result - 20;
                    System.out.println(20);
                }
            }
            if (result>=10) {
                while (result >= 10) {
                    result = result - 10;
                    System.out.println(10);
                }
            }

            if (result>=5) {
                while (result >= 5) {
                    result = result - 5;
                    System.out.println(5);
                }
            }
            if (result>=2) {
                while (result >= 2) {
                    result = result - 2;
                    System.out.println(2);
                }
            }
            if (result>=1) {
                while (result >= 1) {
                    result = result - 1;
                    System.out.println(1);
                }
            }else {
                System.out.println("END");
            }





    }

}
