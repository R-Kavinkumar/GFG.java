package com.company;

import java.util.Scanner;

public class PRIME_PIN {
     public static boolean prime(int pin){
         for (int i=2; i<=Math.sqrt(pin);i++){
             return(pin%i == 0 || pin<=1);
         }
         return false;
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("ENTER THE PIN: ");
            int pin = sc.nextInt();
            if (prime(pin)) {
                System.out.println("OPPS! WRONG PASSWORD \n TRY AGAIN");
            }
            else {
                System.out.println("HELLO THERE ! YOU CAN ENTER IN HOME ");
                break;
            }
        }
    }
}