package com.company;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int accbal=1000;
        while (true){
            System.out.println("ENTER 1 FOR DEPOSIT \n ENTER 2 FOR WITH DRAW \n ENTER 3 FOR CHECK BLANCE \n ENTER 0 FOR EXIT\n");
            int input= sc.nextInt();
            if (input==0) {
                System.out.println("THANK YOU !");
                break;
            }
            else {
                switch (input) {
                    case 1:
                        System.out.println("ENTER THE AMOUNT TO DEPOSIT");
                        accbal += sc.nextInt();
                        break;
                    case 2:
                        System.out.println("ENTER THE AMOUNT TO WITH DRAW");
                        accbal -= sc.nextInt();
                        break;
                    case 3:
                        System.out.println("YOUR ACCOUT BALANCE IS :");
                        System.out.println(accbal);
                        break;
                }
            }
        }
    }
}
